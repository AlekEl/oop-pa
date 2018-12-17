package com.codecool.pa.controller;

import com.codecool.pa.view.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramLoop {
    private View view = new View();
    private Controller controller = new Controller();

    public void mainMenu() {
        while (true) {
            Scanner input = new Scanner(System.in);
            view.initView();
            int option = 0;
            try{
                option = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You must choose a number!");
            }
            switch (option) {
                case 1:
                    view.viewItemList(controller.getMediaitemList());
                    break;
                case 2:
                    String itemType;
                    itemType = view.askForItemType();
                    view.addMediaItem(controller, itemType);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("No such option!");


            }
        }
    }
}
