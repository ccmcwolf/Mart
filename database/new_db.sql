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
CREATE TABLE IF NOT EXISTS `delivery_option` (
  `delivery_optionid` int(11) NOT NULL AUTO_INCREMENT,
  `cost` double DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`delivery_optionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.delivery_option: ~0 rows (approximately)
/*!40000 ALTER TABLE `delivery_option` DISABLE KEYS */;
/*!40000 ALTER TABLE `delivery_option` ENABLE KEYS */;

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

-- Dumping structure for table mart.order
CREATE TABLE IF NOT EXISTS `order` (
  `order_no` int(11) NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `courier_charj` double DEFAULT NULL,
  `courier_payment_settled_date` datetime DEFAULT NULL,
  `courier_tracking_no` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
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
  `delivery_optionid` int(11) NOT NULL,
  `shop_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_no`),
  KEY `FK75DCD231DA2CA4AE` (`delivery_optionid`),
  KEY `FK75DCD231E78EC4C6` (`customer_email`),
  KEY `FK75DCD23192137E8B` (`courier_id`),
  KEY `FK75DCD231A53974D1` (`shop_no`),
  CONSTRAINT `FK75DCD23192137E8B` FOREIGN KEY (`courier_id`) REFERENCES `courier` (`courier_id`),
  CONSTRAINT `FK75DCD231A53974D1` FOREIGN KEY (`shop_no`) REFERENCES `shop` (`shop_no`),
  CONSTRAINT `FK75DCD231DA2CA4AE` FOREIGN KEY (`delivery_optionid`) REFERENCES `delivery_option` (`delivery_optionid`),
  CONSTRAINT `FK75DCD231E78EC4C6` FOREIGN KEY (`customer_email`) REFERENCES `customer` (`customer_email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.order: ~0 rows (approximately)
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product: ~0 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
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
  CONSTRAINT `FK_product_order_order` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_product_order_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product_order: ~0 rows (approximately)
/*!40000 ALTER TABLE `product_order` DISABLE KEYS */;
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
	(1, 'sdfsdf', 'Colombo 01', 112760874, 'Colombo', 'sdf@sdf.com', 'Cafe Fort', 'Western', NULL, '', NULL, NULL, NULL, NULL, NULL, 'sdf'),
	(2, 'sdfsdf', 'Bambalapitiya', 112458756, 'Colombo', 'sdf@sdf.com', 'Chinese Dragon', 'Western', NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/5c3cabb4-a8ce-471c-8b2c-10bc4afd8713', NULL, NULL, NULL, NULL, NULL, 'sdf'),
	(3, 'zxc', 'zxczx', 4, 'czxczcx', 'zxczxc@sd.com', 'zczxc', 'zxczxc', NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/5c3cabb4-a8ce-471c-8b2c-10bc4afd8713', NULL, NULL, NULL, NULL, NULL, 'zxczxc'),
	(4, 'aasdasd', 'asdasd', 1231231231, 'adsfsd', 'asd@asd.om', 'asdasdsada', 'asdasd', NULL, '', NULL, NULL, NULL, NULL, NULL, 'sdfdsf'),
	(5, 'asdasd', 'asdasd', 123123123, 'asdasd', 'asas@gmail.com', 'asdasd', 'asdasd', NULL, 'https://s3-ap-southeast-1.amazonaws.com/martonline/5c3cabb4-a8ce-471c-8b2c-10bc4afd8713', NULL, NULL, NULL, NULL, NULL, 'asdasd');
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
  `email` varchar(255) NOT NULL,
  `deliver_time` datetime DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `security_code` varchar(255) DEFAULT NULL,
  `user_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.users: ~0 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
