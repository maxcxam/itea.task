package com.itea.maksym.custom;

import java.util.Scanner;

public class BuyCar extends Car {

    double[] prices = {12500.0, 15000.0, 17200.0};
    String[] cars = {"skoda", "volkswagen", "mercedes"};

    String[] ctrys = {"Poland", "Chech", "Germany"};

    double[] engines = {1.6, 1.8, 1.2};

    BuyCar(){
        super(null,0,0);
    }

    protected Car selectCar(Car car){
        Scanner in = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Select a car:");
            System.out.println("0: skoda(12 500$)");
            System.out.println("1: volkswagen(15 000$)");
            System.out.println("2: mercedes(17 000$)");
            System.out.println("[0-2]: ");
            choise = in.nextInt();
        } while (choise<0 || choise>2);
        car.setPrice(prices[choise]);
        car.setCar(cars[choise]);
        return car;
    }

    protected Car selectFrom(Car car){
        Scanner in = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Select a country:");
            System.out.println("0: Poland");
            System.out.println("1: Chech republic");
            System.out.println("2: Germany");
            System.out.println("[0-2]: ");
            choise = in.nextInt();
        } while (choise<0 || choise>2);

        car.setCountry(ctrys[choise]);
        return car;
    }
    protected Car selectEngine(Car car){
        Scanner in = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Select engine:");
            System.out.println("0: 1.6");
            System.out.println("1: 1.8");
            System.out.println("2: 1.2");
            System.out.println("[0-2]: ");
            choise = in.nextInt();
        } while (choise<0 || choise>2);

        car.setEngine(engines[choise]);
        return car;
    }

    private double calculatePrice(){
        return (getPrice()+engineVat())*countryVat();
    }

    @Override
    public String toString() {
        return "Your vichicle " + getCar() + " with engine " + getEngine() + " from " + getCountry() + " Price is " + getPrice() +
                " cost in Ukraine is " + calculatePrice() ;
    }
}
