package com.homework.maksym.controllers;

public class Year {
    protected int id;
    protected String year;

    public Year(int id, String year) {
        this.year = year;
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public int getId() {
        return id;
    }
}
