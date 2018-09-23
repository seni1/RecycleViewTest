package com.example.android.recycleviewtest;

import java.util.ArrayList;

public class Model {

    private String title;
    private int number;

    public Model(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public String getName() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    public static ArrayList<Model> createContactList() {
        ArrayList<Model> models = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            models.add(new Model("Model", +i));
        }

        return models;
    }
}
