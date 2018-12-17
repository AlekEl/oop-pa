package com.codecool.pa.controller;

import com.codecool.pa.model.Mediaitem;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Mediaitem> mediaitemList = new ArrayList<>();

    public void addMediaitem(Mediaitem mediaitem) {
        mediaitemList.add(mediaitem);
    }

    public List<Mediaitem> getMediaitemList() {
        return mediaitemList;
    }
}
