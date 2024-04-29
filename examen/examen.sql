CREATE DATABASE  IF NOT EXISTS `examen_mod_iii_tienda` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `examen_mod_iii_tienda`;

DROP TABLE IF EXISTS `fabricantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fabricantes` (
  `id_fabricante` int unsigned NOT NULL AUTO_INCREMENT,
  `fabricante` varchar(100) NOT NULL,
  PRIMARY KEY (`id_fabricante`),
  UNIQUE KEY `id_fabricante` (`id_fabricante`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `fabricantes` WRITE;
/*!40000 ALTER TABLE `fabricantes` DISABLE KEYS */;
INSERT INTO `fabricantes` VALUES (1,'Asus'),(2,'Lenovo'),(3,'Hewlett-Packard'),(4,'Samsung'),(5,'Seagate'),(6,'Crucial'),(7,'Gigabyte'),(8,'Huawei'),(9,'Xiaomi');
/*!40000 ALTER TABLE `fabricantes` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id_producto` int unsigned NOT NULL AUTO_INCREMENT,
  `producto` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `fk_fabricante` int unsigned DEFAULT NULL,
  PRIMARY KEY (`id_producto`),
  UNIQUE KEY `id_producto` (`id_producto`),
  KEY `fk_fabricante` (`fk_fabricante`),
  CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`fk_fabricante`) REFERENCES `fabricantes` (`id_fabricante`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Disco duro SATA3 1TB',86.99,5),(2,'Memoria RAM DDR4 8GB',120,6),(3,'Disco SSD 1 TB',150.99,4),(4,'GeForce GTX 1050Ti',185,7),(5,'GeForce GTX 1080 Xtreme',755,6),(6,'Monitor 24 LED Full HD',202,1),(7,'Monitor 27 LED Full HD',245.99,1),(8,'Portátil Yoga 520',559,2),(9,'Portátil Ideapd 320',444,2),(10,'Impresora HP Deskjet 3720',59.99,3),(11,'Impresora HP Laserjet Pro M26nw',180,3),(12,'Rack porta discos 3,5',75,5);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
