-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.12

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
-- Table structure for table `authors_list`
--

DROP TABLE IF EXISTS `authors_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `authors_list` (
  `id_authors_list` int(11) NOT NULL AUTO_INCREMENT,
  `Author_name_surname` varchar(45) DEFAULT NULL,
  `Country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_authors_list`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authors_list`
--

LOCK TABLES `authors_list` WRITE;
/*!40000 ALTER TABLE `authors_list` DISABLE KEYS */;
INSERT INTO `authors_list` VALUES (1,'Riku Korhonens','Finland'),(2,'Yuval Harari','Israel'),(3,'Karls Gustavs Jungs','Switzerland'),(4,'Ričards Rors','USA'),(5,'Inga Žolude','Latvia'),(6,'Ieva Melgalve','Latvia'),(7,'Andris Rubenis','Latvia'),(8,'Bils Braisons','Great Britain');
/*!40000 ALTER TABLE `authors_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books_list`
--

DROP TABLE IF EXISTS `books_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `books_list` (
  `id_books_list` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) DEFAULT NULL,
  `Author` varchar(45) DEFAULT NULL,
  `Year` year(4) DEFAULT NULL,
  `Category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_books_list`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books_list`
--

LOCK TABLES `books_list` WRITE;
/*!40000 ALTER TABLE `books_list` DISABLE KEYS */;
INSERT INTO `books_list` VALUES (1,'Ārstu romāns','Riku Korhonens',2013,'daiļliteratūra'),(2,'Sapiens: A Brief History of Humankind','Yuval Harari',2011,'history'),(3,'Dvēseles pasaule','Karls Gustavs Jungs',1994,'psychology'),(4,'Šeit un tagad','Ričards Rors',2019,'philosophy'),(5,'Santa Biblia','Inga Žolude',2013,'fiction'),(6,'Mēness teātris','Ieva Melgalve',2015,'fiction'),(7,'Klusā meitene','Pēters Hēgs',2006,'fikcion'),(8,'Senās Romas kultūra','Andris Rubenis',1995,'history'),(9,'Īsi stāsti gandrīz par visu','Bils Braisons',2006,'history'),(10,'Mājas. Īsa privātās dzīves vēsture','Bils Braisons',2014,'history'),(11,'Silta zeme','Inga Žolude',2008,'Fiction'),(12,'Sarkanie Bērni','Inga Žolude',2012,'Fiction');
/*!40000 ALTER TABLE `books_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-18 13:02:02
