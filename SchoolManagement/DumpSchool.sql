CREATE DATABASE  IF NOT EXISTS `db_school` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_school`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: db_school
-- ------------------------------------------------------
-- Server version	5.7.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fees`
--

DROP TABLE IF EXISTS `fees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `fees` (
  `TranID` int(11) NOT NULL AUTO_INCREMENT,
  `StudID` int(11) NOT NULL,
  `FeeType` varchar(45) NOT NULL,
  `Ammount` float NOT NULL,
  `TransDate` date NOT NULL,
  PRIMARY KEY (`TranID`),
  KEY `SID_idx` (`StudID`),
  CONSTRAINT `SID` FOREIGN KEY (`StudID`) REFERENCES `student` (`StudentID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fees`
--

LOCK TABLES `fees` WRITE;
/*!40000 ALTER TABLE `fees` DISABLE KEYS */;
INSERT INTO `fees` VALUES (1,4,'Admission',1900,'2020-08-12'),(2,5,'Admission',20000,'2020-08-12');
/*!40000 ALTER TABLE `fees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `result` (
  `ResultID` int(11) NOT NULL AUTO_INCREMENT,
  `StudID` int(11) NOT NULL,
  `Sub1` varchar(45) NOT NULL,
  `Mark1` int(11) NOT NULL,
  `Sub2` varchar(45) NOT NULL,
  `Mark2` int(11) NOT NULL,
  `Sub3` varchar(45) NOT NULL,
  `Mark3` int(11) NOT NULL,
  `Sub4` varchar(45) NOT NULL,
  `Mark4` int(11) NOT NULL,
  `Sub5` varchar(45) NOT NULL,
  `Mark5` int(11) NOT NULL,
  `Total` int(11) NOT NULL,
  `Avg` float NOT NULL,
  PRIMARY KEY (`ResultID`),
  UNIQUE KEY `StudID_UNIQUE` (`StudID`),
  CONSTRAINT `studID` FOREIGN KEY (`StudID`) REFERENCES `student` (`StudentID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES (6,4,'marathi',80,'Sanskrit',85,'Math',95,'English',80,'history',90,430,86),(7,5,'marathi',80,'Sanskrit',85,'Math',95,'English',80,'history',90,430,86);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `StudentID` int(11) NOT NULL,
  `Name` varchar(80) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Class` varchar(45) NOT NULL,
  `AdmissionFees` float NOT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Sandy','Male','praksash nagar','Fifth',2000),(2,'Sandip','Male','Prakash nagar','Sixth',5000),(3,'Vishal','Male','Parli','Seventh',500),(4,'Sandip Shivaji Pimple','Male','Prakash Nagar','Ninth',1900),(5,'Jayram Puri','Male','Latur','Ninth',20000);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-12 15:44:51
