package com.homework.maksym;

public class Car {
    protected int id;
    protected String name;
    protected String year;
    protected String country;
    protected double price;
    protected double engine;

    public Car(int id, String name, String year, String country, double price, double engine) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.price = price;
        this.engine = engine;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }

    public double getEngine() {
        return engine;
    }
}
