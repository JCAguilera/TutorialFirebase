package com.tutorial.firebase;

public class ItemModel {

    private String id;

    String title;
    String desc;

    public ItemModel(String id, String title, String desc) {
        this.id = id;
        this.title = title;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }
}
