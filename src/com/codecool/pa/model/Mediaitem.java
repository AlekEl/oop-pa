package com.codecool.pa.model;

public class Mediaitem {
    private int id;
    private String name;
    private String author;
    private String releaseDate;
    private boolean isAvailable;

    public Mediaitem(String name, String author, String releaseDate) {
        id = 0;
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.isAvailable = true;
    }

    public void rentOrReturnItem() {
        this.isAvailable = !this.isAvailable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public boolean getisAvailible() {
        return isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
