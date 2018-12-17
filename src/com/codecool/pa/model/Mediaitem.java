package com.codecool.pa.model;

public class Mediaitem {
    private String name;
    private String author;
    private String releaseDate;
    private Status status;

    public Mediaitem(String name, String author, String releaseDate) {
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.status = Status.AVAILABLE;
    }

    public void rentOrReturnItem() {
        if(this.status == Status.AVAILABLE) {
            this.status = Status.RENTED;
        } else {
            this.status = Status.AVAILABLE;
        }
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

    public Status getStatus() {
        return status;
    }
}
