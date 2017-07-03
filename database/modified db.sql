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
  `category id` int(11) NOT NULL DEFAULT '0',
  `category name` varchar(100) DEFAULT NULL,
  `tag` varchar(100) DEFAULT NULL,
  `tag1` varchar(100) DEFAULT NULL,
  `tag3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`category id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.category: ~0 rows (approximately)
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

-- Dumping structure for table mart.courier
CREATE TABLE IF NOT EXISTS `courier` (
  `courierId` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `nic` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `contact_no` varchar(11) DEFAULT NULL,
  `vehicle_no` varchar(255) DEFAULT NULL,
  `courier_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `imagepath` varchar(10000) DEFAULT NULL,
  PRIMARY KEY (`courierId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- Dumping data for table mart.courier: ~12 rows (approximately)
/*!40000 ALTER TABLE `courier` DISABLE KEYS */;
INSERT INTO `courier` (`courierId`, `city`, `nic`, `address`, `contact_no`, `vehicle_no`, `courier_name`, `email`, `province`, `imagepath`) VALUES
	(1, 'Galle', '23432423', 'sdfdfs', '772482443', NULL, 'sdfsdf', 'chamith.chathuka@gmail.com', 'Hadf', NULL),
	(2, 'Galle', '234', '34dsf dsf', '772482443', '324', 'Cha', 'chamith.chathuka@gmail.com', 'Southern', NULL),
	(3, 'Galle', '234324234', '23sdf sdf', '772482443', '32-34345', 'dsfdsf', 'chamith.chathuka@gmail.com', 'Southern', NULL),
	(4, 'Galle', '123213123', '23sdf sdf', '0775458445', '32-3234', 'Chathuka Transports', 'sdf@sdf.com', 'Galle', NULL),
	(5, '', '324234', '234', '2343243243', '', 'DFSDF', '23434@d.cin', '', NULL),
	(6, '', '324234', '234', '2343243243', '', 'DFSDF', '23434@d.cin', '', NULL),
	(7, '', '324234', '234', '2343243243', '', 'DFSDF', '23434@d.cin', '', NULL),
	(8, '234', '234', '34', '2342342234', '234', '234234', '234@gmail.com', '234', NULL),
	(9, 'Galle', '21312312', '23sdf sdf', '0772482443', '123123123', 'Chathuka', 'chamith.chathuka@gmail.com', 'Southern', NULL),
	(10, '345', '5434545', '345345', '3453454534', '3', 'Chamith Transports', '4534@fgma.com', '45435', NULL),
	(11, '345', '5434545', '345345', '3453454534', '3', 'Chamith Transports', '4534@fgma.com', '45435', NULL),
	(12, '345', '5434545', '345345', '3453454534', '3', 'Chamith Transports', '4534@fgma.com', '45435', NULL);
/*!40000 ALTER TABLE `courier` ENABLE KEYS */;

-- Dumping structure for table mart.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `customerId` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `geolocation` varchar(255) DEFAULT NULL,
  `customerAddress` varchar(255) DEFAULT NULL,
  `customerEmail` varchar(255) DEFAULT NULL,
  `customerName` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `mobileNo` bigint(20) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `imagepath` varchar(10000) DEFAULT NULL,
  PRIMARY KEY (`customerId`),
  UNIQUE KEY `customerEmail` (`customerEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.customer: ~0 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
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
  `fbid` int(11) NOT NULL AUTO_INCREMENT,
  `dlvrRate` double DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `issues` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `other` varchar(255) DEFAULT NULL,
  `priceRate` double DEFAULT NULL,
  `productRate` double DEFAULT NULL,
  `serviceRate` double DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fbid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.feedback: ~0 rows (approximately)
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;

-- Dumping structure for table mart.order
CREATE TABLE IF NOT EXISTS `order` (
  `orderNo` int(11) NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `courierCharj` double DEFAULT NULL,
  `courierPaymentSettledDate` datetime DEFAULT NULL,
  `courierTrackingNo` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `deliveryAddress` varchar(255) DEFAULT NULL,
  `deliveryEmail` varchar(255) DEFAULT NULL,
  `deliveryName` varchar(255) DEFAULT NULL,
  `deliveryTelephoneNo` varchar(255) DEFAULT NULL,
  `delveryCost` double DEFAULT NULL,
  `delveryVat` double DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `shopPaymentSettledDate` datetime DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `serviceCharg` double DEFAULT NULL,
  `specialRequest` varchar(255) DEFAULT NULL,
  `statusCourier` varchar(255) DEFAULT NULL,
  `statusDescription` varchar(255) DEFAULT NULL,
  `statusShop` varchar(255) DEFAULT NULL,
  `vat` double DEFAULT NULL,
  `courierId` int(11) DEFAULT NULL,
  `customerEmail` varchar(255) DEFAULT NULL,
  `delivery_optionid` int(11) NOT NULL,
  `shopNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderNo`),
  KEY `FK75DCD231DA2CA4AE` (`delivery_optionid`),
  KEY `FK75DCD231E78EC4C6` (`customerEmail`),
  KEY `FK75DCD23192137E8B` (`courierId`),
  KEY `FK75DCD231A53974D1` (`shopNo`),
  CONSTRAINT `FK75DCD23192137E8B` FOREIGN KEY (`courierId`) REFERENCES `courier` (`courierId`),
  CONSTRAINT `FK75DCD231A53974D1` FOREIGN KEY (`shopNo`) REFERENCES `shop` (`shopNo`),
  CONSTRAINT `FK75DCD231DA2CA4AE` FOREIGN KEY (`delivery_optionid`) REFERENCES `delivery_option` (`delivery_optionid`),
  CONSTRAINT `FK75DCD231E78EC4C6` FOREIGN KEY (`customerEmail`) REFERENCES `customer` (`customerEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.order: ~0 rows (approximately)
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;

-- Dumping structure for table mart.product
CREATE TABLE IF NOT EXISTS `product` (
  `productId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(10000) DEFAULT NULL,
  `other_name` varchar(255) DEFAULT NULL,
  `imagePath` varchar(50) DEFAULT NULL,
  `shopId` int(11) DEFAULT NULL,
  `size` varchar(150) DEFAULT NULL,
  `unitPrice` double DEFAULT NULL,
  `typeId` int(11) DEFAULT NULL,
  `otherId` varchar(150) DEFAULT NULL,
  `availablilty` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product: ~0 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- Dumping structure for table mart.product_order
CREATE TABLE IF NOT EXISTS `product_order` (
  `productOrderId` int(11) NOT NULL AUTO_INCREMENT,
  `orderid` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `unitPrice` double DEFAULT NULL,
  `productId` int(11) DEFAULT NULL,
  PRIMARY KEY (`productOrderId`),
  KEY `FKCACF2D0984C55179` (`productId`),
  KEY `FK_product_order_order` (`orderid`),
  CONSTRAINT `FKCACF2D0984C55179` FOREIGN KEY (`productId`) REFERENCES `product` (`productId`),
  CONSTRAINT `FK_product_order_order` FOREIGN KEY (`orderid`) REFERENCES `order` (`orderNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product_order: ~0 rows (approximately)
/*!40000 ALTER TABLE `product_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_order` ENABLE KEYS */;

-- Dumping structure for table mart.product_shop
CREATE TABLE IF NOT EXISTS `product_shop` (
  `product_id` int(11) NOT NULL,
  `shop_id` int(11) NOT NULL,
  `available_qty` int(11) NOT NULL,
  KEY `FK__product` (`product_id`),
  KEY `FK__shop` (`shop_id`),
  CONSTRAINT `FK__product` FOREIGN KEY (`product_id`) REFERENCES `product` (`productId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK__shop` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shopNo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.product_shop: ~0 rows (approximately)
/*!40000 ALTER TABLE `product_shop` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_shop` ENABLE KEYS */;

-- Dumping structure for table mart.settings
CREATE TABLE IF NOT EXISTS `settings` (
  `settingsid` int(11) NOT NULL,
  `serviceCharg` double DEFAULT NULL,
  `vat` double DEFAULT NULL,
  PRIMARY KEY (`settingsid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.settings: ~0 rows (approximately)
/*!40000 ALTER TABLE `settings` DISABLE KEYS */;
/*!40000 ALTER TABLE `settings` ENABLE KEYS */;

-- Dumping structure for table mart.shop
CREATE TABLE IF NOT EXISTS `shop` (
  `shopNo` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `contactNo` int(11) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `shopName` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `shoplogopath` varchar(10000) DEFAULT NULL,
  `shopcoverpath` varchar(10000) DEFAULT NULL,
  `opentime` time DEFAULT NULL,
  `closetime` time DEFAULT NULL,
  `opendayfrom` varchar(100) DEFAULT NULL,
  `opendayto` varchar(100) DEFAULT NULL,
  `description` varchar(10000) DEFAULT NULL,
  PRIMARY KEY (`shopNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.shop: ~0 rows (approximately)
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;

-- Dumping structure for table mart.type
CREATE TABLE IF NOT EXISTS `type` (
  `typeId` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`typeId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.type: ~0 rows (approximately)
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
/*!40000 ALTER TABLE `type` ENABLE KEYS */;

-- Dumping structure for table mart.users
CREATE TABLE IF NOT EXISTS `users` (
  `email` varchar(255) NOT NULL,
  `deliverTime` datetime DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `securityCode` varchar(255) DEFAULT NULL,
  `userType` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table mart.users: ~0 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
