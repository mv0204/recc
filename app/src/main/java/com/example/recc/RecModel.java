package com.example.recc;

public class RecModel {
    private int img;
    private String txt;

    public int getImg() {
        return img;
    }

    public String getTxt() {
        return txt;
    }

    public RecModel(int img, String txt) {
        this.img = img;
        this.txt = txt;
    }
}
