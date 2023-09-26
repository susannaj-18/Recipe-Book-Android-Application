package com.example.quirksinthekitchen;

public class Tip {
    private String text;
    private int imageResource;

    public Tip(String text, int imageResource) {
        this.text = text;
        this.imageResource = imageResource;
    }

    public String getText() {
        return text;
    }

    public int getImageResource() {
        return imageResource;
    }
}
