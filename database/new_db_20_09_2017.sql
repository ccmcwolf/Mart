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
DROP DATABASE IF EXISTS `mart`;
CREATE DATABASE IF NOT EXISTS `mart` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mart`;

-- Dumping structure for table mart.category
DROP TABLE IF EXISTS `category`;
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

-- Dumping structure for table mart.courier
DROP TABLE IF EXISTS `courier`;
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
DROP TABLE IF EXISTS `customer`;
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
  UNIQUE KEY `customer_email` (`customer_email`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.customer: ~18 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customer_id`, `city`, `geolocation`, `customer_address`, `customer_email`, `customer_name`, `district`, `mobile_no`, `province`, `image_path`) VALUES
	(1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(2, 'fdgdf', NULL, NULL, 'fg@df.com', 'sdfsdf', '', 3223423423, NULL, NULL),
	(4, 'fdgdf', NULL, NULL, 'fgfds@df.com', 'sdfsdf', '', 3223423423, NULL, NULL),
	(5, 'sdf', NULL, NULL, 'sdf@sdf.com', 'dsfsdf', 'sdf', 3242342341, NULL, NULL),
	(6, 'sdf', NULL, NULL, 'dsf@sdf.com', 'sdfsdf', 'sdf', 7720082443, NULL, NULL),
	(8, 'sdf', NULL, NULL, 'dwesf@sdf.com', 'sdfsdf', 'sdf', 7720082443, NULL, NULL),
	(9, 'sdf', NULL, NULL, 'dwasdesf@sdf.com', 'sdfsdf', 'sdf', 7720082443, NULL, NULL),
	(10, 'sdf', NULL, NULL, 'dfdsg@dsf.com', 'fgdfg', 'gfd', 7724824430, NULL, NULL),
	(11, 'sdf', NULL, NULL, '456@sad.com', 'fghfgh', 'sdfsdf', 1231231231, NULL, NULL),
	(12, 'sdf', NULL, NULL, '45as6@sad.com', 'fghfgh', 'sdfsdf', 1231231231, NULL, NULL),
	(13, 'sdfsdf', NULL, NULL, 'asdasdsafg@sadfsdf.com', 'asdasd', 'sdfsdf', 1231231234, NULL, NULL),
	(14, 'sdfsdf', NULL, NULL, 'asdasdsa@sa.com', 'asdasd', 'sdfsdf', 1231231234, NULL, NULL),
	(15, 'asd', NULL, NULL, 'asds@sd.com', 'asdasd', 'sdf', 1231231235, NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/ffe105c8-049d-467a-afac-0bb6c49daffe'),
	(16, 'asdasdasd', NULL, NULL, 'adssad@sadasd.com', 'asdasd', 'asdasdasd', 1231231231, NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/8ee37f63-ff18-41df-a635-5be03fff5747'),
	(17, 'asdasd', NULL, NULL, 'asdasd72@sad.com', 'dasd', 'asdasd', 1231231231, NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/4f49183a-14fd-4bf6-bc29-4e93c4e22537'),
	(18, 'sdfsdf', NULL, NULL, 'ghj@ga.com', 'fghfgh', 'sdfsdfsdfsdf', 1231234123, NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/5892ff1e-72af-484e-adc9-5f971624088d'),
	(19, 'asdasd', NULL, NULL, 'asdasdsaasfg@sadfsdf.com', 'asdsad', 'asdasd', 1231231231, NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/58a70629-097e-4068-ad16-09e82046edc2'),
	(20, 'asdasdasd', NULL, NULL, 'sdf@sad.com', 'sdfsd', 'sdf', 1231231231, NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/032c3a29-eed6-4443-a8e7-e8e387720a77');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

-- Dumping structure for table mart.delivery_option
DROP TABLE IF EXISTS `delivery_option`;
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

-- Dumping structure for table mart.feedback
DROP TABLE IF EXISTS `feedback`;
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
DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `order_no` int(11) NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
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
  `district` varchar(255) DEFAULT NULL,
  `shop_payment_settled_date` datetime DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
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
  PRIMARY KEY (`order_no`),
  KEY `FK75DCD231DA2CA4AE` (`delivery_optionid`),
  KEY `FK75DCD231E78EC4C6` (`customer_email`),
  KEY `FK75DCD23192137E8B` (`courier_id`),
  KEY `FK75DCD231A53974D1` (`shop_no`),
  CONSTRAINT `FK75DCD23192137E8B` FOREIGN KEY (`courier_id`) REFERENCES `courier` (`courier_id`),
  CONSTRAINT `FK75DCD231A53974D1` FOREIGN KEY (`shop_no`) REFERENCES `shop` (`shop_no`),
  CONSTRAINT `FK75DCD231DA2CA4AE` FOREIGN KEY (`delivery_optionid`) REFERENCES `delivery_option` (`delivery_optionid`),
  CONSTRAINT `FK75DCD231E78EC4C6` FOREIGN KEY (`customer_email`) REFERENCES `customer` (`customer_email`)
) ENGINE=InnoDB AUTO_INCREMENT=202 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.orders: ~32 rows (approximately)
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` (`order_no`, `amount`, `city`, `courier_charj`, `courier_payment_settled_date`, `courier_tracking_no`, `date`, `delivery_address`, `delivery_email`, `delivery_name`, `delivery_telephone_no`, `delvery_cost`, `delvery_vat`, `district`, `shop_payment_settled_date`, `province`, `service_charg`, `special_request`, `status_courier`, `status_description`, `status_shop`, `vat`, `courier_id`, `customer_email`, `delivery_optionid`, `shop_no`, `delivery_time`) VALUES
	(1, 1300, 'Colombo', NULL, '2017-09-13 12:01:31', 'GTAKAS', '2017-09-13', 'WTC L33, Colombo 01', 'ccmcwolf@gmail.com', 'CHamith Chathuka', '0772482443', 100, 10, 'Colombo', '2017-09-13 12:02:13', 'Western', 50, 'No', 'Dispatched', 'Done', 'Disatched', 10, 15, 'asds@sd.com', 1, 1, '13:01:24'),
	(155, NULL, 'Galle', NULL, NULL, NULL, '1970-01-01', '123 Galle', 'cha@gmail.com', 'Chamith Chathuka', '123123123', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '04:06:00'),
	(156, NULL, 'asdasd', NULL, NULL, NULL, '1970-01-01', 'asdasd', 'asd@gas.ocm', 'asdasd', '123123123', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '01:02:00'),
	(157, NULL, 'Galle', NULL, NULL, NULL, '2018-02-01', '14', 'cha@cha.com', 'Chamith Chathuka', '123123123', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '13:00:00'),
	(174, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(175, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(176, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(177, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(178, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(179, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(180, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(181, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	(182, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(183, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(184, NULL, 'Galle', NULL, NULL, NULL, '2017-09-18', 'asdasd', 'ch@ch.com', 'Chamith Chathuka', '4321236542', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '15:02:00'),
	(185, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(186, NULL, 'Galle', NULL, NULL, NULL, '2018-03-02', '14 Bataduwa', 'chamith@shopit.lk', 'Chathuka', '123534123', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '03:02:00'),
	(187, NULL, 'Galle', NULL, NULL, NULL, '2017-09-19', '15, Bataduwa Galle', 'ccmcwolf@gmail.com', 'Chathuka', '123456798', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '18:00:00'),
	(188, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(189, NULL, 'Galle', NULL, NULL, NULL, '2017-09-19', '169 , Bataduwa', 'ccmcwolf@gmail.com', 'Chahtuka', '0772482445', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '16:00:00'),
	(190, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(191, NULL, 'Galle', NULL, NULL, NULL, '2017-09-20', '14 Bataduwa Galle', 'ccmcwolf@gmail.com', 'Chamith', '77248243', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '10:00:00'),
	(192, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(193, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(194, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(195, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(196, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(197, NULL, 'Galle', NULL, NULL, NULL, '2017-09-20', '14 Bataduwa', 'ccmcwolf@gmail.com', 'Chathuka', '772482443', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '11:00:00'),
	(198, 950, 'Galle', NULL, NULL, NULL, '2017-09-21', '14 Bataduwa', 'ccmcwolf@gmail.com', 'Chathuka', '758623458', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '07:00:00'),
	(199, 950, 'Galle', NULL, NULL, NULL, '2017-09-21', '14 Bataduwa', 'chamith.chathuka@gmail.com', 'Chathuka', '0772482443', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, '10:00:00'),
	(200, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL),
	(201, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;

-- Dumping structure for table mart.product
DROP TABLE IF EXISTS `product`;
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product: ~5 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`product_id`, `name`, `description`, `other_name`, `weight`, `image_path`, `shop_id`, `size`, `unit_price`, `type_id`, `other_id`, `availablilty`) VALUES
	(1, 'Burger', 'Chickent cheese burger', 'Brazil burger', 500, 'http://lorempixel.com/output/food-q-c-640-480-9.jpg', 1, 's', 100, 1, '1', 'Available'),
	(2, 'Dry Bun', 'Parana Paan', 'Panarana Paan', 500, 'http://lorempixel.com/output/food-q-c-640-480-10.jpg', 1, 's', 200, 1, '1', 'Available'),
	(3, 'Egg plant Curry', 'Delicious Egg plant curry bowl suits to eat with rice and Curry or bread', 'Bringual Curry', 750, 'http://lorempixel.com/output/food-q-c-640-480-1.jpg', 1, 'm', 350, 2, '2', 'Available'),
	(4, 'Sushi', 'Japanese Food', 'Sushi ', 125, 'http://lorempixel.com/output/food-q-c-640-480-8.jpg', 1, 's', 350, 2, '2', 'Available'),
	(5, 'Rice and Curry', 'Normal Rice and Curry with Chicken', 'Rice', 500, 'http://lorempixel.com/output/food-q-c-640-480-4.jpg', 1, 'm', 360, 3, '3', 'Available');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table mart.product_order
DROP TABLE IF EXISTS `product_order`;
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
) ENGINE=InnoDB AUTO_INCREMENT=277 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product_order: ~68 rows (approximately)
/*!40000 ALTER TABLE `product_order` DISABLE KEYS */;
INSERT INTO `product_order` (`product_orderid`, `order_id`, `quantity`, `unit_price`, `product_id`) VALUES
	(188, 155, 1, 350, 3),
	(189, 156, 1, 350, 3),
	(190, 157, 1, 350, 3),
	(212, 174, 1, 350, 3),
	(213, 174, 1, 100, 1),
	(214, 175, 1, 350, 3),
	(215, 175, 1, 100, 1),
	(216, 176, 1, 350, 3),
	(217, 176, 1, 100, 1),
	(218, 177, 1, 350, 3),
	(219, 177, 1, 100, 1),
	(220, 178, 1, 350, 3),
	(221, 178, 1, 100, 1),
	(222, 179, 1, 350, 3),
	(223, 179, 1, 100, 1),
	(224, 180, 1, 350, 3),
	(225, 180, 1, 100, 1),
	(226, 181, 1, 350, 3),
	(227, 181, 1, 100, 1),
	(228, 182, 1, 350, 3),
	(229, 182, 1, 100, 1),
	(230, 183, 1, 350, 3),
	(231, 183, 1, 100, 1),
	(232, 184, 1, 350, 3),
	(233, 184, 1, 100, 1),
	(234, 185, 1, 200, 2),
	(235, 186, 1, 350, 3),
	(236, 186, 1, 100, 1),
	(237, 187, 1, 350, 3),
	(238, 187, 1, 200, 2),
	(239, 188, 1, 350, 3),
	(240, 188, 1, 200, 2),
	(241, 189, 1, 350, 3),
	(242, 189, 1, 200, 2),
	(243, 190, 1, 350, 3),
	(244, 190, 1, 200, 2),
	(245, 191, 2, 200, 2),
	(246, 191, 1, 350, 3),
	(247, 191, 2, 100, 1),
	(248, 192, 2, 200, 2),
	(249, 192, 1, 350, 3),
	(250, 192, 2, 100, 1),
	(251, 193, 2, 200, 2),
	(252, 193, 1, 350, 3),
	(253, 193, 2, 100, 1),
	(254, 194, 2, 200, 2),
	(255, 194, 1, 350, 3),
	(256, 194, 2, 100, 1),
	(257, 195, 2, 200, 2),
	(258, 195, 1, 350, 3),
	(259, 195, 2, 100, 1),
	(260, 196, 2, 200, 2),
	(261, 196, 1, 350, 3),
	(262, 196, 2, 100, 1),
	(263, 197, 2, 200, 2),
	(264, 197, 1, 350, 3),
	(265, 197, 2, 100, 1),
	(266, 198, 2, 200, 2),
	(267, 198, 1, 350, 3),
	(268, 198, 2, 100, 1),
	(269, 199, 0, 0, 3),
	(270, 199, 0, 0, 2),
	(271, 199, 0, 0, 1),
	(272, 200, 1, 100, 1),
	(273, 200, 1, 200, 2),
	(274, 201, 1, 100, 1),
	(275, 201, 1, 200, 2),
	(276, 201, 1, 350, 3);
/*!40000 ALTER TABLE `product_order` ENABLE KEYS */;

-- Dumping structure for table mart.product_shop
DROP TABLE IF EXISTS `product_shop`;
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

-- Dumping structure for table mart.settings
DROP TABLE IF EXISTS `settings`;
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
DROP TABLE IF EXISTS `shop`;
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
DROP TABLE IF EXISTS `type`;
CREATE TABLE IF NOT EXISTS `type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.type: ~0 rows (approximately)
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
/*!40000 ALTER TABLE `type` ENABLE KEYS */;

-- Dumping structure for table mart.users
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.users: ~6 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
	('admin@mart.lk', '$2y$10$NeHw0eEhlIyjs1itQXYLiew2YetXNRVaja9Pv1sqvtKacRiOzMxG6', 1),
	('ccmcwolf@gmail.com', 'ccmcwolf', 1),
	('chamith@gmail.com', 'chamith', 1),
	('delivery@mart.lk', '$2y$10$sPY7iiJSSpYEitYiUgou1uT6KRMs64nB0P2ypGHDlbOBCc6M5fQS2', 1),
	('seller@mart.lk', '$2y$10$ImGPomMpI9XIFtIcpo.qOOA/ecTducY9GZX44lCmqoas.mbpHxZTC', 1),
	('user@mart.lk', '$2y$10$NlZ0U/Jr1whQ.1/IkrAQEen6Y1SjrFMTvNl2E4/hSr3crDnxQgFeW', 1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping structure for table mart.user_roles
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE IF NOT EXISTS `user_roles` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) NOT NULL,
  `role` varchar(200) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  KEY `FK_user_roles_user` (`username`),
  CONSTRAINT `FK_user_roles_user` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.user_roles: ~6 rows (approximately)
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` (`user_role_id`, `username`, `role`) VALUES
	(4, 'chamith@gmail.com', 'ROLE_USER'),
	(5, 'ccmcwolf@gmail.com', 'ROLE_ADMIN'),
	(6, 'user@mart.lk', 'ROLE_USER'),
	(7, 'seller@mart.lk', 'ROLE_SELLER'),
	(8, 'admin@mart.lk', 'ROLE_ADMIN'),
	(9, 'delivery@mart.lk', 'ROLE_DELIVERY');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
