package com.codecool.pa.controller;

import com.codecool.pa.model.Mediaitem;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Mediaitem> mediaitemList = new ArrayList<>();

    public void addMediaitem(Mediaitem mediaitem) {
        int id = 0;
        for(Mediaitem mediaitemInList : mediaitemList) {
            if(mediaitemInList.getId() >= id) id = mediaitemInList.getId() + 1;
        }
        mediaitem.setId(id);
        mediaitemList.add(mediaitem);
    }

    public void removeMediaitemById(int id) {
        Mediaitem mediaitem = null;

        for(Mediaitem mediaitemInList : mediaitemList) {
            if(mediaitemInList.getId() == id) mediaitem = mediaitemInList;
        }
        mediaitemList.remove(mediaitem);
    }

    public Mediaitem getMediaitemById(int id) {
        for(Mediaitem mediaitemInList : mediaitemList) {
            if(mediaitemInList.getId() == id) {
                return mediaitemInList;
            }
        }
        return null;
    }

    public List<Mediaitem> getMediaitemList() {
        return mediaitemList;
    }
}
