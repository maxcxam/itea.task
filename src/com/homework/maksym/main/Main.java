package com.homework.maksym.main;

import com.homework.maksym.DBO.*;
import com.homework.maksym.controllers.*;

import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;


public class Main{
    int car;
    int year;
    int engine;
    int country;

    Main() throws SQLException {
        car = chooseCar();
        year = chooseYear();
    }

    private int chooseCar() throws SQLException{

        Map <Integer, Car> cars = CarDBO.getAllCars();
        System.out.println("Choose car:");
        int start = 999;
        int end = 0;
        for(Map.Entry<Integer, Car> item : cars.entrySet()){
            if(item.getKey()<start)
                start = item.getKey();
            if(item.getKey()>end)
                end = item.getKey();
            System.out.printf("%s:  %s $%g \n", item.getKey(), item.getValue().getName(), item.getValue().getPrice());
        }
        System.out.printf("[%s-%s] : \n", start, end);
        int choose = new Scanner(System.in).nextInt();
        return choose;
    }

    private int chooseYear() throws SQLException {
        Map <Integer, Year> cars = YearDBO.getAllYears();
        System.out.println("Choose year:");
        int start = 999;
        int end = 0;
        for(Map.Entry<Integer, Year> item : cars.entrySet()){
            if(item.getKey()<start)
                start = item.getKey();
            if(item.getKey()>end)
                end = item.getKey();
            System.out.printf("%s:  %s \n", item.getKey(), item.getValue().getYear());
        }
        System.out.printf("[%s-%s] : \n", start, end);
        int choose = new Scanner(System.in).nextInt();
        return choose;
    }


    public static void main(String[] args)  throws SQLException {
       Main m = new Main();
        System.out.println(m.car);
        System.out.println(m.year);
    }
}
