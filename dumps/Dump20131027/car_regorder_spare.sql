CREATE DATABASE  IF NOT EXISTS `car` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `car`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: car
-- ------------------------------------------------------
-- Server version	5.5.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `regorder_spare`
--

DROP TABLE IF EXISTS `regorder_spare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regorder_spare` (
  `customer_name` varchar(30) DEFAULT NULL,
  `spareparts` varchar(50) DEFAULT NULL,
  `total_amt` varchar(30) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `qty` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regorder_spare`
--

LOCK TABLES `regorder_spare` WRITE;
/*!40000 ALTER TABLE `regorder_spare` DISABLE KEYS */;
INSERT INTO `regorder_spare` VALUES ('gujy','er ,m','1234','2013-07-28','1'),('gujy','hn','4690','2013-07-28','2'),('gujy','er ,m','1234','2013-07-28','1'),('gujy','m ','4690','2013-07-28','2'),('gujy','er ,m','1234','2013-07-28','1'),('gujy','hn','7035','2013-07-28','3'),('fuygiu','er ,m','1234','2013-08-19','1'),('fuygiu','hn','2345','2013-08-19','1'),('gujy','hn','2345','2013-09-21','1'),('gujy','hn','2345','2013-09-21','1'),('gujy','er ,m','1234','2013-09-21','1'),('ankit','Car bearing','2400','2013-09-22','1'),('ankit','Door Seal','1000','2013-09-22','1'),('ankit','Car bearing','2400','2013-09-22','1'),('ankit','Door Seal','1000','2013-09-22','1');
/*!40000 ALTER TABLE `regorder_spare` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-10-27 16:09:13
