-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.35 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for mart
CREATE DATABASE IF NOT EXISTS `mart` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mart`;

-- Dumping structure for table mart.category
CREATE TABLE IF NOT EXISTS `category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(100) DEFAULT NULL,
  `tag` varchar(100) DEFAULT NULL,
  `tag1` varchar(100) DEFAULT NULL,
  `tag3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.category: ~8 rows (approximately)
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`category_id`, `category_name`, `tag`, `tag1`, `tag3`) VALUES
	(1, 'Bread', 'tag 1', 'tag 2', 'tag 3'),
	(2, 'Snacks', 'tag 2', 'tag 3', 'tag 5'),
	(3, 'Fish', NULL, NULL, NULL),
	(4, 'Satay', NULL, NULL, NULL),
	(5, 'Noodles', NULL, NULL, NULL),
	(6, 'Roti', NULL, NULL, NULL),
	(7, 'Rice', NULL, NULL, NULL),
	(8, 'Juice', NULL, NULL, NULL);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

-- Dumping structure for table mart.city
CREATE TABLE IF NOT EXISTS `city` (
  `city_id` int(11) NOT NULL,
  `city_ name` varchar(200) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `district_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`city_id`),
  KEY `FK_city_province` (`province_id`),
  KEY `FK_city_district` (`district_id`),
  CONSTRAINT `FK_city_district` FOREIGN KEY (`district_id`) REFERENCES `district` (`district_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_city_province` FOREIGN KEY (`province_id`) REFERENCES `province` (`province_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.city: ~0 rows (approximately)
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
/*!40000 ALTER TABLE `city` ENABLE KEYS */;

-- Dumping structure for table mart.courier
CREATE TABLE IF NOT EXISTS `courier` (
  `courier_id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `nic` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `contact_no` varchar(11) DEFAULT NULL,
  `vehicle_no` varchar(255) DEFAULT NULL,
  `courier_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `imagepath` varchar(10000) DEFAULT NULL,
  PRIMARY KEY (`courier_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.courier: ~3 rows (approximately)
/*!40000 ALTER TABLE `courier` DISABLE KEYS */;
INSERT INTO `courier` (`courier_id`, `city`, `nic`, `address`, `contact_no`, `vehicle_no`, `courier_name`, `email`, `province`, `imagepath`) VALUES
	(13, 'FGSD', '940610248', 'sdfdfs', '1234567891', 'DSf', 'sdfsfssdfsdf', 'qwe@ds.com', 'sdfds', NULL),
	(14, 'asd', '1231234531', 'asd', '1231231231', 'asd', 'FDDS', 'sdf@asd.com', 'asdasd', NULL),
	(15, 'dsfsdf', '123123122', 'sdfsdf', '1231231231', 'sdfs', 'sdfsdf', 'sdfsdf@gmail.com', 'sdfdsf', 'https://s3-ap-southeast-1.amazonaws.com/martonline/76f2d751-9869-4f49-aee5-0375862590e3');
/*!40000 ALTER TABLE `courier` ENABLE KEYS */;

-- Dumping structure for table mart.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `geolocation` varchar(255) DEFAULT NULL,
  `customer_address` varchar(255) DEFAULT NULL,
  `customer_email` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `mobile_no` bigint(20) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `image_path` varchar(10000) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_email` (`customer_email`),
  CONSTRAINT `FK_customer_users` FOREIGN KEY (`customer_email`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.customer: ~1 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customer_id`, `city`, `geolocation`, `customer_address`, `customer_email`, `customer_name`, `district`, `mobile_no`, `province`, `image_path`) VALUES
	(19, 'Colombo', NULL, NULL, 'user@mart.lk', 'Chamith Wickramarathna', '', 772482443, NULL, NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

-- Dumping structure for table mart.delivery_option
CREATE TABLE IF NOT EXISTS `delivery_option` (
  `delivery_optionid` int(11) NOT NULL AUTO_INCREMENT,
  `cost` double DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`delivery_optionid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.delivery_option: ~4 rows (approximately)
/*!40000 ALTER TABLE `delivery_option` DISABLE KEYS */;
INSERT INTO `delivery_option` (`delivery_optionid`, `cost`, `description`, `type_name`) VALUES
	(1, 100, 'Normal Delivery Within Delivery Grid', 'Normal'),
	(2, 200, 'Normal Delivery outside delivery Grid', 'Normal_Outside'),
	(3, 200, 'Express Delivery withing Grid', 'Express'),
	(4, 400, 'Express Delivery Outside Grid', 'Express_Outside');
/*!40000 ALTER TABLE `delivery_option` ENABLE KEYS */;

-- Dumping structure for table mart.district
CREATE TABLE IF NOT EXISTS `district` (
  `district_id` int(11) NOT NULL AUTO_INCREMENT,
  `district_name` varchar(200) DEFAULT '0',
  `province_id` int(11) DEFAULT '0',
  PRIMARY KEY (`district_id`),
  KEY `province_id` (`province_id`),
  CONSTRAINT `FK__province` FOREIGN KEY (`province_id`) REFERENCES `province` (`province_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.district: ~0 rows (approximately)
/*!40000 ALTER TABLE `district` DISABLE KEYS */;
/*!40000 ALTER TABLE `district` ENABLE KEYS */;

-- Dumping structure for table mart.feedback
CREATE TABLE IF NOT EXISTS `feedback` (
  `fb_id` int(11) NOT NULL AUTO_INCREMENT,
  `dlvr_rate` double DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `issues` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `other` varchar(255) DEFAULT NULL,
  `price_rate` double DEFAULT NULL,
  `product_rate` double DEFAULT NULL,
  `service_rate` double DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.feedback: ~0 rows (approximately)
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;

-- Dumping structure for table mart.orders
CREATE TABLE IF NOT EXISTS `orders` (
  `order_no` int(11) NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `courier_charj` double DEFAULT NULL,
  `courier_payment_settled_date` datetime DEFAULT NULL,
  `courier_tracking_no` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `delivery_address` varchar(255) DEFAULT NULL,
  `delivery_email` varchar(255) DEFAULT NULL,
  `delivery_name` varchar(255) DEFAULT NULL,
  `delivery_telephone_no` varchar(255) DEFAULT NULL,
  `delvery_cost` double DEFAULT NULL,
  `delvery_vat` double DEFAULT NULL,
  `district_id` int(11) DEFAULT NULL,
  `shop_payment_settled_date` datetime DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `service_charg` double DEFAULT NULL,
  `special_request` varchar(255) DEFAULT NULL,
  `status_courier` varchar(255) DEFAULT NULL,
  `status_description` varchar(255) DEFAULT NULL,
  `status_shop` varchar(255) DEFAULT NULL,
  `vat` double DEFAULT NULL,
  `courier_id` int(11) DEFAULT NULL,
  `customer_email` varchar(255) DEFAULT NULL,
  `delivery_optionid` int(11) DEFAULT NULL,
  `shop_no` int(11) DEFAULT NULL,
  `delivery_time` time DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `delivery_location_lat` varchar(255) DEFAULT NULL,
  `delivery_location_long` varchar(255) DEFAULT NULL,
  `current_location_lat` varchar(255) DEFAULT NULL,
  `current_location_long` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_no`),
  KEY `FK75DCD231DA2CA4AE` (`delivery_optionid`),
  KEY `FK75DCD231E78EC4C6` (`customer_email`),
  KEY `FK75DCD23192137E8B` (`courier_id`),
  KEY `FK75DCD231A53974D1` (`shop_no`),
  KEY `FK_orders_city` (`city_id`),
  KEY `FK_orders_district` (`district_id`),
  KEY `FK_orders_province` (`province_id`),
  CONSTRAINT `FK_orders_city` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_orders_courier` FOREIGN KEY (`courier_id`) REFERENCES `courier` (`courier_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_orders_delivery_option` FOREIGN KEY (`delivery_optionid`) REFERENCES `delivery_option` (`delivery_optionid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_orders_district` FOREIGN KEY (`district_id`) REFERENCES `district` (`district_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_orders_province` FOREIGN KEY (`province_id`) REFERENCES `province` (`province_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_orders_shop` FOREIGN KEY (`shop_no`) REFERENCES `shop` (`shop_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_orders_users` FOREIGN KEY (`customer_email`) REFERENCES `users` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=238 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.orders: ~15 rows (approximately)
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` (`order_no`, `amount`, `city_id`, `courier_charj`, `courier_payment_settled_date`, `courier_tracking_no`, `date`, `delivery_address`, `delivery_email`, `delivery_name`, `delivery_telephone_no`, `delvery_cost`, `delvery_vat`, `district_id`, `shop_payment_settled_date`, `province_id`, `service_charg`, `special_request`, `status_courier`, `status_description`, `status_shop`, `vat`, `courier_id`, `customer_email`, `delivery_optionid`, `shop_no`, `delivery_time`, `status`, `delivery_location_lat`, `delivery_location_long`, `current_location_lat`, `current_location_long`) VALUES
	(223, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL),
	(224, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(225, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(226, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(227, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(228, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(229, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(230, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL),
	(231, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL),
	(232, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL),
	(233, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL),
	(234, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL),
	(235, 300, NULL, NULL, NULL, NULL, '2017-09-25', 'Bataduwa', 'ccmcwolf@gmail.com', 'Chamith', '12345679', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '01:00:00', NULL, NULL, NULL, NULL, NULL),
	(236, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL),
	(237, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;

-- Dumping structure for table mart.product
CREATE TABLE IF NOT EXISTS `product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(10000) DEFAULT NULL,
  `other_name` varchar(255) DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `image_path` varchar(1000) DEFAULT NULL,
  `shop_id` int(11) DEFAULT NULL,
  `size` varchar(150) DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  `other_id` varchar(150) DEFAULT NULL,
  `availablilty` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product: ~8 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`product_id`, `name`, `description`, `other_name`, `weight`, `image_path`, `shop_id`, `size`, `unit_price`, `type_id`, `other_id`, `availablilty`) VALUES
	(1, 'Burger', 'Chickent cheese burger', 'Brazil burger', 500, 'http://lorempixel.com/output/food-q-c-640-480-9.jpg', 1, 's', 100, 1, '1', 'Available'),
	(2, 'Dry Bun', 'Parana Paan', 'Panarana Paan', 500, 'http://lorempixel.com/output/food-q-c-640-480-10.jpg', 1, 's', 200, 1, '1', 'Available'),
	(3, 'Egg plant Curry', 'Delicious Egg plant curry bowl suits to eat with rice and Curry or bread', 'Bringual Curry', 750, 'http://lorempixel.com/output/food-q-c-640-480-1.jpg', 1, 'm', 350, 2, '2', 'Available'),
	(4, 'Sushi', 'Japanese Food', 'Sushi ', 125, 'http://lorempixel.com/output/food-q-c-640-480-8.jpg', 1, 's', 350, 2, '2', 'Available'),
	(5, 'Rice and Curry', 'Normal Rice and Curry with Chicken', 'Rice', 500, 'http://lorempixel.com/output/food-q-c-640-480-4.jpg', 1, 'm', 360, 3, '3', 'Available'),
	(6, 'Cheese Burger', 'Chickent cheese burger', 'Brazil burger', 600, 'http://lorempixel.com/output/food-q-c-640-480-9.jpg', 2, 's', 100, 1, '1', 'Available'),
	(7, 'Sri Lankan Sushi', 'Japanese Food', 'Sushi ', 125, 'http://lorempixel.com/output/food-q-c-640-480-8.jpg', 2, 's', 350, 2, '2', 'Available'),
	(8, 'Fried Rice', 'Normal Rice and Curry with Chicken', 'Rice', 500, 'http://lorempixel.com/output/food-q-c-640-480-4.jpg', 2, 'm', 360, 3, '3', 'Available');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table mart.product_order
CREATE TABLE IF NOT EXISTS `product_order` (
  `product_orderid` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_orderid`),
  KEY `FK_product_order_order` (`order_id`),
  KEY `FK_product_order_product` (`product_id`),
  CONSTRAINT `FK_product_order_order` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_product_order_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=333 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product_order: ~17 rows (approximately)
/*!40000 ALTER TABLE `product_order` DISABLE KEYS */;
INSERT INTO `product_order` (`product_orderid`, `order_id`, `quantity`, `unit_price`, `product_id`) VALUES
	(316, 223, 1, 100, 1),
	(317, 224, 1, 100, 1),
	(318, 225, 1, 100, 1),
	(319, 226, 1, 350, 3),
	(320, 227, 1, 350, 3),
	(321, 228, 1, 350, 3),
	(322, 229, 0, 0, 3),
	(323, 230, 1, 350, 3),
	(324, 231, 1, 350, 3),
	(325, 232, 1, 200, 2),
	(326, 233, 1, 100, 1),
	(327, 234, 2, 100, 1),
	(328, 235, 1, 100, 1),
	(329, 235, 1, 200, 2),
	(330, 236, 2, 350, 3),
	(331, 237, 1, 100, 1),
	(332, 237, 1, 200, 2);
/*!40000 ALTER TABLE `product_order` ENABLE KEYS */;

-- Dumping structure for table mart.product_shop
CREATE TABLE IF NOT EXISTS `product_shop` (
  `product_id` int(11) NOT NULL,
  `shop_no` int(11) NOT NULL,
  `available_qty` int(11) NOT NULL,
  `product_shop_id` int(11) DEFAULT NULL,
  KEY `FK_product_shop_product` (`product_id`),
  KEY `FK_product_shop_shop` (`shop_no`),
  CONSTRAINT `FK_product_shop_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `FK_product_shop_shop` FOREIGN KEY (`shop_no`) REFERENCES `shop` (`shop_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product_shop: ~0 rows (approximately)
/*!40000 ALTER TABLE `product_shop` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_shop` ENABLE KEYS */;

-- Dumping structure for table mart.province
CREATE TABLE IF NOT EXISTS `province` (
  `province_id` int(11) NOT NULL AUTO_INCREMENT,
  `province_name` varchar(250) DEFAULT '0',
  PRIMARY KEY (`province_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.province: ~0 rows (approximately)
/*!40000 ALTER TABLE `province` DISABLE KEYS */;
/*!40000 ALTER TABLE `province` ENABLE KEYS */;

-- Dumping structure for table mart.settings
CREATE TABLE IF NOT EXISTS `settings` (
  `settings_id` int(11) NOT NULL,
  `service_charg` double DEFAULT NULL,
  `vat` double DEFAULT NULL,
  PRIMARY KEY (`settings_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.settings: ~0 rows (approximately)
/*!40000 ALTER TABLE `settings` DISABLE KEYS */;
/*!40000 ALTER TABLE `settings` ENABLE KEYS */;

-- Dumping structure for table mart.shop
CREATE TABLE IF NOT EXISTS `shop` (
  `shop_no` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `contact_no` int(11) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `shop_name` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `shoplogo_path` varchar(10000) DEFAULT NULL,
  `shopcover_path` varchar(10000) DEFAULT NULL,
  `open_time` time DEFAULT NULL,
  `close_time` time DEFAULT NULL,
  `openday_from` varchar(100) DEFAULT NULL,
  `openday_to` varchar(100) DEFAULT NULL,
  `description` varchar(10000) DEFAULT NULL,
  PRIMARY KEY (`shop_no`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.shop: ~5 rows (approximately)
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
INSERT INTO `shop` (`shop_no`, `address`, `city`, `contact_no`, `district`, `email`, `shop_name`, `province`, `category`, `shoplogo_path`, `shopcover_path`, `open_time`, `close_time`, `openday_from`, `openday_to`, `description`) VALUES
	(1, 'Fort, Colombo', 'Colombo 01', 112760874, 'Colombo', 'sdf@sdf.com', 'Cafe Fort', 'Western', 'Dining', 'https://s3-ap-southeast-1.amazonaws.com/martonline/food-h-c-150-400-1.jpg', NULL, '08:30:00', '22:30:00', 'Monday', 'Friday', 'Hotel De Pilawoos (Colombo -3) is one of the most popular 24 hours eateries in'),
	(2, 'Rajagiriya, Colombo', 'Bambalapitiya', 112458756, 'Colombo', 'sdf@sdf.com', 'Chinese Dragon', 'Western', NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/food-h-c-150-400-3.jpg', NULL, '08:30:00', '22:30:00', 'Monday', 'Friday', 'Hotel De Pilawoos (Colombo -3) is one of the most popular 24 hours eateries in'),
	(3, 'Rajagiriya, Colombo', 'Rajagiriya', 4, 'Colombo', 'zxczxc@sd.com', 'Shandong', 'Western', NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/food-h-c-150-400-9.jpg', NULL, '08:30:00', '22:30:00', 'Monday', 'Friday', 'Hotel De Pilawoos (Colombo -3) is one of the most popular 24 hours eateries in'),
	(4, 'Fort, Colombo', 'Colombo 01', 1231231231, 'Colombo', 'asd@asd.om', 'Aasife', 'Western', NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/food-h-c-150-400-6.jpg', NULL, '08:30:00', '22:30:00', 'Monday', 'Friday', 'Hotel De Pilawoos (Colombo -3) is one of the most popular 24 hours eateries in'),
	(5, 'Bambalapitiya, Colombo', 'Bambalapitiya', 123123123, 'Colombo', 'asas@gmail.com', 'Hotel de Pillawoos', 'Western', NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/food-h-c-150-400-7.jpg', NULL, '08:30:00', '22:30:00', 'Monday', 'Friday', 'Hotel De Pilawoos (Colombo -3) is one of the most popular 24 hours eateries in\r\n                    Colombo which has been\r\n                    serving customers for over 20 years!');
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;

-- Dumping structure for table mart.type
CREATE TABLE IF NOT EXISTS `type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.type: ~0 rows (approximately)
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
/*!40000 ALTER TABLE `type` ENABLE KEYS */;

-- Dumping structure for table mart.users
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(255) NOT NULL,
  `password` varchar(200) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.users: ~4 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
	('admin@mart.lk', '$2a$10$NebLYaNXOqMSFaSC7EbE1.6yixyuFBW8tm7Kj7YH4K/fZagk3cPQq', 1),
	('delivery@mart.lk', '$2a$10$a1kNhTOaQqAbrP9AIfO56OvmIG4suE881B0cr6o5T3c6FSNKcep6O', 1),
	('seller@mart.lk', '$2a$10$st8jjhQAApKXZF5GHMsTJeVhJmXSWsxC1g9gc9fEdvVJ.FLIl2e2O', 1),
	('user@mart.lk', '$2a$10$3LEyQSlpim2K3e1rOAYDz.rbLKxVd27NPiUALOs07xlcW12rVPa0e', 1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping structure for table mart.user_roles
CREATE TABLE IF NOT EXISTS `user_roles` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) NOT NULL,
  `role` varchar(200) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  KEY `FK_user_roles_user` (`username`),
  CONSTRAINT `FK_user_roles_user` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.user_roles: ~4 rows (approximately)
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` (`user_role_id`, `username`, `role`) VALUES
	(6, 'user@mart.lk', 'ROLE_USER'),
	(7, 'seller@mart.lk', 'ROLE_SELLER'),
	(8, 'admin@mart.lk', 'ROLE_ADMIN'),
	(9, 'delivery@mart.lk', 'ROLE_DELIVERY');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
