package com.itea.maksym.custom;

public class MainClass {
    BuyCar car = new BuyCar();

    MainClass(){
        car.selectCar(car);
        car.selectEngine(car);
        car.selectFrom(car);
        System.out.println(car);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
