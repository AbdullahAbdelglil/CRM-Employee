CREATE DATABASE  IF NOT EXISTS `employee_directory`;

USE `employee_directory`;

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
   `id` int NOT NULL AUTO_INCREMENT,
   `first_name` varchar(45) DEFAULT NULL,
   `last_name` varchar(45) DEFAULT NULL,
   `email` varchar(45) DEFAULT NULL,
   `phone_number` varchar(20) DEFAULT NULL,
   `jop_category` varchar(45) DEFAULT NULL,
   `salary` double DEFAULT NULL,
   PRIMARY KEY (`id`)
   ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `employee` VALUES   
	(1,"Abdullah","Abdulgalil","abdullah@gmail.com","01011121315","backend",65.0),
	(2,"Ahmed","Nader","ahmed@gmail.com","01013141516","Data-analyst",70.0),
    (3,"Mostafa","Abdulraheem","mantissa@gmail.com","01213803626","Machine-learning",80.0),
    (4,"Abdulrahman","Soliman","soly@yahoo.com","01516171895","Machine-learning",80.0),
    (5,"Yusuf","Abdulrahman","Joo@yahoo.com","01016711875","Data-analyst",60.0),
    (6,"Osama","Elzero","elzeroo@yahoo.com","01010151520","full-stack",90.0),
    (7,"Mahmud","Ali","mahmud@gmail.com","011154678291","backend",65.0);
