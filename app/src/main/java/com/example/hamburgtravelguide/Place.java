package com.example.hamburgtravelguide;

public class Place {

    private String name;

    private String description;

    private String fullDescription;

    private String address;

    private String number;

    private int imageResourceId;

    public Place(String name, String description, String fullDescription, String address, String number, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.fullDescription = fullDescription;
        this.address = address;
        this.number = number;
        this.imageResourceId = imageResourceId;
    }

    public Place(String name, String description, String fullDescription, String address, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.fullDescription = fullDescription;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getImageSrc() {
        return imageResourceId;
    }
}
