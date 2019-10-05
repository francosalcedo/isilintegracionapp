/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : notas

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 04/10/2019 19:04:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ALUMNO
-- ----------------------------
DROP TABLE IF EXISTS `ALUMNO`;
CREATE TABLE `ALUMNO` (
  `dni_alu` int(255) NOT NULL AUTO_INCREMENT,
  `app_alu` varchar(255) NOT NULL,
  `apm_alu` varchar(255) NOT NULL,
  `nom_alu` varchar(255) DEFAULT NULL,
  `dir_alu` text,
  `telf_alu` varchar(255) DEFAULT NULL,
  `email_alu` varchar(255) DEFAULT NULL,
  `edad_alu` smallint(5) DEFAULT NULL,
  `nacion_alu` varchar(255) DEFAULT NULL,
  UNIQUE KEY `key_dni_alu` (`dni_alu`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for CARRERA
-- ----------------------------
DROP TABLE IF EXISTS `CARRERA`;
CREATE TABLE `CARRERA` (
  `id_carrera` int(255) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id_carrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for CURSO
-- ----------------------------
DROP TABLE IF EXISTS `CURSO`;
CREATE TABLE `CURSO` (
  `id_curso` int(255) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `credito` int(255) NOT NULL,
  `proyecto` varchar(255) DEFAULT NULL,
  `id_sede` int(255) DEFAULT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for DISTRITO
-- ----------------------------
DROP TABLE IF EXISTS `DISTRITO`;
CREATE TABLE `DISTRITO` (
  `id_distrito` int(255) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_distrito`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for PROFESOR
-- ----------------------------
DROP TABLE IF EXISTS `PROFESOR`;
CREATE TABLE `PROFESOR` (
  `dni_pro` int(255) NOT NULL AUTO_INCREMENT,
  `app_pro` varchar(255) DEFAULT NULL,
  `apm_pro` varchar(255) DEFAULT NULL,
  `nom_pro` varchar(255) DEFAULT NULL,
  `dir_pro` text,
  `email_pro` varchar(255) DEFAULT NULL,
  `id_distrito` int(255) DEFAULT NULL,
  PRIMARY KEY (`dni_pro`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
