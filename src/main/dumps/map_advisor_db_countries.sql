-- MySQL dump 10.13  Distrib 8.0.29, for macos12 (x86_64)
--
-- Host: 127.0.0.1    Database: map_advisor_db
-- ------------------------------------------------------
-- Server version	5.7.44

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `countries`
--

DROP TABLE IF EXISTS `countries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `countries` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(255) NOT NULL,
  `latitude` decimal(8,6) DEFAULT NULL,
  `longitude` decimal(9,6) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries`
--

LOCK TABLES `countries` WRITE;
/*!40000 ALTER TABLE `countries` DISABLE KEYS */;
INSERT INTO `countries` VALUES (1,'Central African Republic',6.571232,20.482967),(2,'Finland',64.500422,26.266371),(3,'Lesotho',-29.581000,28.243011),(4,'Benin',9.647321,2.343136),(5,'Eritrea',15.373203,38.841286),(6,'Marshall Islands',7.643273,168.626921),(7,'Mozambique',-17.259324,35.551422),(8,'Holy See',41.903365,12.452254),(9,'Mali',17.350279,-3.524423),(10,'Cote d\'Ivoire',7.631534,-5.555619),(11,'Georgia',42.176312,43.517446),(12,'Nepal',28.253007,83.938548),(13,'Laos',18.502744,103.763291),(14,'San Marino',43.943640,12.458633),(15,'Montenegro',42.791593,19.250305),(16,'Liberia',6.448092,-9.307914),(17,'Guinea-Bissau',12.030308,-14.965217),(18,'Macedonia',41.599682,21.697476),(19,'Lithuania',55.335670,23.898123),(20,'Niger',17.426149,9.397648),(21,'Antigua and Barbuda',17.279818,-61.791237),(22,'Germany',51.106592,10.393662),(23,'St. Kitts and Nevis',17.326191,-62.753520),(24,'Sao Tome and Principe',0.456979,6.736586),(25,'Turkey',39.060595,35.179672),(26,'United States',45.675145,-112.453697),(27,'Andorra',42.548653,1.576765),(28,'Bhutan',27.415414,90.429435),(29,'Cyprus',35.045883,33.221763),(30,'Dominican Republic',18.894447,-70.484634),(31,'Greece',39.068537,22.959746),(32,'Croatia',45.051162,16.411778),(33,'Italy',42.795782,12.071743),(34,'Liechtenstein',47.151849,9.554268),(35,'Mongolia',46.835291,103.083218),(36,'Malawi',-13.216022,34.307155),(37,'South Sudan',7.295766,30.315964),(38,'South Korea',36.375089,127.834772),(39,'Portugal',39.600989,-8.562736),(40,'Uzbekistan',41.750444,63.169364),(41,'Sierra Leone',8.560285,-11.791922),(42,'Cameroon',5.685952,12.743594),(43,'Czech Republic',49.742859,15.338412),(44,'Singapore',1.351615,103.808051),(45,'Bahamas',24.201126,-76.546622),(46,'France',39.496399,1.498631),(47,'Micronesia, Fed. Sts.',6.492380,159.404221),(48,'Tuvalu',-7.827722,178.557551),(49,'St. Vincent and the Grenadines',13.254811,-61.193766),(50,'Comoros',-11.892755,43.675920),(51,'Rwanda',-1.997892,29.917652),(52,'Azerbaijan',40.296916,48.819879),(53,'Equatorial Guinea',1.712339,10.341982),(54,'Kuwait',29.340791,47.590876),(55,'Lebanon',33.920267,35.888027),(56,'Mauritania',20.259851,-10.332298),(57,'Chad',15.361167,18.664480),(58,'Indonesia',-2.230214,117.300428),(59,'Myanmar',21.154319,96.506921),(60,'St. Lucia',13.897866,-60.968711),(61,'Belarus',53.539998,28.046788),(62,'Gabon',-0.590944,11.797236),(63,'Guyana',4.792018,-58.974781),(64,'Senegal',14.366966,-14.467654),(65,'Bermuda',32.316086,-64.739605),(66,'Gambia',13.452649,-15.386643),(67,'Jordan',31.253316,36.786730),(68,'American Samoa',-14.304407,-170.707832),(69,'Congo Republic',-0.840232,15.224293),(70,'Ireland',53.176382,-8.150579),(71,'Netherlands',51.695947,4.577251),(72,'Sudan',16.046354,30.014649),(73,'Tajikistan',38.528178,71.042004),(74,'Algeria',28.163239,2.632388),(75,'Guinea',10.438212,-10.941772),(76,'Yemen',15.905517,47.599591),(77,'Canada',61.392017,-98.265329),(78,'Peru',-9.163760,-74.375628),(79,'Papua New Guinea',-6.478768,145.241217),(80,'Qatar',25.297876,51.188069),(81,'Thailand',15.127036,101.017361),(82,'Venezuela',7.122449,-66.169564),(83,'Dominica',15.435595,-61.355757),(84,'Bulgaria',42.761377,25.231506),(85,'Jamaica',18.151419,-77.319011),(86,'Hungary',47.166502,19.413448),(87,'Mauritius',-20.251869,57.870737),(88,'Panama',8.507186,-80.102662),(89,'Anguilla',18.222877,-63.060077),(90,'Armenia',40.286620,44.946824),(91,'Brazil',-10.773109,-53.089820),(92,'Guam',13.443566,144.775596),(93,'India',23.016987,79.608493),(94,'Kazakhstan',48.015986,66.657825),(95,'Nauru',-0.528742,166.923130),(96,'Poland',52.124610,19.400884),(97,'Estonia',58.674136,25.527616),(98,'Palestine',31.914320,35.204125),(99,'Samoa',-13.758364,-172.159464),(100,'Australia',-25.736847,134.484570),(101,'Ethiopia',8.633291,39.616176),(102,'Iran',32.739463,54.197766),(103,'Malta',35.890522,14.441923),(104,'Solomon Islands',-8.918214,159.634315),(105,'Ecuador',-1.427420,-78.767072),(106,'Costa Rica',9.970203,-84.187942),(107,'Sri Lanka',7.608086,80.704727),(108,'Nicaragua',12.839906,-85.034783),(109,'United Kingdom',48.097397,-5.875658),(110,'Albania',41.142285,20.068385),(111,'Belgium',50.642851,4.663989),(112,'Syria',35.013134,38.505132),(113,'Spain',40.226830,-3.649565),(114,'Guatemala',15.702135,-90.356242),(115,'Iceland',64.997588,-18.605467),(116,'Monaco',43.747983,7.412822),(117,'South Africa',-28.993203,25.088778),(118,'Zambia',-13.453019,27.798249),(119,'Seychelles',-6.354370,52.229899),(120,'Afghanistan',33.838806,66.026471),(121,'Namibia',-22.133246,17.218278),(122,'Russia',61.946135,96.577693),(123,'Israel',31.358456,34.965810),(124,'Timor-Leste',-8.822976,125.853675),(125,'Bolivia',-16.714610,-64.670932),(126,'Cambodia',12.716432,104.923981),(127,'Aruba',12.515627,-69.975641),(128,'China',36.523389,103.962456),(129,'Kyrgyz Republic',41.465055,74.555597),(130,'Eswatini',-26.562642,31.497528),(131,'Djibouti',11.749676,42.577765),(132,'Moldova',47.193869,28.473931),(133,'Romania',45.843615,24.969259),(134,'Slovakia',48.707531,19.491654),(135,'Vanuatu',-16.255053,167.718146),(136,'Japan',37.562162,137.990745),(137,'Philippines',11.741833,122.878708),(138,'Fiji',-17.453530,171.983227),(139,'Haiti',18.941609,-72.679458),(140,'North Korea',40.143064,127.181957),(141,'Tunisia',34.110859,9.561336),(142,'Zimbabwe',-19.000098,29.871838),(143,'British Indian Ocean Territory',-7.334266,72.434027),(144,'Sweden',62.789897,16.739754),(145,'Cabo Verde',15.978973,-23.967785),(146,'Belize',17.217666,-88.684767),(147,'Switzerland',46.802569,8.234429),(148,'Kenya',0.529562,37.858021),(149,'Togo',8.534960,0.975722),(150,'Oman',20.597695,56.111383),(151,'Uganda',1.279963,32.386218),(152,'Argentina',-35.376436,-65.167727),(153,'Palau',7.501882,134.568687),(154,'Trinidad and Tobago',10.468641,-61.253177),(155,'Honduras',14.819222,-86.619146),(156,'Tonga',-20.402920,-174.836286),(157,'Chili',-37.852490,-71.373980),(158,'Nigeria',9.593960,8.105306),(159,'Vietnam',16.659256,106.301474),(160,'Cuba',21.621170,-79.036352),(161,'Bonaire, Saint Eustatius and Saba',44.168115,17.786531),(162,'El Salvador',13.736897,-88.866512),(163,'Uruguay',-32.799645,-56.012396),(164,'Angola',-12.295285,17.544676),(165,'Bangladesh',23.843232,90.268498),(166,'Malaysia',3.792367,109.708194),(167,'Tokelau',-9.195175,-171.852660),(168,'Tanzania',-6.270354,34.823454),(169,'Botswana',-22.182004,23.815028),(170,'Barbados',13.178715,-59.561955),(171,'Colombia',3.901156,-73.073369),(172,'New Zealand',-41.812813,171.381461),(173,'Maldives',3.216335,73.252227),(174,'Morocco',31.883625,-6.317845),(175,'Paraguay',-23.236211,-58.391024),(176,'Serbia',44.031498,20.805272),(177,'Suriname',4.126395,-55.911826),(178,'Bahrain',26.022410,50.559643),(179,'DR Congo',-2.876235,23.655006),(180,'Egypt',26.545427,29.797282),(181,'Luxembourg',49.770630,6.087814),(182,'Norway',68.792517,15.379673),(183,'Pakistan',29.941870,69.352262),(184,'Ukraine',49.017088,31.387115),(185,'Burundi',-3.356175,29.887145),(186,'Madagascar',-19.373383,46.706039),(187,'Grenada',12.112925,-61.679380),(188,'Kiribati',1.834562,-154.458271),(189,'Iraq',33.048024,43.772135),(190,'Western Sahara',24.661671,-13.136541),(191,'Libya',27.043954,18.023287),(192,'Mexico',23.950464,-102.532885),(193,'Turkmenistan',39.218793,58.391315),(194,'Denmark',74.543412,-40.902868),(195,'United Arab Emirates',23.903193,54.340734),(196,'Austria',47.592903,14.140193),(197,'Brunei Darussalam',4.521445,114.761099),(198,'Somalia',6.063724,45.862590),(199,'Saudi Arabia',24.122888,44.545719),(200,'Slovenia',46.123564,14.826537),(201,'Burkina Faso',12.277930,-1.740141),(202,'Ghana',7.959848,-1.207301),(203,'Latvia',56.857534,24.929424);
/*!40000 ALTER TABLE `countries` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-09 18:02:26
