package com.codecool.pa.model;

public class ReadableItem extends Mediaitem {

    private int length;

    public ReadableItem(String name, String author, String releaseDate, int length) {
        super(name, author, releaseDate);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void read() {}
}
