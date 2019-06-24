# itea.task
Hello, this is a place for feature readme data

#### SQL tables ###
[
        CREATE TABLE `cars` (
    	`id` INT(11) NOT NULL AUTO_INCREMENT,
    	`car_id` INT(11) NOT NULL DEFAULT '0',
    	`name` VARCHAR(50) NULL DEFAULT NULL,
    	`country` INT(11) NULL DEFAULT NULL,
    	`price` DECIMAL(10,2) NULL DEFAULT NULL,
    	`engine` INT(11) NOT NULL DEFAULT '1',
    	`year` INT(11) NOT NULL,
    	`carPrice` DOUBLE NOT NULL,
    	PRIMARY KEY (`id`),
    	INDEX `FK_cars_country` (`country`),
    	INDEX `FK_cars_engines` (`engine`),
    	INDEX `FK_cars_years` (`year`),
    	INDEX `FK_cars_cars` (`car_id`),
    	CONSTRAINT `FK_cars_cars` FOREIGN KEY (`car_id`) REFERENCES `newCar` (`id`),
    	CONSTRAINT `FK_cars_country` FOREIGN KEY (`country`) REFERENCES `country` (`id`),
    	CONSTRAINT `FK_cars_engines` FOREIGN KEY (`engine`) REFERENCES `engines` (`id`),
    	CONSTRAINT `FK_cars_years` FOREIGN KEY (`year`) REFERENCES `years` (`id`)
    )
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=11
    ;
]
