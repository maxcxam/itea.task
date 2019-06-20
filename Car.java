package com.itea.maksym.custom;

public class Car implements CarData {
    private String country;
    private String car = null;
    private double engine;
    private double price;

    Car(String country, double engine, double price){
        this.country = country;
        this.engine = engine;
        this.price = price;
    }



    @Override
    public double engineVat() {
        return engine*1000*5.5;
    }

    @Override
    public double countryVat() {
        double ret;
        switch (country){
            case "Poland":
                ret = 1.2;
            case "Chech":
                ret = 1.4;
            case "Germany":
                ret = 1.9;
            default:
                ret = 1;
        }
        return ret;
    }

    public double getEngine() {
        return engine;
    }

    public double getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
