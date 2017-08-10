/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2017-08-10 10:45:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `lItemId` bigint(20) NOT NULL AUTO_INCREMENT,
  `vItem` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`lItemId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', 'item1');
INSERT INTO `item` VALUES ('2', 'item2');
INSERT INTO `item` VALUES ('3', 'item3');
INSERT INTO `item` VALUES ('4', 'item4');
INSERT INTO `item` VALUES ('5', 'item5');
INSERT INTO `item` VALUES ('6', 'item6');
INSERT INTO `item` VALUES ('7', 'item7');
INSERT INTO `item` VALUES ('8', 'item8');
INSERT INTO `item` VALUES ('9', 'item9');
INSERT INTO `item` VALUES ('10', 'item10');
INSERT INTO `item` VALUES ('11', 'item11');
INSERT INTO `item` VALUES ('12', 'item12');
INSERT INTO `item` VALUES ('13', 'item13');
INSERT INTO `item` VALUES ('14', 'item14');
INSERT INTO `item` VALUES ('15', 'item15');
INSERT INTO `item` VALUES ('16', 'item16');
INSERT INTO `item` VALUES ('17', 'item17');
INSERT INTO `item` VALUES ('18', 'item18');
INSERT INTO `item` VALUES ('19', 'item19');
INSERT INTO `item` VALUES ('20', 'item20');
