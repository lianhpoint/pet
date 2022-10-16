-- MySQL dump 10.13  Distrib 5.6.40, for Win64 (x86_64)
--
-- Host: localhost    Database: adopt
-- ------------------------------------------------------
-- Server version	5.6.40

DROP DATABASE IF EXISTS adopt;
CREATE DATABASE adopt;
USE adopt;

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
-- Table structure for table `admins`
--

DROP TABLE IF EXISTS `admins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admins` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adminName` varchar(20) NOT NULL COMMENT '管理员的名字',
  `adminPwd` varchar(20) NOT NULL COMMENT '密码',
  `realName` varchar(20) NOT NULL COMMENT '真实的名字',
  `telephone` varchar(20) NOT NULL COMMENT '电话',
  `Email` varchar(20) NOT NULL,
  `birthday` date NOT NULL,
  `sex` varchar(3) NOT NULL,
  `pic` varchar(100) DEFAULT 'a.png',
  `remark` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admins`
--

LOCK TABLES `admins` WRITE;
/*!40000 ALTER TABLE `admins` DISABLE KEYS */;
INSERT INTO `admins` VALUES (1,'齐达内','yi123','杨一','13902193927','2425902914@qq.com','1993-09-10','男','a1.png','外号 玄宗。这位可是我们团队的玄学的代表。由他在似乎任何困难都能解决。'),(2,'卡瓦哈尔','wemz123','王二麻子','14402193927','2425902016@qq.com','1994-09-12','男','a2.png','外号 大傻；他是我们团队中最热心的人。他积极参加团队活动，并且在团队需要他的时候总是全力完成 '),(3,'瓦拉内','zs123','张三','14495893927','2917902016@qq.com','1994-10-12','男','a3.png','外号 学霸。这是为真正的学霸，他平时热心团队活动，并且负责团队的财务管理，认真严谨。'),(4,'拉莫斯','ls123','李四','14495893012','2107902016@qq.com','1994-06-09','男','a4.png','外号 水爷。这位团队外号虽然有水，但是一点也不水，他是我们的队长，为了团队他付出了最多的精力，而且他经常保护队员的安全.'),(5,'纳乔','ww123','王五','14495890112','2992902016@qq.com','1995-06-12','女','a5.png','外号 万金油。这位队员人如其名，是我们团队的万金油，当我们团队成员，紧急有事的时候，他都能顶上去，是一个很可靠的人。'),(6,'马塞洛','zl123','赵六','13195890112','2992909126@qq.com','1995-09-12','男','a6.png','外号 队宠。这位是我们的副队长，他是我们团队的开心果，在平常的活动中，他总能带给我们快乐。'),(7,'阿扎尔','sql1234','孙七','13195890081','2992909823@qq.com','1995-10-12','男','a7.png','外号 杨坤。这位不仅是团队中的颜值代表，而且是技术代表，他对小动物的保护知识是专家。他总能在保护小动物的方面给出正确的建议。'),(9,'本泽马','342','342','342','342','2019-08-20','女','a9.png','外号 背锅侠。这位是我们团队中的冲锋者，勇敢。但由于一些事，就造就了背锅侠的名号。'),(10,'莫德里奇','111','卢卡','15797959509','2425549281@qq.com','2019-08-05','男','a10.png','外号 魔笛。这位和我们团队中的杨坤都是技术与颜值的代表，而且他总是保持一颗冷静的心，在面对困难的时候，总是临危不惧。'),(11,'贝尔','1111','孙悟空','15797959509','2425549281@qq.com','1990-01-30','女','a11.png','号称孙悟空，无敌的存在！！');
/*!40000 ALTER TABLE `admins` ENABLE KEYS */;
UNLOCK TABLES;
