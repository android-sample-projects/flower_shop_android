package com.example.robertpc.flowershoplast.model;

import java.io.Serializable;

/**
 * Created by Robert PC on 4/1/2016.
 */
public class Flower implements Serializable {
    private String title, price;
    private int img;

    public Flower() {}

    public Flower(String title, String price, int img){
        this.title = title;
        this.price = price;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
