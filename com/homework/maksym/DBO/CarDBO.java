package com.homework.maksym.DBO;

import com.homework.maksym.Car;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CarDBO {


    public CarDBO(){
    }

    public static Map<Integer, Car> getAllCars() throws SQLException {
        Map<Integer, Car> cars = new HashMap<Integer, Car>();

        QueryDBO q = new QueryBuider();
        q.select("*");
        q.from("cars");
        ResultSet rs = q.getRes();

        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2); //name
            String country = rs.getString(3); //country
            double price = rs.getDouble(4);
            double engine = rs.getDouble(5);
            String year = rs.getString(6);
            cars.put(id, new Car(name, year, country, price, engine));
        }
        q.closeRs(rs);
        return cars;
    }
}
