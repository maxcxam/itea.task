package com.homework.maksym.main;

import com.homework.maksym.Car;
import com.homework.maksym.DBO.CarDBO;
import java.sql.SQLException;
import java.util.Map;

/**
 * CREATE TABLE `cars` (
 * 	`id` INT(11) NOT NULL AUTO_INCREMENT,
 * 	`name` VARCHAR(50) NULL DEFAULT NULL,
 * 	`country` INT(11) NULL DEFAULT NULL,
 * 	`price` FLOAT NULL DEFAULT NULL,
 * 	`engine` FLOAT NULL DEFAULT NULL,
 * 	`year` CHAR(4) NULL DEFAULT NULL,
 * 	PRIMARY KEY (`id`)
 * )
 * COLLATE='utf8_general_ci'
 * ENGINE=InnoDB
 * AUTO_INCREMENT=3
 * ;
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Map <Integer, Car> cars = CarDBO.getAllCars();
        for(Map.Entry<Integer, Car> item : cars.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
        System.out.println(CarDBO.getSingleCar(2).getName());
    }
}
