package com.example.apptracnghiem.model;

public class Category {

    private int id;
    private String name;
    public Category(String ngữ_văn) {
    }

    public Category() {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
