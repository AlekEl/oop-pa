package com.codecool.pa.model;

public class PlayableItem extends Mediaitem {

    private int time;

    public PlayableItem(String name, String author, String releaseDate, int time) {
        super(name, author, releaseDate);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void play() {}

}
