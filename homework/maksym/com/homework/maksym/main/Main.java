package com.homework.maksym.main;

import com.homework.maksym.DBO.QueryBuider;
import com.homework.maksym.DBO.QueryDBO;

import java.sql.ResultSet;
import java.sql.SQLException;

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
        QueryDBO q = new QueryBuider();
        q.select("id, name, price");
        q.setLimit(1);
        q.from("cars");
        q.where("id", 1);
        ResultSet rs = q.getRes();

        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String price = rs.getString(3);
            System.out.printf("id: %d, name: %s, author: %s %n", id, name, price);
        }
        q.closeRs(rs);
    }
}
