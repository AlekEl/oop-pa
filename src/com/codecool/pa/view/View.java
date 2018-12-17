package com.codecool.pa.view;

import com.codecool.pa.controller.Controller;
import com.codecool.pa.model.Mediaitem;
import com.codecool.pa.model.PlayableItem;
import com.codecool.pa.model.ReadableItem;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner input = new Scanner(System.in);

    public void initView() {
        System.out.println("WELCOME TO MEDIATHEQUE");
        System.out.println("Choose your action:");
        System.out.println("1: View all items");
        System.out.println("2: Add item");
        System.out.println("3: Remove item by Id");
        System.out.println("4: Edit item by Id");
        System.out.println("5: Exit Program");
    }

    public void viewItemList(List<Mediaitem> mediaitemList) {
        for(Mediaitem mediaitem : mediaitemList) {
            System.out.println("------------------------");
            System.out.println("Id: " + mediaitem.getId());
            System.out.println("Name: " + mediaitem.getName());
            System.out.println("Author: " + mediaitem.getAuthor());
            System.out.println("Release date: " + mediaitem.getReleaseDate());
            System.out.println("Is item available: " + mediaitem.getisAvailible());
            if(mediaitem instanceof PlayableItem) {
                System.out.println("Time: " + ((PlayableItem) mediaitem).getTime());
            } else if(mediaitem instanceof ReadableItem) {
                System.out.println("Length: " + ((ReadableItem) mediaitem).getLength());
            }
            System.out.println("------------------------");
        }
    }

    public String askForItemType() {
        String itemType = "";

        while (!itemType.equals("playable") && !itemType.equals("readable")) {
            System.out.println("What is the type of a item you want to add?");
            System.out.println("Type: playable or readable");
            try {
                itemType =  input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid item type!");
            }
            if(!itemType.equals("playable") && !itemType.equals("readable")) System.out.println("Not a valid item type!");
        }

        return itemType;
    }

    public void addMediaItem(Controller controller, String itemType) {
        String name;
        String author;
        String releaseDate;
        Mediaitem mediaitem = null;

        try{
            System.out.println("New items name: ");
            name = input.nextLine();
            System.out.println("Authors name: ");
            author = input.nextLine();
            System.out.println("Release date: ");
            releaseDate = input.nextLine();
            if(itemType.equals("playable")) {
                System.out.println("Time: ");
                int time = input.nextInt();
                mediaitem = new PlayableItem(name, author, releaseDate, time);
            } else if(itemType.equals("readable")) {
                System.out.println("Length: ");
                int length = input.nextInt();
                mediaitem = new ReadableItem(name, author, releaseDate, length);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid data type!");
        }
        controller.addMediaitem(mediaitem);

    }
}
