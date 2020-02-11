package com.example.tourguideapplication.module;

public class Place {
    private int name;
    private int discription;
    private int image;
    private int adress;

    public Place(int name, int discription, int image, int adress) {
        this.name = name;
        this.discription = discription;
        this.image = image;
        this.adress = adress;
    }

    public int getName() {
        return name;
    }

    public int getDiscription() {
        return discription;
    }

    public int getImage() {
        return image;
    }

    public int getAdress() {
        return adress;
    }
}
