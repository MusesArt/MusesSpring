/*
 Navicat MySQL Data Transfer

 Source Server         : muses_art
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : muses.deepicecream.com:3306
 Source Schema         : musesart

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 08/04/2020 22:25:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `district` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `signer_mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `signer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `default_address` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_7rod8a71yep5vxasb0ms3osbg`(`user_id`) USING BTREE,
  CONSTRAINT `FK_7rod8a71yep5vxasb0ms3osbg` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 413 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (406, '2019-06-10 11:49:30', '留和路', '杭州市', '西湖区', '浙江省', '12345678910', '南唐', 122, b'1');
INSERT INTO `address` VALUES (407, '2019-05-29 15:17:47', '答辩现场', '金华市', '义乌市', '浙江省', '13758235351', '美饰艺术', 124, b'1');
INSERT INTO `address` VALUES (408, '2019-03-22 10:44:39', '广东', '韶关市', '武江区', '广东省', '123', 'gdh', 127, b'0');
INSERT INTO `address` VALUES (409, '2019-04-17 15:11:54', '1', '杭州市', '滨江区', '浙江省', '1', '1', 133, b'0');
INSERT INTO `address` VALUES (410, '2019-04-22 12:17:17', '缪斯公寓12幢617室', '杭州市', '余杭区', '浙江省', '13758235351', '艺术家', 132, b'0');
INSERT INTO `address` VALUES (411, '2019-06-10 11:49:54', '西湖', '杭州市', '滨江区', '浙江省', '01987654321', '北宋', 122, b'0');
INSERT INTO `address` VALUES (412, '2019-09-19 08:09:15', '留和路', '杭州市', '滨江区', '浙江省', '13567116463', '好纠结', 139, b'1');

-- ----------------------------
-- Table structure for attribute
-- ----------------------------
DROP TABLE IF EXISTS `attribute`;
CREATE TABLE `attribute`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodity_id` int(11) NULL DEFAULT NULL,
  `image_flag` bit(1) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_rathmphdlc9epuq7yl4igc630`(`commodity_id`) USING BTREE,
  CONSTRAINT `FK_rathmphdlc9epuq7yl4igc630` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 381 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attribute
-- ----------------------------
INSERT INTO `attribute` VALUES (219, 110, b'0', '尺寸');
INSERT INTO `attribute` VALUES (220, 110, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (221, 111, b'0', '尺寸');
INSERT INTO `attribute` VALUES (222, 111, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (223, 112, b'0', '尺寸');
INSERT INTO `attribute` VALUES (224, 112, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (225, 113, b'0', '尺寸');
INSERT INTO `attribute` VALUES (226, 113, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (227, 114, b'0', '尺寸');
INSERT INTO `attribute` VALUES (228, 114, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (229, 115, b'0', '尺寸');
INSERT INTO `attribute` VALUES (230, 115, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (231, 116, b'0', '尺寸');
INSERT INTO `attribute` VALUES (232, 116, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (233, 117, b'0', '尺寸');
INSERT INTO `attribute` VALUES (234, 117, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (235, 118, b'0', '尺寸');
INSERT INTO `attribute` VALUES (236, 118, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (237, 119, b'0', '尺寸');
INSERT INTO `attribute` VALUES (238, 119, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (239, 120, b'0', '尺寸');
INSERT INTO `attribute` VALUES (240, 120, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (257, 129, b'0', '尺寸');
INSERT INTO `attribute` VALUES (258, 129, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (259, 130, b'0', '尺寸');
INSERT INTO `attribute` VALUES (260, 130, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (261, 131, b'0', '尺寸');
INSERT INTO `attribute` VALUES (262, 131, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (263, 132, b'0', '尺寸');
INSERT INTO `attribute` VALUES (264, 132, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (265, 133, b'0', '尺寸');
INSERT INTO `attribute` VALUES (266, 133, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (267, 134, b'0', '尺寸');
INSERT INTO `attribute` VALUES (268, 134, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (269, 135, b'0', '尺寸');
INSERT INTO `attribute` VALUES (270, 135, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (271, 136, b'0', '尺寸');
INSERT INTO `attribute` VALUES (272, 136, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (273, 137, b'0', '尺寸');
INSERT INTO `attribute` VALUES (274, 137, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (275, 138, b'0', '尺寸');
INSERT INTO `attribute` VALUES (276, 138, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (277, 139, b'0', '尺寸');
INSERT INTO `attribute` VALUES (278, 139, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (279, 140, b'0', '尺寸');
INSERT INTO `attribute` VALUES (280, 140, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (281, 141, b'0', '尺寸');
INSERT INTO `attribute` VALUES (282, 141, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (283, 142, b'0', '尺寸');
INSERT INTO `attribute` VALUES (284, 142, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (285, 143, b'0', '尺寸');
INSERT INTO `attribute` VALUES (286, 143, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (287, 144, b'0', '尺寸');
INSERT INTO `attribute` VALUES (288, 144, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (289, 145, b'0', '尺寸');
INSERT INTO `attribute` VALUES (290, 145, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (291, 146, b'0', '尺寸');
INSERT INTO `attribute` VALUES (292, 146, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (293, 147, b'0', '尺寸');
INSERT INTO `attribute` VALUES (294, 147, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (295, 148, b'0', '尺寸');
INSERT INTO `attribute` VALUES (296, 148, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (297, 149, b'0', '尺寸');
INSERT INTO `attribute` VALUES (298, 149, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (299, 150, b'0', '尺寸');
INSERT INTO `attribute` VALUES (300, 150, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (301, 151, b'0', '尺寸');
INSERT INTO `attribute` VALUES (302, 151, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (303, 152, b'0', '尺寸');
INSERT INTO `attribute` VALUES (304, 152, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (305, 153, b'0', '尺寸');
INSERT INTO `attribute` VALUES (306, 153, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (307, 154, b'0', '尺寸');
INSERT INTO `attribute` VALUES (308, 154, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (309, 155, b'0', '尺寸');
INSERT INTO `attribute` VALUES (310, 155, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (311, 156, b'0', '尺寸');
INSERT INTO `attribute` VALUES (312, 156, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (313, 157, b'0', '尺寸');
INSERT INTO `attribute` VALUES (314, 157, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (315, 158, b'0', '尺寸');
INSERT INTO `attribute` VALUES (316, 158, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (317, 159, b'0', '尺寸');
INSERT INTO `attribute` VALUES (318, 159, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (319, 160, b'0', '尺寸');
INSERT INTO `attribute` VALUES (320, 160, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (321, 161, b'0', '尺寸');
INSERT INTO `attribute` VALUES (322, 161, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (323, 162, b'0', '尺寸');
INSERT INTO `attribute` VALUES (324, 162, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (325, 163, b'0', '尺寸');
INSERT INTO `attribute` VALUES (326, 163, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (327, 164, b'0', '尺寸');
INSERT INTO `attribute` VALUES (328, 164, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (329, 165, b'0', '尺寸');
INSERT INTO `attribute` VALUES (330, 165, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (331, 166, b'0', '尺寸');
INSERT INTO `attribute` VALUES (332, 166, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (333, 167, b'0', '尺寸');
INSERT INTO `attribute` VALUES (334, 167, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (335, 168, b'0', '尺寸');
INSERT INTO `attribute` VALUES (336, 168, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (337, 169, b'0', '尺寸');
INSERT INTO `attribute` VALUES (338, 169, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (339, 170, b'0', '尺寸');
INSERT INTO `attribute` VALUES (340, 170, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (341, 171, b'0', '尺寸');
INSERT INTO `attribute` VALUES (342, 171, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (343, 172, b'0', '尺寸');
INSERT INTO `attribute` VALUES (344, 172, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (345, 173, b'0', '尺寸');
INSERT INTO `attribute` VALUES (346, 173, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (347, 174, b'0', '尺寸');
INSERT INTO `attribute` VALUES (348, 174, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (349, 175, b'0', '尺寸');
INSERT INTO `attribute` VALUES (350, 175, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (351, 176, b'0', '尺寸');
INSERT INTO `attribute` VALUES (352, 176, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (353, 177, b'0', '尺寸');
INSERT INTO `attribute` VALUES (354, 177, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (355, 178, b'0', '尺寸');
INSERT INTO `attribute` VALUES (356, 178, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (357, 179, b'0', '尺寸');
INSERT INTO `attribute` VALUES (358, 179, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (359, 180, b'0', '尺寸');
INSERT INTO `attribute` VALUES (360, 180, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (361, 181, b'0', '尺寸');
INSERT INTO `attribute` VALUES (362, 181, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (363, 182, b'0', '尺寸');
INSERT INTO `attribute` VALUES (364, 182, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (365, 183, b'0', '尺寸');
INSERT INTO `attribute` VALUES (366, 183, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (367, 184, b'0', '尺寸');
INSERT INTO `attribute` VALUES (368, 184, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (369, 185, b'0', '尺寸');
INSERT INTO `attribute` VALUES (370, 185, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (371, 186, b'0', '尺寸');
INSERT INTO `attribute` VALUES (372, 186, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (373, 187, b'0', '尺寸');
INSERT INTO `attribute` VALUES (374, 187, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (375, 188, b'0', '尺寸');
INSERT INTO `attribute` VALUES (376, 188, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (377, 189, b'0', '尺寸');
INSERT INTO `attribute` VALUES (378, 189, b'1', '颜色分类');
INSERT INTO `attribute` VALUES (379, 190, b'0', '尺寸');
INSERT INTO `attribute` VALUES (380, 190, b'1', '颜色分类');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `commodity_id` int(11) NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `parameter` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_59kw1c7lffaa0bb0pjfv3gten`(`commodity_id`) USING BTREE,
  INDEX `FK_9emlp6m95v5er2bcqkjsw48he`(`user_id`) USING BTREE,
  CONSTRAINT `FK_59kw1c7lffaa0bb0pjfv3gten` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_9emlp6m95v5er2bcqkjsw48he` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 408 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES (389, '2019-03-22 09:15:25', 114, 1, 126, '尺寸:40*40;颜色分类:白色框', 'http://muses.deepicecream.com:7010/img/create/1553176351266Commodity.jpg', '1477,1488');
INSERT INTO `cart` VALUES (390, '2019-03-22 10:45:13', 112, 1, 127, '尺寸:40*40;颜色分类:木纹框;', 'http://muses.deepicecream.com:7010/img/create/1553176135581Commodity.jpg', NULL);
INSERT INTO `cart` VALUES (392, '2019-03-24 18:04:00', 110, 1, 124, '尺寸:50*70;颜色分类:白色框', 'http://muses.deepicecream.com:7010/img/create/1553175272745Commodity.jpg', '1435,1440');
INSERT INTO `cart` VALUES (393, '2019-03-25 20:30:58', 114, 1, 122, '尺寸:70*100;颜色分类:黑色框', 'http://muses.deepicecream.com:7010/img/create/1553176351266Commodity.jpg', '1485,1487');
INSERT INTO `cart` VALUES (396, '2019-03-27 12:51:44', 111, 2, 122, '尺寸:50*50;颜色分类:白色框', 'http://muses.deepicecream.com:7010/img/create/1553175956457Commodity.jpg', '1442,1452');
INSERT INTO `cart` VALUES (401, '2019-04-08 20:48:54', 129, 1, 124, '尺寸:60*80;颜色分类:黑色框', 'http://muses.deepicecream.com:7010/img/create/1553183287442Commodity.jpg', '1664,1667');
INSERT INTO `cart` VALUES (402, '2019-04-21 21:31:41', 129, 1, 132, '尺寸:50*70;颜色分类:白色框', 'http://muses.deepicecream.com:7010/img/create/1553183287442Commodity.jpg', '1663,1668');
INSERT INTO `cart` VALUES (403, '2019-04-22 12:18:58', 113, 1, 132, '尺寸:50*70;颜色分类:黑色框', 'http://muses.deepicecream.com:7010/img/create/1553176274194Commodity.jpg', '1471,1475');
INSERT INTO `cart` VALUES (404, '2019-05-22 23:10:31', 116, 1, 124, '尺寸:40*40;颜色分类:黑色框', 'http://muses.deepicecream.com:7010/img/create/1553177351970Commodity.jpg', '1501,1511');
INSERT INTO `cart` VALUES (406, '2019-06-10 10:40:03', 180, 1, 122, '尺寸:50*70;颜色分类:白色框', 'http://muses.deepicecream.com:7010/img/create/1559238418920Commodity.jpg', '2275,2280');
INSERT INTO `cart` VALUES (407, '2019-06-10 10:40:10', 110, 1, 122, '尺寸:50*70;颜色分类:黑色框', 'http://muses.deepicecream.com:7010/img/create/1553175272745Commodity.jpg', '1435,1439');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `comment` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `commodity_id` int(11) NULL DEFAULT NULL,
  `order_commodity_id` int(11) NULL DEFAULT NULL,
  `order_id` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `comment_level` int(11) NULL DEFAULT NULL,
  `star` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_ni432nwcrl7dat2b95rt2d67o`(`user_id`, `order_commodity_id`) USING BTREE,
  INDEX `FK_ktin2x8cc1ji8ena62te9nqf9`(`commodity_id`) USING BTREE,
  INDEX `FK_g6lkwn6n4g8ih93trmwsah5l6`(`order_id`) USING BTREE,
  INDEX `FK_p6oj4lpknoctiywjfckl1hmic`(`order_commodity_id`) USING BTREE,
  CONSTRAINT `FK_g6lkwn6n4g8ih93trmwsah5l6` FOREIGN KEY (`order_id`) REFERENCES `torder` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_ktin2x8cc1ji8ena62te9nqf9` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_mxoojfj9tmy8088avf57mpm02` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_p6oj4lpknoctiywjfckl1hmic` FOREIGN KEY (`order_commodity_id`) REFERENCES `order_commodity` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for comment_praise
-- ----------------------------
DROP TABLE IF EXISTS `comment_praise`;
CREATE TABLE `comment_praise`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_id` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_720mu4mkgeeixbi3iu9i6vjpo`(`user_id`, `comment_id`) USING BTREE,
  INDEX `FK_r4mniyccbk60fw7pljc3dv71n`(`comment_id`) USING BTREE,
  CONSTRAINT `FK_71hh9l19yjw48v6aa3kfp54n9` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_r4mniyccbk60fw7pljc3dv71n` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `brief` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  `click_num` int(11) NULL DEFAULT NULL,
  `commodity_sn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cover_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `discount_price` float NULL DEFAULT NULL,
  `goods_num` int(11) NULL DEFAULT NULL,
  `information` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `is_hot` bit(1) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `original_price` float NULL DEFAULT NULL,
  `ship_free` int(11) NULL DEFAULT NULL,
  `sold_num` int(11) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `show_flag` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_bj0td2dx4o1ydex71v0qfq66v`(`category_id`) USING BTREE,
  CONSTRAINT `FK_bj0td2dx4o1ydex71v0qfq66v` FOREIGN KEY (`category_id`) REFERENCES `commodity_category` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 191 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES (110, '2019-03-21 21:34:33', '花儿在枝头颤震，每一朵都似香炉散发着芬芳，声音和香气都在晚风中飘荡 风光 自然 现代', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553175272745Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 358, 428, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '花枝招展 风光装饰画 自然风景', 538, 1, 0, '2019-03-21 21:34:33', b'1');
INSERT INTO `commodity` VALUES (111, '2019-03-21 21:45:56', '潺潺的流水之声，完全可以媲美天籁之音 现代 ', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553175956457Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '瀑布 风光装饰画 自然风景', 178, 1, 0, '2019-03-21 21:45:56', b'1');
INSERT INTO `commodity` VALUES (112, '2019-03-21 21:48:56', '风和日丽，是一个适合学习的好日子呢 印象派', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553176135581Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '晴天&教学楼', 178, 1, 0, '2019-03-21 21:48:56', b'1');
INSERT INTO `commodity` VALUES (113, '2019-03-21 21:51:14', '装点你的窗台 抽象画 线条画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553176274194Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '多肉植物', 178, 1, 0, '2019-03-21 21:51:14', b'1');
INSERT INTO `commodity` VALUES (114, '2019-03-21 21:52:31', '太好的东西注定不会停留太久，所以我们必须学会认真地说再见。印象派', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553176351266Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '不在书店', 178, 1, 0, '2019-03-21 21:52:31', b'1');
INSERT INTO `commodity` VALUES (115, '2019-03-21 21:59:56', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553176796254Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '河岸游船', 178, 1, 0, '2019-03-21 21:59:56', b'0');
INSERT INTO `commodity` VALUES (116, '2019-03-21 22:09:12', '水帘洞位于大瀑布四十米至四十七米的高度上，全长一百三十四米，有六个洞窗、五个洞厅、三股洞泉和六个通道。', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553177351970Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '黄果树水帘洞 风光装饰画 自然风景', 178, 1, 0, '2019-03-21 22:09:12', b'1');
INSERT INTO `commodity` VALUES (117, '2019-03-21 22:15:04', '每个人心中都有一趟绿皮火车 印象派', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553177703690Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '绿皮火车', 178, 1, 0, '2019-03-21 22:15:04', b'0');
INSERT INTO `commodity` VALUES (118, '2019-03-21 22:21:01', '月亮湖是贵州省国家重点风景名胜区的主要景区之一，位于赤水市长期镇东13公里。', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553178061439Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '秋天的月亮湖 风光装饰画 自然风景', 178, 1, 0, '2019-03-21 22:21:01', b'0');
INSERT INTO `commodity` VALUES (119, '2019-03-21 22:27:55', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553178474655Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-21 22:27:55', b'0');
INSERT INTO `commodity` VALUES (120, '2019-03-21 22:28:59', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553178539154Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-21 22:28:59', b'0');
INSERT INTO `commodity` VALUES (121, '2019-03-21 22:31:33', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553178693062Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-21 22:31:33', b'0');
INSERT INTO `commodity` VALUES (122, '2019-03-21 23:05:06', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553180705912Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-21 23:05:06', b'0');
INSERT INTO `commodity` VALUES (129, '2019-03-21 23:48:07', '半坡野菊花，从山坡上泄下，金色的小花一丛丛、一簇簇，流顾半坡平凡、质朴而温馨的乐章。', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553183287442Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '野菊花 风光装饰画 自然风景', 178, 1, 0, '2019-03-21 23:48:07', b'1');
INSERT INTO `commodity` VALUES (130, '2019-03-22 08:08:45', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553213325439blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 08:08:45', b'0');
INSERT INTO `commodity` VALUES (131, '2019-03-22 08:30:34', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553214634184blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 08:30:34', b'0');
INSERT INTO `commodity` VALUES (132, '2019-03-22 08:35:36', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553214935600blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 08:35:36', b'0');
INSERT INTO `commodity` VALUES (133, '2019-03-22 08:47:27', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553215647028blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 08:47:27', b'0');
INSERT INTO `commodity` VALUES (134, '2019-03-22 08:49:15', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553215755274blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 08:49:15', b'0');
INSERT INTO `commodity` VALUES (135, '2019-03-22 09:03:23', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553216602599blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 09:03:23', b'0');
INSERT INTO `commodity` VALUES (136, '2019-03-22 09:58:38', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553219917605blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 09:58:38', b'0');
INSERT INTO `commodity` VALUES (137, '2019-03-22 10:11:13', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553220672690blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 10:11:13', b'0');
INSERT INTO `commodity` VALUES (138, '2019-03-22 10:12:02', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553220722085blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 10:12:02', b'0');
INSERT INTO `commodity` VALUES (139, '2019-03-22 10:21:23', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553221283414blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 10:21:23', b'0');
INSERT INTO `commodity` VALUES (140, '2019-03-22 10:26:06', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553221566389blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 10:26:06', b'0');
INSERT INTO `commodity` VALUES (141, '2019-03-22 10:27:38', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553221657929blob', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 10:27:38', b'0');
INSERT INTO `commodity` VALUES (142, '2019-03-22 23:07:42', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553267262064Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-22 23:07:42', b'0');
INSERT INTO `commodity` VALUES (143, '2019-03-25 19:49:37', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553514576704Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-25 19:49:37', b'0');
INSERT INTO `commodity` VALUES (144, '2019-03-25 19:52:31', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553514751396Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-25 19:52:31', b'0');
INSERT INTO `commodity` VALUES (145, '2019-03-25 20:26:08', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553516767974Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-25 20:26:08', b'0');
INSERT INTO `commodity` VALUES (146, '2019-03-26 00:47:28', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553532447762Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-26 00:47:28', b'0');
INSERT INTO `commodity` VALUES (147, '2019-03-26 00:51:27', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553532687305Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-26 00:51:27', b'0');
INSERT INTO `commodity` VALUES (148, '2019-03-27 11:43:30', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553658210334Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-27 11:43:30', b'0');
INSERT INTO `commodity` VALUES (149, '2019-03-27 14:04:52', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553666692300Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-27 14:04:52', b'0');
INSERT INTO `commodity` VALUES (150, '2019-03-27 14:19:39', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553667579326Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-27 14:19:39', b'0');
INSERT INTO `commodity` VALUES (151, '2019-03-27 14:27:33', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1553668052932Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-03-27 14:27:33', b'0');
INSERT INTO `commodity` VALUES (152, '2019-04-07 15:46:16', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1554623175697Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-04-07 15:46:16', b'0');
INSERT INTO `commodity` VALUES (153, '2019-04-22 20:44:13', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1555937052531Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-04-22 20:44:13', b'0');
INSERT INTO `commodity` VALUES (154, '2019-05-24 13:14:23', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558674863141Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-24 13:14:23', b'0');
INSERT INTO `commodity` VALUES (155, '2019-05-25 22:32:01', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558794720781Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-25 22:32:01', b'0');
INSERT INTO `commodity` VALUES (156, '2019-05-26 00:42:02', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558802522195Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-26 00:42:02', b'0');
INSERT INTO `commodity` VALUES (157, '2019-05-26 13:47:54', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558849673935Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-26 13:47:54', b'0');
INSERT INTO `commodity` VALUES (158, '2019-05-26 15:16:33', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558854993014Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-26 15:16:33', b'0');
INSERT INTO `commodity` VALUES (159, '2019-05-26 17:00:35', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558861235166Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-26 17:00:35', b'0');
INSERT INTO `commodity` VALUES (160, '2019-05-26 17:00:52', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558861251617Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-26 17:00:52', b'0');
INSERT INTO `commodity` VALUES (161, '2019-05-26 17:02:33', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558861353107Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-26 17:02:33', b'0');
INSERT INTO `commodity` VALUES (162, '2019-05-26 17:03:03', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558861382710Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-26 17:03:03', b'0');
INSERT INTO `commodity` VALUES (163, '2019-05-27 16:35:56', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1558946156165Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-27 16:35:56', b'0');
INSERT INTO `commodity` VALUES (164, '2019-05-29 21:13:20', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559135600311Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-29 21:13:20', b'0');
INSERT INTO `commodity` VALUES (165, '2019-05-30 15:08:08', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559200088173Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 15:08:08', b'0');
INSERT INTO `commodity` VALUES (166, '2019-05-30 15:10:27', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559200227284Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 15:10:27', b'0');
INSERT INTO `commodity` VALUES (167, '2019-05-30 15:10:48', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559200247707Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 15:10:48', b'0');
INSERT INTO `commodity` VALUES (168, '2019-05-30 15:44:21', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559202261296Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 15:44:21', b'0');
INSERT INTO `commodity` VALUES (169, '2019-05-30 15:56:10', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559202969588Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 15:56:10', b'0');
INSERT INTO `commodity` VALUES (170, '2019-05-30 15:56:21', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559202980504Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 15:56:21', b'0');
INSERT INTO `commodity` VALUES (171, '2019-05-30 16:46:54', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559206014237Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 16:46:54', b'0');
INSERT INTO `commodity` VALUES (172, '2019-05-30 17:59:36', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559210375612Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 17:59:36', b'0');
INSERT INTO `commodity` VALUES (173, '2019-05-30 18:22:46', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559211765679Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-30 18:22:46', b'0');
INSERT INTO `commodity` VALUES (174, '2019-05-31 01:29:55', '街角 现代 水彩画 简约', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559237395225Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 128, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '街角 水彩风格装饰画', 178, 1, 1, '2019-05-31 01:29:55', b'1');
INSERT INTO `commodity` VALUES (175, '2019-05-31 01:35:56', '铁塔 魔幻主义 印象派', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559237755842Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '铁塔 抽象波纹艺术', 178, 1, 0, '2019-05-31 01:35:56', b'1');
INSERT INTO `commodity` VALUES (176, '2019-05-31 01:37:56', '树与灯笼 装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559237875556Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '树与灯笼 毕加索风格 印象派', 158, 1, 0, '2019-05-31 01:37:56', b'1');
INSERT INTO `commodity` VALUES (177, '2019-05-31 01:40:10', '生命的绽放 装饰画 印象派 梵高 简约', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559238009710Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '生命的绽放 梵高向日葵风格', 178, 1, 0, '2019-05-31 01:40:10', b'1');
INSERT INTO `commodity` VALUES (178, '2019-05-31 01:42:43', '旅游见闻 墙绘装饰画 ', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559238163125Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '旅游见闻 墙绘风格 现代装饰画', 178, 1, 0, '2019-05-31 01:42:43', b'1');
INSERT INTO `commodity` VALUES (179, '2019-05-31 01:44:07', '彩色方格 现代装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559238247410Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '精灵 彩色方格风格 现代装饰画', 178, 1, 0, '2019-05-31 01:44:07', b'1');
INSERT INTO `commodity` VALUES (180, '2019-05-31 01:46:59', '木秀于林 水彩装饰画 水墨画 简约', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559238418920Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '木秀于林 自然风光装饰画 水彩风格', 178, 1, 0, '2019-05-31 01:46:59', b'1');
INSERT INTO `commodity` VALUES (181, '2019-05-31 11:38:58', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559273937968Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-31 11:38:58', b'0');
INSERT INTO `commodity` VALUES (182, '2019-05-31 11:39:32', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559273972408Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-31 11:39:32', b'0');
INSERT INTO `commodity` VALUES (183, '2019-05-31 13:32:55', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559280774603Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-31 13:32:55', b'0');
INSERT INTO `commodity` VALUES (184, '2019-05-31 14:49:34', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559285373988Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-31 14:49:34', b'0');
INSERT INTO `commodity` VALUES (185, '2019-05-31 17:12:18', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1559293937693Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-05-31 17:12:18', b'0');
INSERT INTO `commodity` VALUES (186, '2019-06-10 14:03:23', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1560146603456Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-06-10 14:03:23', b'0');
INSERT INTO `commodity` VALUES (187, '2019-06-24 09:55:44', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1561341343617Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-06-24 09:55:44', b'0');
INSERT INTO `commodity` VALUES (188, '2019-06-24 10:03:21', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1561341800562Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-06-24 10:03:21', b'0');
INSERT INTO `commodity` VALUES (189, '2019-10-19 14:12:49', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1571465569492Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2019-10-19 14:12:49', b'0');
INSERT INTO `commodity` VALUES (190, '2020-01-12 16:18:27', '用户自定义装饰画', NULL, 0, NULL, 'http://muses.deepicecream.com:7010/img/create/1578817106575Commodity.jpg', '<img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpTUzAs62mr_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17To1EqSJ1x5c_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TjlnzLMtoTx_!!17996653.jpg\' width=\"100%\"><img src=\'http://muses.deepicecream.com:7010/img/commodity/O1CN011z17TpCxuFdQIrX_!!17996653.jpg\' width=\"100%\">', 158, 100, '{\"品牌\": \"缪斯艺术\", \"图案\": \"自定义\", \"风格\": \"自定义\", \"产地\": \"中国大陆\", \"省份\": \"浙江省\", \"地市\": \"杭州市\", \"尺寸\": \"自定义\", \"外框类型\": \"自定义\", \"颜色分类\": \"自定义\", \"工艺\": \"喷绘\", \"装裱方式\": \"有框\", \"外框材质\": \"PS\", \"图片形式\": \"平面\", \"幅数\": \"单幅\", \"画芯材质\": \"油画布\"}', b'0', '用户自定义装饰画', 178, 1, 0, '2020-01-12 16:18:27', b'0');

-- ----------------------------
-- Table structure for commodity_category
-- ----------------------------
DROP TABLE IF EXISTS `commodity_category`;
CREATE TABLE `commodity_category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_tab` bit(1) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `parent_category_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_mp219fujuddw1t8lgxep454hy`(`parent_category_id`) USING BTREE,
  CONSTRAINT `FK_mp219fujuddw1t8lgxep454hy` FOREIGN KEY (`parent_category_id`) REFERENCES `commodity_category` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for filter
-- ----------------------------
DROP TABLE IF EXISTS `filter`;
CREATE TABLE `filter`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vip_only` bit(1) NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  `cover_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `filter_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `owner_id` int(11) NULL DEFAULT NULL,
  `publish_date` datetime(0) NULL DEFAULT NULL,
  `upload_id` int(11) NULL DEFAULT NULL,
  `brush_intensity` int(11) NULL DEFAULT NULL,
  `brush_size` int(11) NULL DEFAULT NULL,
  `smooth` int(11) NULL DEFAULT NULL,
  `checked` bit(1) NULL DEFAULT NULL,
  `usage_count` int(11) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_l4gcys92cg2hj4i0v0r9qkn41`(`category_id`) USING BTREE,
  INDEX `FK_145hri0sgl8ek2locuej94hsn`(`owner_id`) USING BTREE,
  CONSTRAINT `FK_145hri0sgl8ek2locuej94hsn` FOREIGN KEY (`owner_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_l4gcys92cg2hj4i0v0r9qkn41` FOREIGN KEY (`category_id`) REFERENCES `filter_category` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 672 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of filter
-- ----------------------------
INSERT INTO `filter` VALUES (1, b'0', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/245.png', '', '糖果砖块', 1, '2019-03-03 19:32:31', 245, 500, 512, 0, b'1', 373);
INSERT INTO `filter` VALUES (2, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/252.png', NULL, '朦胧印象', 1, '2019-03-03 19:53:08', 252, 500, 768, 500, b'1', 49);
INSERT INTO `filter` VALUES (3, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/220.png', NULL, '午后时光', 1, '2019-03-03 20:02:05', 220, 500, 768, 1000, b'1', 63);
INSERT INTO `filter` VALUES (5, b'0', 3, 'http://muses.deepicecream.com:7010/img/filter_cover/189.png', NULL, '黑白时代', 1, '2019-03-03 20:07:29', 189, 1000, 512, 0, b'1', 11);
INSERT INTO `filter` VALUES (6, b'0', 3, 'http://muses.deepicecream.com:7010/img/filter_cover/184.png', NULL, '水墨艺术', 1, '2019-03-03 20:09:46', 184, 1000, 512, 0, b'1', 17);
INSERT INTO `filter` VALUES (7, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/178.png', NULL, '蜂蜜', 1, '2019-03-03 20:13:01', 178, 1000, 512, 0, b'1', 30);
INSERT INTO `filter` VALUES (8, b'0', 2, 'http://muses.deepicecream.com:7010/img/filter_cover/163.png', NULL, '闪电', 1, '2019-03-03 20:17:16', 163, 1000, 512, 0, b'1', 8);
INSERT INTO `filter` VALUES (9, b'0', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/158.png', NULL, '错位方格', 1, '2019-03-03 20:19:47', 158, 1000, 512, 0, b'1', 3);
INSERT INTO `filter` VALUES (10, b'0', 2, 'http://muses.deepicecream.com:7010/img/filter_cover/150.png', NULL, '日暮', 1, '2019-03-03 20:21:42', 150, 1000, 512, 0, b'1', 3);
INSERT INTO `filter` VALUES (11, b'0', 2, 'http://muses.deepicecream.com:7010/img/filter_cover/146.png', NULL, '火焰', 1, '2019-03-03 20:24:08', 146, 1000, 512, 0, b'1', 1);
INSERT INTO `filter` VALUES (12, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/145.png', NULL, '抽象波纹', 1, '2019-03-03 20:25:45', 145, 1000, 512, 0, b'1', 26);
INSERT INTO `filter` VALUES (13, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/143.png', NULL, '抽象线条', 1, '2019-03-03 20:26:59', 143, 1000, 512, 0, b'1', 39);
INSERT INTO `filter` VALUES (14, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/140.png', NULL, '斑驳', 1, '2019-03-03 20:28:46', 140, 1000, 512, 0, b'1', 7);
INSERT INTO `filter` VALUES (15, b'0', 9, 'http://muses.deepicecream.com:7010/img/filter_cover/139.png', NULL, '水彩纸', 1, '2019-03-03 20:29:52', 139, 1000, 512, 0, b'1', 156);
INSERT INTO `filter` VALUES (16, b'0', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/137.png', NULL, '斑点', 1, '2019-03-03 20:32:26', 137, 1000, 512, 0, b'1', 4);
INSERT INTO `filter` VALUES (17, b'0', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/131.png', NULL, '石榴树', 1, '2019-03-03 20:34:04', 131, 1000, 512, 0, b'1', 2);
INSERT INTO `filter` VALUES (18, b'0', 2, 'http://muses.deepicecream.com:7010/img/filter_cover/123.png', NULL, '墙绘', 1, '2019-03-03 20:36:41', 123, 1000, 512, 0, b'1', 19);
INSERT INTO `filter` VALUES (19, b'0', 8, 'http://muses.deepicecream.com:7010/img/filter_cover/115.png', NULL, '皮影戏', 1, '2019-03-03 20:38:03', 115, 1000, 512, 0, b'1', 17);
INSERT INTO `filter` VALUES (20, b'0', 2, 'http://muses.deepicecream.com:7010/img/filter_cover/93.png', NULL, '光', 1, '2019-03-03 20:42:35', 93, 800, 512, 0, b'1', 8);
INSERT INTO `filter` VALUES (21, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/89.png', NULL, '冷色调', 1, '2019-03-03 20:44:05', 89, 1000, 512, 0, b'1', 188);
INSERT INTO `filter` VALUES (22, b'0', 9, 'http://muses.deepicecream.com:7010/img/filter_cover/71.png', NULL, '墨色', 1, '2019-03-03 20:46:37', 71, 1000, 512, 0, b'1', 20);
INSERT INTO `filter` VALUES (23, b'0', 7, 'http://muses.deepicecream.com:7010/img/filter_cover/69.png', NULL, '明月竹影', 1, '2019-03-03 20:48:44', 69, 1000, 512, 0, b'1', 16);
INSERT INTO `filter` VALUES (24, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/44.png', NULL, '毕加索', 1, '2019-03-03 21:35:21', 44, 1000, 512, 0, b'1', 11);
INSERT INTO `filter` VALUES (26, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/19.png', NULL, '向日葵', 1, '2019-03-03 21:51:18', 19, 1000, 512, 0, b'1', 19);
INSERT INTO `filter` VALUES (27, b'0', 6, 'http://muses.deepicecream.com:7010/img/filter_cover/24.png', NULL, '蒙克', 1, '2019-03-03 21:52:48', 24, 1000, 512, 0, b'1', 20);
INSERT INTO `filter` VALUES (30, b'0', 10, 'http://muses.deepicecream.com:7010/img/filter_cover/28.png', NULL, '康定斯', 1, '2019-03-03 21:59:49', 28, 1000, 512, 0, b'1', 16);
INSERT INTO `filter` VALUES (32, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/31.png', NULL, '星月夜', 1, '2019-03-03 22:02:36', 31, 1000, 512, 0, b'1', 19);
INSERT INTO `filter` VALUES (34, b'0', 7, 'http://muses.deepicecream.com:7010/img/filter_cover/46.png', NULL, '黄宾虹', 1, '2019-03-03 22:09:17', 46, 1000, 512, 0, b'1', 3);
INSERT INTO `filter` VALUES (35, b'0', 7, 'http://muses.deepicecream.com:7010/img/filter_cover/47.png', NULL, '郑板桥', 1, '2019-03-03 22:11:19', 47, 1000, 512, 0, b'1', 5);
INSERT INTO `filter` VALUES (36, b'0', 7, 'http://muses.deepicecream.com:7010/img/filter_cover/48.png', NULL, '郑燮', 1, '2019-03-03 22:12:21', 48, 1000, 512, 0, b'1', 5);
INSERT INTO `filter` VALUES (38, b'0', 10, 'http://muses.deepicecream.com:7010/img/filter_cover/68.png', NULL, '樱花', 1, '2019-03-03 22:16:25', 68, 1000, 512, 0, b'1', 5);
INSERT INTO `filter` VALUES (39, b'0', 7, 'http://muses.deepicecream.com:7010/img/filter_cover/75.png', NULL, '石涛', 1, '2019-03-03 22:19:01', 75, 1000, 512, 0, b'1', 9);
INSERT INTO `filter` VALUES (40, b'0', 7, 'http://muses.deepicecream.com:7010/img/filter_cover/76.png', NULL, '唐寅', 1, '2019-03-03 22:20:32', 76, 1000, 512, 0, b'1', 5);
INSERT INTO `filter` VALUES (41, b'0', 10, 'http://muses.deepicecream.com:7010/img/filter_cover/96.png', NULL, '黄昏', 124, '2019-03-03 22:24:25', 96, 1000, 512, 0, b'1', 4);
INSERT INTO `filter` VALUES (47, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/422.png', NULL, '栗色', 124, '2019-03-12 11:55:14', 422, 300, 512, 0, b'1', 54);
INSERT INTO `filter` VALUES (49, b'0', 10, 'http://muses.deepicecream.com:7010/img/filter_cover/424.png', NULL, '炭火', 122, '2019-03-12 11:56:47', 424, 300, 512, 0, b'1', 47);
INSERT INTO `filter` VALUES (60, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/447.png', NULL, '赤炎', 124, '2019-03-13 08:16:12', 447, 300, 512, 0, b'1', 11);
INSERT INTO `filter` VALUES (62, b'0', 6, 'http://muses.deepicecream.com:7010/img/filter_cover/449.png', NULL, '白咖啡', 112, '2019-03-13 12:28:55', 449, 300, 512, 0, b'1', 36);
INSERT INTO `filter` VALUES (66, b'0', 6, 'http://muses.deepicecream.com:7010/img/filter_cover/464.png', NULL, '牛奶咖啡', 124, '2019-03-13 21:50:17', 464, 300, 512, 0, b'1', 27);
INSERT INTO `filter` VALUES (77, b'0', 10, 'http://muses.deepicecream.com:7010/img/filter_cover/507.png', NULL, '瑰丽', 124, '2019-03-17 10:39:01', 507, 300, 512, 0, b'1', 25);
INSERT INTO `filter` VALUES (96, b'0', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/531.png', NULL, '波浪斑点', 124, '2019-03-18 04:30:18', 531, 372, 512, 0, b'1', 13);
INSERT INTO `filter` VALUES (171, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/1.jpg', NULL, '立体主义', 124, '2020-01-12 18:59:03', 1, 200, 256, 0, b'1', 0);
INSERT INTO `filter` VALUES (172, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/2.jpg', NULL, '羽毛', 124, '2020-01-12 18:59:03', 2, 200, 256, 0, b'1', 0);
INSERT INTO `filter` VALUES (173, b'0', 1, 'http://muses.deepicecream.com:7010/img/filter_cover/3.jpg', NULL, 'udnie', 124, '2020-01-12 18:59:03', 3, 200, 256, 0, b'1', 0);
INSERT INTO `filter` VALUES (175, b'0', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/670.png', NULL, '方格', 124, '2020-04-08 21:52:36', 670, 399, 512, 0, b'1', 0);
INSERT INTO `filter` VALUES (176, b'0', 8, 'http://muses.deepicecream.com:7010/img/filter_cover/668.png', NULL, '版画', 124, '2020-04-08 21:53:54', 668, 69, 256, NULL, b'1', 0);
INSERT INTO `filter` VALUES (177, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/664.png', NULL, '油画5', 124, '2020-04-08 21:55:08', 664, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (178, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/662.png', NULL, '缪斯', 124, '2020-04-08 21:56:22', 662, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (179, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/661.png', NULL, '油画6', 124, '2020-04-08 21:57:03', 661, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (180, b'1', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/660.png', NULL, '彩色方格', 124, '2020-04-08 21:57:25', 660, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (181, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/657.png', NULL, '油画7', 124, '2020-04-08 21:57:51', 657, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (182, b'0', 3, 'http://muses.deepicecream.com:7010/img/filter_cover/655.png', NULL, '素描2', 124, '2020-04-08 21:58:25', 655, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (183, b'0', 3, 'http://muses.deepicecream.com:7010/img/filter_cover/653.png', NULL, '素描1', 124, '2020-04-08 21:58:49', 653, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (184, b'0', 3, 'http://muses.deepicecream.com:7010/img/filter_cover/652.png', NULL, '素描3', 124, '2020-04-08 21:59:08', 652, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (186, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/644.png', NULL, '雨天', 124, '2020-04-08 22:00:02', 644, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (187, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/643.png', NULL, '花卉', 124, '2020-04-08 22:00:43', 643, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (188, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/642.png', NULL, '油画4', 124, '2020-04-08 22:01:05', 642, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (189, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/641.png', NULL, '油画1', 124, '2020-04-08 22:01:33', 641, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (190, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/640.png', NULL, '油画2', 124, '2020-04-08 22:01:51', 640, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (191, b'0', 5, 'http://muses.deepicecream.com:7010/img/filter_cover/639.png', NULL, '油画3', 124, '2020-04-08 22:02:09', 639, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (193, b'0', 9, 'http://muses.deepicecream.com:7010/img/filter_cover/637.png', NULL, '淡雅水粉', 124, '2020-04-08 22:03:07', 637, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (194, b'0', 6, 'http://muses.deepicecream.com:7010/img/filter_cover/636.png', NULL, '油画人像', 124, '2020-04-08 22:09:49', 636, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (195, b'0', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/579.png', NULL, '黄色方格', 124, '2020-04-08 22:17:07', 579, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (196, b'0', 4, 'http://muses.deepicecream.com:7010/img/filter_cover/632.png', NULL, '梦', 124, '2020-04-08 22:17:54', 632, NULL, NULL, NULL, NULL, 0);
INSERT INTO `filter` VALUES (197, b'0', 6, 'http://muses.deepicecream.com:7010/img/filter_cover/635.png', NULL, '人像', 124, '2020-04-08 22:18:44', 635, NULL, NULL, NULL, NULL, 0);

-- ----------------------------
-- Table structure for filter_category
-- ----------------------------
DROP TABLE IF EXISTS `filter_category`;
CREATE TABLE `filter_category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of filter_category
-- ----------------------------
INSERT INTO `filter_category` VALUES (1, '印象派', 'http://muses.deepicecream.com:7010/img/filter_category/class1.png');
INSERT INTO `filter_category` VALUES (2, '现代', 'http://muses.deepicecream.com:7010/img/filter_category/class2.png');
INSERT INTO `filter_category` VALUES (3, '素描', 'http://muses.deepicecream.com:7010/img/filter_category/class3.png');
INSERT INTO `filter_category` VALUES (4, '马赛克', 'http://muses.deepicecream.com:7010/img/filter_category/class4.png');
INSERT INTO `filter_category` VALUES (5, '油画', 'http://muses.deepicecream.com:7010/img/filter_category/class5.png');
INSERT INTO `filter_category` VALUES (6, '人像', 'http://muses.deepicecream.com:7010/img/filter_category/class6.png');
INSERT INTO `filter_category` VALUES (7, '中国画', 'http://muses.deepicecream.com:7010/img/filter_category/class7.png');
INSERT INTO `filter_category` VALUES (8, '版画', 'http://muses.deepicecream.com:7010/img/filter_category/class8.png');
INSERT INTO `filter_category` VALUES (9, '水彩', 'http://muses.deepicecream.com:7010/img/filter_category/class9.png');
INSERT INTO `filter_category` VALUES (10, '写实', 'http://muses.deepicecream.com:7010/img/filter_category/class10.png');

-- ----------------------------
-- Table structure for hot_key
-- ----------------------------
DROP TABLE IF EXISTS `hot_key`;
CREATE TABLE `hot_key`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `keyword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_binipr865uwtjw013dmynffgf`(`keyword`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hot_key
-- ----------------------------
INSERT INTO `hot_key` VALUES (4, '印象派');
INSERT INTO `hot_key` VALUES (9, '抽象');
INSERT INTO `hot_key` VALUES (5, '梵高');
INSERT INTO `hot_key` VALUES (1, '欧式');
INSERT INTO `hot_key` VALUES (2, '水墨画');
INSERT INTO `hot_key` VALUES (7, '现代');
INSERT INTO `hot_key` VALUES (8, '简约');
INSERT INTO `hot_key` VALUES (3, '莫奈');
INSERT INTO `hot_key` VALUES (6, '超现实主义');

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_id` int(11) NULL DEFAULT NULL,
  `commodity_id` int(11) NULL DEFAULT NULL,
  `image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_juv711onh57t679gty19erqmx`(`comment_id`) USING BTREE,
  INDEX `FK_ktfrvx8hbgjr4yl1dpbmukksr`(`commodity_id`) USING BTREE,
  CONSTRAINT `FK_juv711onh57t679gty19erqmx` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_ktfrvx8hbgjr4yl1dpbmukksr` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1413 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES (1332, NULL, 110, 'http://muses.deepicecream.com:7010/img/create/1553175272745Commodity.jpg');
INSERT INTO `image` VALUES (1333, NULL, 111, 'http://muses.deepicecream.com:7010/img/create/1553175956457Commodity.jpg');
INSERT INTO `image` VALUES (1334, NULL, 112, 'http://muses.deepicecream.com:7010/img/create/1553176135581Commodity.jpg');
INSERT INTO `image` VALUES (1335, NULL, 113, 'http://muses.deepicecream.com:7010/img/create/1553176274194Commodity.jpg');
INSERT INTO `image` VALUES (1336, NULL, 114, 'http://muses.deepicecream.com:7010/img/create/1553176351266Commodity.jpg');
INSERT INTO `image` VALUES (1337, NULL, 115, 'http://muses.deepicecream.com:7010/img/create/1553176796254Commodity.jpg');
INSERT INTO `image` VALUES (1338, NULL, 116, 'http://muses.deepicecream.com:7010/img/create/1553177351970Commodity.jpg');
INSERT INTO `image` VALUES (1339, NULL, 117, 'http://muses.deepicecream.com:7010/img/create/1553177703690Commodity.jpg');
INSERT INTO `image` VALUES (1340, NULL, 118, 'http://muses.deepicecream.com:7010/img/create/1553178061439Commodity.jpg');
INSERT INTO `image` VALUES (1341, NULL, 119, 'http://muses.deepicecream.com:7010/img/create/1553178474655Commodity.jpg');
INSERT INTO `image` VALUES (1342, NULL, 120, 'http://muses.deepicecream.com:7010/img/create/1553178539154Commodity.jpg');
INSERT INTO `image` VALUES (1351, NULL, 129, 'http://muses.deepicecream.com:7010/img/create/1553183287442Commodity.jpg');
INSERT INTO `image` VALUES (1352, NULL, 130, 'http://muses.deepicecream.com:7010/img/create/1553213325439blob');
INSERT INTO `image` VALUES (1353, NULL, 131, 'http://muses.deepicecream.com:7010/img/create/1553214634184blob');
INSERT INTO `image` VALUES (1354, NULL, 132, 'http://muses.deepicecream.com:7010/img/create/1553214935600blob');
INSERT INTO `image` VALUES (1355, NULL, 133, 'http://muses.deepicecream.com:7010/img/create/1553215647028blob');
INSERT INTO `image` VALUES (1356, NULL, 134, 'http://muses.deepicecream.com:7010/img/create/1553215755274blob');
INSERT INTO `image` VALUES (1357, NULL, 135, 'http://muses.deepicecream.com:7010/img/create/1553216602599blob');
INSERT INTO `image` VALUES (1358, NULL, 136, 'http://muses.deepicecream.com:7010/img/create/1553219917605blob');
INSERT INTO `image` VALUES (1359, NULL, 137, 'http://muses.deepicecream.com:7010/img/create/1553220672690blob');
INSERT INTO `image` VALUES (1360, NULL, 138, 'http://muses.deepicecream.com:7010/img/create/1553220722085blob');
INSERT INTO `image` VALUES (1361, NULL, 139, 'http://muses.deepicecream.com:7010/img/create/1553221283414blob');
INSERT INTO `image` VALUES (1362, NULL, 140, 'http://muses.deepicecream.com:7010/img/create/1553221566389blob');
INSERT INTO `image` VALUES (1363, NULL, 141, 'http://muses.deepicecream.com:7010/img/create/1553221657929blob');
INSERT INTO `image` VALUES (1364, NULL, 142, 'http://muses.deepicecream.com:7010/img/create/1553267262064Commodity.jpg');
INSERT INTO `image` VALUES (1365, NULL, 143, 'http://muses.deepicecream.com:7010/img/create/1553514576704Commodity.jpg');
INSERT INTO `image` VALUES (1366, NULL, 144, 'http://muses.deepicecream.com:7010/img/create/1553514751396Commodity.jpg');
INSERT INTO `image` VALUES (1367, NULL, 145, 'http://muses.deepicecream.com:7010/img/create/1553516767974Commodity.jpg');
INSERT INTO `image` VALUES (1368, NULL, 146, 'http://muses.deepicecream.com:7010/img/create/1553532447762Commodity.jpg');
INSERT INTO `image` VALUES (1369, NULL, 147, 'http://muses.deepicecream.com:7010/img/create/1553532687305Commodity.jpg');
INSERT INTO `image` VALUES (1370, NULL, 148, 'http://muses.deepicecream.com:7010/img/create/1553658210334Commodity.jpg');
INSERT INTO `image` VALUES (1371, NULL, 149, 'http://muses.deepicecream.com:7010/img/create/1553666692300Commodity.jpg');
INSERT INTO `image` VALUES (1372, NULL, 150, 'http://muses.deepicecream.com:7010/img/create/1553667579326Commodity.jpg');
INSERT INTO `image` VALUES (1373, NULL, 151, 'http://muses.deepicecream.com:7010/img/create/1553668052932Commodity.jpg');
INSERT INTO `image` VALUES (1374, NULL, 152, 'http://muses.deepicecream.com:7010/img/create/1554623175697Commodity.jpg');
INSERT INTO `image` VALUES (1375, NULL, 153, 'http://muses.deepicecream.com:7010/img/create/1555937052531Commodity.jpg');
INSERT INTO `image` VALUES (1376, NULL, 154, 'http://muses.deepicecream.com:7010/img/create/1558674863141Commodity.jpg');
INSERT INTO `image` VALUES (1377, NULL, 155, 'http://muses.deepicecream.com:7010/img/create/1558794720781Commodity.jpg');
INSERT INTO `image` VALUES (1378, NULL, 156, 'http://muses.deepicecream.com:7010/img/create/1558802522195Commodity.jpg');
INSERT INTO `image` VALUES (1379, NULL, 157, 'http://muses.deepicecream.com:7010/img/create/1558849673935Commodity.jpg');
INSERT INTO `image` VALUES (1380, NULL, 158, 'http://muses.deepicecream.com:7010/img/create/1558854993014Commodity.jpg');
INSERT INTO `image` VALUES (1381, NULL, 159, 'http://muses.deepicecream.com:7010/img/create/1558861235166Commodity.jpg');
INSERT INTO `image` VALUES (1382, NULL, 160, 'http://muses.deepicecream.com:7010/img/create/1558861251617Commodity.jpg');
INSERT INTO `image` VALUES (1383, NULL, 161, 'http://muses.deepicecream.com:7010/img/create/1558861353107Commodity.jpg');
INSERT INTO `image` VALUES (1384, NULL, 162, 'http://muses.deepicecream.com:7010/img/create/1558861382710Commodity.jpg');
INSERT INTO `image` VALUES (1385, NULL, 163, 'http://muses.deepicecream.com:7010/img/create/1558946156165Commodity.jpg');
INSERT INTO `image` VALUES (1386, NULL, 164, 'http://muses.deepicecream.com:7010/img/create/1559135600311Commodity.jpg');
INSERT INTO `image` VALUES (1387, NULL, 165, 'http://muses.deepicecream.com:7010/img/create/1559200088173Commodity.jpg');
INSERT INTO `image` VALUES (1388, NULL, 166, 'http://muses.deepicecream.com:7010/img/create/1559200227284Commodity.jpg');
INSERT INTO `image` VALUES (1389, NULL, 167, 'http://muses.deepicecream.com:7010/img/create/1559200247707Commodity.jpg');
INSERT INTO `image` VALUES (1390, NULL, 168, 'http://muses.deepicecream.com:7010/img/create/1559202261296Commodity.jpg');
INSERT INTO `image` VALUES (1391, NULL, 169, 'http://muses.deepicecream.com:7010/img/create/1559202969588Commodity.jpg');
INSERT INTO `image` VALUES (1392, NULL, 170, 'http://muses.deepicecream.com:7010/img/create/1559202980504Commodity.jpg');
INSERT INTO `image` VALUES (1393, NULL, 171, 'http://muses.deepicecream.com:7010/img/create/1559206014237Commodity.jpg');
INSERT INTO `image` VALUES (1394, NULL, 172, 'http://muses.deepicecream.com:7010/img/create/1559210375612Commodity.jpg');
INSERT INTO `image` VALUES (1395, NULL, 173, 'http://muses.deepicecream.com:7010/img/create/1559211765679Commodity.jpg');
INSERT INTO `image` VALUES (1396, NULL, 174, 'http://muses.deepicecream.com:7010/img/create/1559237395225Commodity.jpg');
INSERT INTO `image` VALUES (1397, NULL, 175, 'http://muses.deepicecream.com:7010/img/create/1559237755842Commodity.jpg');
INSERT INTO `image` VALUES (1398, NULL, 176, 'http://muses.deepicecream.com:7010/img/create/1559237875556Commodity.jpg');
INSERT INTO `image` VALUES (1399, NULL, 177, 'http://muses.deepicecream.com:7010/img/create/1559238009710Commodity.jpg');
INSERT INTO `image` VALUES (1400, NULL, 178, 'http://muses.deepicecream.com:7010/img/create/1559238163125Commodity.jpg');
INSERT INTO `image` VALUES (1401, NULL, 179, 'http://muses.deepicecream.com:7010/img/create/1559238247410Commodity.jpg');
INSERT INTO `image` VALUES (1402, NULL, 180, 'http://muses.deepicecream.com:7010/img/create/1559238418920Commodity.jpg');
INSERT INTO `image` VALUES (1403, NULL, 181, 'http://muses.deepicecream.com:7010/img/create/1559273937968Commodity.jpg');
INSERT INTO `image` VALUES (1404, NULL, 182, 'http://muses.deepicecream.com:7010/img/create/1559273972408Commodity.jpg');
INSERT INTO `image` VALUES (1405, NULL, 183, 'http://muses.deepicecream.com:7010/img/create/1559280774603Commodity.jpg');
INSERT INTO `image` VALUES (1406, NULL, 184, 'http://muses.deepicecream.com:7010/img/create/1559285373988Commodity.jpg');
INSERT INTO `image` VALUES (1407, NULL, 185, 'http://muses.deepicecream.com:7010/img/create/1559293937693Commodity.jpg');
INSERT INTO `image` VALUES (1408, NULL, 186, 'http://muses.deepicecream.com:7010/img/create/1560146603456Commodity.jpg');
INSERT INTO `image` VALUES (1409, NULL, 187, 'http://muses.deepicecream.com:7010/img/create/1561341343617Commodity.jpg');
INSERT INTO `image` VALUES (1410, NULL, 188, 'http://muses.deepicecream.com:7010/img/create/1561341800562Commodity.jpg');
INSERT INTO `image` VALUES (1411, NULL, 189, 'http://muses.deepicecream.com:7010/img/create/1571465569492Commodity.jpg');
INSERT INTO `image` VALUES (1412, NULL, 190, 'http://muses.deepicecream.com:7010/img/create/1578817106575Commodity.jpg');

-- ----------------------------
-- Table structure for image_slider
-- ----------------------------
DROP TABLE IF EXISTS `image_slider`;
CREATE TABLE `image_slider`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `launch_date` datetime(0) NULL DEFAULT NULL,
  `link_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `manager_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_3747oiu3og8pojd1co8tj3ulq`(`manager_id`) USING BTREE,
  CONSTRAINT `FK_3747oiu3og8pojd1co8tj3ulq` FOREIGN KEY (`manager_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of image_slider
-- ----------------------------
INSERT INTO `image_slider` VALUES (1, 'http://muses.deepicecream.com:7010/img/slider/kFs5NV.png', NULL, NULL, NULL);
INSERT INTO `image_slider` VALUES (2, 'http://muses.deepicecream.com:7010/img/slider/kFs73F.png', NULL, NULL, NULL);
INSERT INTO `image_slider` VALUES (3, 'http://muses.deepicecream.com:7010/img/slider/kFsIhT.png', NULL, NULL, NULL);
INSERT INTO `image_slider` VALUES (4, 'http://muses.deepicecream.com:7010/img/slider/kFsT9U.png', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for order_commodity
-- ----------------------------
DROP TABLE IF EXISTS `order_commodity`;
CREATE TABLE `order_commodity`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `commodity_id` int(11) NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  `order_id` int(11) NULL DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_ocfyg878xp3uh24729cwian5i`(`commodity_id`) USING BTREE,
  INDEX `FK_injcq7xlgk0y0fuj7u5xtxy8h`(`order_id`) USING BTREE,
  CONSTRAINT `FK_injcq7xlgk0y0fuj7u5xtxy8h` FOREIGN KEY (`order_id`) REFERENCES `torder` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_ocfyg878xp3uh24729cwian5i` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1314 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_commodity
-- ----------------------------
INSERT INTO `order_commodity` VALUES (1262, '2019-03-21 21:35:49', '尺寸:60*80;颜色分类:白色框', 110, 1, 1263, 158, 'http://muses.deepicecream.com:7010/img/create/1553175272745Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1263, '2019-03-21 21:46:01', '尺寸:50*70;颜色分类:木纹框', 111, 1, 1264, 158, 'http://muses.deepicecream.com:7010/img/create/1553175956457Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1269, '2019-03-21 22:09:16', '尺寸:50*70;颜色分类:黑色框', 116, 1, 1270, 158, 'http://muses.deepicecream.com:7010/img/create/1553177351970Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1270, '2019-03-21 22:15:08', '尺寸:60*80;颜色分类:木纹框', 117, 1, 1271, 158, 'http://muses.deepicecream.com:7010/img/create/1553177703690Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1271, '2019-03-21 22:21:07', '尺寸:60*60;颜色分类:黑色框', 118, 1, 1272, 158, 'http://muses.deepicecream.com:7010/img/create/1553178061439Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1272, '2019-03-21 22:28:00', '尺寸:60*80;颜色分类:黑色框', 119, 1, 1273, 158, 'http://muses.deepicecream.com:7010/img/create/1553178474655Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1273, '2019-03-21 22:29:04', '尺寸:50*70;颜色分类:白色框', 120, 1, 1274, 158, 'http://muses.deepicecream.com:7010/img/create/1553178539154Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1274, '2019-03-21 22:31:37', '尺寸:60*80;颜色分类:黑色框', 121, 1, 1275, 158, 'http://muses.deepicecream.com:7010/img/create/1553178693062Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1275, '2019-03-21 23:05:42', '尺寸:50*70;颜色分类:黑色框', 122, 1, 1276, 158, 'http://muses.deepicecream.com:7010/img/create/1553180705912Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1277, '2019-03-22 10:12:51', '用户自定义装饰画', 138, 1, 1278, 158, 'http://muses.deepicecream.com:7010/img/create/1553220722085blob', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1278, '2019-03-22 10:21:33', '用户自定义装饰画', 139, 1, 1279, 158, 'http://muses.deepicecream.com:7010/img/create/1553221283414blob', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1279, '2019-03-22 10:26:15', '用户自定义装饰画', 140, 1, 1280, 158, 'http://muses.deepicecream.com:7010/img/create/1553221566389blob', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1285, '2019-03-27 14:20:03', '尺寸:40*40;颜色分类:白色框', 150, 2, 1286, 316, 'http://muses.deepicecream.com:7010/img/create/1553667579326Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1297, '2019-05-30 15:44:29', '颜色分类:木纹框;尺寸:50*50', 168, 1, 1298, 158, 'http://muses.deepicecream.com:7010/img/create/1559202261296Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1305, '2019-05-31 11:39:09', '颜色分类:木纹框;尺寸:50*50', 181, 1, 1306, 158, 'http://muses.deepicecream.com:7010/img/create/1559273937968Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1306, '2019-05-31 11:39:50', '颜色分类:木纹框;尺寸:50*50', 182, 1, 1307, 158, 'http://muses.deepicecream.com:7010/img/create/1559273972408Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1307, '2019-05-31 13:33:01', '颜色分类:木纹框;尺寸:50*50', 183, 1, 1308, 158, 'http://muses.deepicecream.com:7010/img/create/1559280774603Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1308, '2019-05-31 17:12:28', '颜色分类:木纹框;尺寸:50*50', 185, 1, 1309, 158, 'http://muses.deepicecream.com:7010/img/create/1559293937693Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1309, '2019-06-10 14:03:50', '尺寸:60*60;颜色分类:木纹框', 186, 1, 1310, 158, 'http://muses.deepicecream.com:7010/img/create/1560146603456Commodity.jpg', '用户自定义装饰画');
INSERT INTO `order_commodity` VALUES (1310, '2019-06-24 10:01:46', '尺寸:70*70;颜色分类:白色框', 111, 2, 1311, 316, 'http://muses.deepicecream.com:7010/img/create/1553175956457Commodity.jpg', '瀑布 风光装饰画 自然风景');
INSERT INTO `order_commodity` VALUES (1312, '2019-09-19 08:09:18', '尺寸:40*60;颜色分类:黑色框', 114, 2, 1313, 158, 'http://muses.deepicecream.com:7010/img/create/1553176351266Commodity.jpg', '不在书店');
INSERT INTO `order_commodity` VALUES (1313, '2019-10-19 14:13:03', '尺寸:80*80;颜色分类:白色框', 189, 1, 1314, 158, 'http://muses.deepicecream.com:7010/img/create/1571465569492Commodity.jpg', '用户自定义装饰画');

-- ----------------------------
-- Table structure for parameter
-- ----------------------------
DROP TABLE IF EXISTS `parameter`;
CREATE TABLE `parameter`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attribute_id` int(11) NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_sjrky1mv3h63uv5rf7i2a4rq`(`attribute_id`) USING BTREE,
  CONSTRAINT `FK_sjrky1mv3h63uv5rf7i2a4rq` FOREIGN KEY (`attribute_id`) REFERENCES `attribute` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2401 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of parameter
-- ----------------------------
INSERT INTO `parameter` VALUES (1429, 219, NULL, '40*40');
INSERT INTO `parameter` VALUES (1430, 219, NULL, '50*50');
INSERT INTO `parameter` VALUES (1431, 219, NULL, '60*60');
INSERT INTO `parameter` VALUES (1432, 219, NULL, '70*70');
INSERT INTO `parameter` VALUES (1433, 219, NULL, '80*80');
INSERT INTO `parameter` VALUES (1434, 219, NULL, '40*60');
INSERT INTO `parameter` VALUES (1435, 219, NULL, '50*70');
INSERT INTO `parameter` VALUES (1436, 219, NULL, '60*80');
INSERT INTO `parameter` VALUES (1437, 219, NULL, '70*100');
INSERT INTO `parameter` VALUES (1438, 220, 'http://muses.deepicecream.com:7010/img/create/1553175272745Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1439, 220, 'http://muses.deepicecream.com:7010/img/create/1553175272745Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1440, 220, 'http://muses.deepicecream.com:7010/img/create/1553175272745Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1441, 221, NULL, '40*40');
INSERT INTO `parameter` VALUES (1442, 221, NULL, '50*50');
INSERT INTO `parameter` VALUES (1443, 221, NULL, '60*60');
INSERT INTO `parameter` VALUES (1444, 221, NULL, '70*70');
INSERT INTO `parameter` VALUES (1445, 221, NULL, '80*80');
INSERT INTO `parameter` VALUES (1446, 221, NULL, '40*60');
INSERT INTO `parameter` VALUES (1447, 221, NULL, '50*70');
INSERT INTO `parameter` VALUES (1448, 221, NULL, '60*80');
INSERT INTO `parameter` VALUES (1449, 221, NULL, '70*100');
INSERT INTO `parameter` VALUES (1450, 222, 'http://muses.deepicecream.com:7010/img/create/1553175956457Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1451, 222, 'http://muses.deepicecream.com:7010/img/create/1553175956457Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1452, 222, 'http://muses.deepicecream.com:7010/img/create/1553175956457Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1453, 223, NULL, '40*40');
INSERT INTO `parameter` VALUES (1454, 223, NULL, '50*50');
INSERT INTO `parameter` VALUES (1455, 223, NULL, '60*60');
INSERT INTO `parameter` VALUES (1456, 223, NULL, '70*70');
INSERT INTO `parameter` VALUES (1457, 223, NULL, '80*80');
INSERT INTO `parameter` VALUES (1458, 223, NULL, '40*60');
INSERT INTO `parameter` VALUES (1459, 223, NULL, '50*70');
INSERT INTO `parameter` VALUES (1460, 223, NULL, '60*80');
INSERT INTO `parameter` VALUES (1461, 223, NULL, '70*100');
INSERT INTO `parameter` VALUES (1462, 224, 'http://muses.deepicecream.com:7010/img/create/1553176135581Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1463, 224, 'http://muses.deepicecream.com:7010/img/create/1553176135581Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1464, 224, 'http://muses.deepicecream.com:7010/img/create/1553176135581Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1465, 225, NULL, '40*40');
INSERT INTO `parameter` VALUES (1466, 225, NULL, '50*50');
INSERT INTO `parameter` VALUES (1467, 225, NULL, '60*60');
INSERT INTO `parameter` VALUES (1468, 225, NULL, '70*70');
INSERT INTO `parameter` VALUES (1469, 225, NULL, '80*80');
INSERT INTO `parameter` VALUES (1470, 225, NULL, '40*60');
INSERT INTO `parameter` VALUES (1471, 225, NULL, '50*70');
INSERT INTO `parameter` VALUES (1472, 225, NULL, '60*80');
INSERT INTO `parameter` VALUES (1473, 225, NULL, '70*100');
INSERT INTO `parameter` VALUES (1474, 226, 'http://muses.deepicecream.com:7010/img/create/1553176274194Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1475, 226, 'http://muses.deepicecream.com:7010/img/create/1553176274194Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1476, 226, 'http://muses.deepicecream.com:7010/img/create/1553176274194Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1477, 227, NULL, '40*40');
INSERT INTO `parameter` VALUES (1478, 227, NULL, '50*50');
INSERT INTO `parameter` VALUES (1479, 227, NULL, '60*60');
INSERT INTO `parameter` VALUES (1480, 227, NULL, '70*70');
INSERT INTO `parameter` VALUES (1481, 227, NULL, '80*80');
INSERT INTO `parameter` VALUES (1482, 227, NULL, '40*60');
INSERT INTO `parameter` VALUES (1483, 227, NULL, '50*70');
INSERT INTO `parameter` VALUES (1484, 227, NULL, '60*80');
INSERT INTO `parameter` VALUES (1485, 227, NULL, '70*100');
INSERT INTO `parameter` VALUES (1486, 228, 'http://muses.deepicecream.com:7010/img/create/1553176351266Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1487, 228, 'http://muses.deepicecream.com:7010/img/create/1553176351266Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1488, 228, 'http://muses.deepicecream.com:7010/img/create/1553176351266Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1489, 229, NULL, '40*40');
INSERT INTO `parameter` VALUES (1490, 229, NULL, '50*50');
INSERT INTO `parameter` VALUES (1491, 229, NULL, '60*60');
INSERT INTO `parameter` VALUES (1492, 229, NULL, '70*70');
INSERT INTO `parameter` VALUES (1493, 229, NULL, '80*80');
INSERT INTO `parameter` VALUES (1494, 229, NULL, '40*60');
INSERT INTO `parameter` VALUES (1495, 229, NULL, '50*70');
INSERT INTO `parameter` VALUES (1496, 229, NULL, '60*80');
INSERT INTO `parameter` VALUES (1497, 229, NULL, '70*100');
INSERT INTO `parameter` VALUES (1498, 230, 'http://muses.deepicecream.com:7010/img/create/1553176796254Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1499, 230, 'http://muses.deepicecream.com:7010/img/create/1553176796254Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1500, 230, 'http://muses.deepicecream.com:7010/img/create/1553176796254Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1501, 231, NULL, '40*40');
INSERT INTO `parameter` VALUES (1502, 231, NULL, '50*50');
INSERT INTO `parameter` VALUES (1503, 231, NULL, '60*60');
INSERT INTO `parameter` VALUES (1504, 231, NULL, '70*70');
INSERT INTO `parameter` VALUES (1505, 231, NULL, '80*80');
INSERT INTO `parameter` VALUES (1506, 231, NULL, '40*60');
INSERT INTO `parameter` VALUES (1507, 231, NULL, '50*70');
INSERT INTO `parameter` VALUES (1508, 231, NULL, '60*80');
INSERT INTO `parameter` VALUES (1509, 231, NULL, '70*100');
INSERT INTO `parameter` VALUES (1510, 232, 'http://muses.deepicecream.com:7010/img/create/1553177351970Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1511, 232, 'http://muses.deepicecream.com:7010/img/create/1553177351970Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1512, 232, 'http://muses.deepicecream.com:7010/img/create/1553177351970Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1513, 233, NULL, '40*40');
INSERT INTO `parameter` VALUES (1514, 233, NULL, '50*50');
INSERT INTO `parameter` VALUES (1515, 233, NULL, '60*60');
INSERT INTO `parameter` VALUES (1516, 233, NULL, '70*70');
INSERT INTO `parameter` VALUES (1517, 233, NULL, '80*80');
INSERT INTO `parameter` VALUES (1518, 233, NULL, '40*60');
INSERT INTO `parameter` VALUES (1519, 233, NULL, '50*70');
INSERT INTO `parameter` VALUES (1520, 233, NULL, '60*80');
INSERT INTO `parameter` VALUES (1521, 233, NULL, '70*100');
INSERT INTO `parameter` VALUES (1522, 234, 'http://muses.deepicecream.com:7010/img/create/1553177703690Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1523, 234, 'http://muses.deepicecream.com:7010/img/create/1553177703690Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1524, 234, 'http://muses.deepicecream.com:7010/img/create/1553177703690Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1525, 235, NULL, '40*40');
INSERT INTO `parameter` VALUES (1526, 235, NULL, '50*50');
INSERT INTO `parameter` VALUES (1527, 235, NULL, '60*60');
INSERT INTO `parameter` VALUES (1528, 235, NULL, '70*70');
INSERT INTO `parameter` VALUES (1529, 235, NULL, '80*80');
INSERT INTO `parameter` VALUES (1530, 235, NULL, '40*60');
INSERT INTO `parameter` VALUES (1531, 235, NULL, '50*70');
INSERT INTO `parameter` VALUES (1532, 235, NULL, '60*80');
INSERT INTO `parameter` VALUES (1533, 235, NULL, '70*100');
INSERT INTO `parameter` VALUES (1534, 236, 'http://muses.deepicecream.com:7010/img/create/1553178061439Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1535, 236, 'http://muses.deepicecream.com:7010/img/create/1553178061439Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1536, 236, 'http://muses.deepicecream.com:7010/img/create/1553178061439Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1537, 237, NULL, '40*40');
INSERT INTO `parameter` VALUES (1538, 237, NULL, '50*50');
INSERT INTO `parameter` VALUES (1539, 237, NULL, '60*60');
INSERT INTO `parameter` VALUES (1540, 237, NULL, '70*70');
INSERT INTO `parameter` VALUES (1541, 237, NULL, '80*80');
INSERT INTO `parameter` VALUES (1542, 237, NULL, '40*60');
INSERT INTO `parameter` VALUES (1543, 237, NULL, '50*70');
INSERT INTO `parameter` VALUES (1544, 237, NULL, '60*80');
INSERT INTO `parameter` VALUES (1545, 237, NULL, '70*100');
INSERT INTO `parameter` VALUES (1546, 238, 'http://muses.deepicecream.com:7010/img/create/1553178474655Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1547, 238, 'http://muses.deepicecream.com:7010/img/create/1553178474655Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1548, 238, 'http://muses.deepicecream.com:7010/img/create/1553178474655Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1549, 239, NULL, '40*40');
INSERT INTO `parameter` VALUES (1550, 239, NULL, '50*50');
INSERT INTO `parameter` VALUES (1551, 239, NULL, '60*60');
INSERT INTO `parameter` VALUES (1552, 239, NULL, '70*70');
INSERT INTO `parameter` VALUES (1553, 239, NULL, '80*80');
INSERT INTO `parameter` VALUES (1554, 239, NULL, '40*60');
INSERT INTO `parameter` VALUES (1555, 239, NULL, '50*70');
INSERT INTO `parameter` VALUES (1556, 239, NULL, '60*80');
INSERT INTO `parameter` VALUES (1557, 239, NULL, '70*100');
INSERT INTO `parameter` VALUES (1558, 240, 'http://muses.deepicecream.com:7010/img/create/1553178539154Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1559, 240, 'http://muses.deepicecream.com:7010/img/create/1553178539154Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1560, 240, 'http://muses.deepicecream.com:7010/img/create/1553178539154Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1657, 257, NULL, '40*40');
INSERT INTO `parameter` VALUES (1658, 257, NULL, '50*50');
INSERT INTO `parameter` VALUES (1659, 257, NULL, '60*60');
INSERT INTO `parameter` VALUES (1660, 257, NULL, '70*70');
INSERT INTO `parameter` VALUES (1661, 257, NULL, '80*80');
INSERT INTO `parameter` VALUES (1662, 257, NULL, '40*60');
INSERT INTO `parameter` VALUES (1663, 257, NULL, '50*70');
INSERT INTO `parameter` VALUES (1664, 257, NULL, '60*80');
INSERT INTO `parameter` VALUES (1665, 257, NULL, '70*100');
INSERT INTO `parameter` VALUES (1666, 258, 'http://muses.deepicecream.com:7010/img/create/1553183287442Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1667, 258, 'http://muses.deepicecream.com:7010/img/create/1553183287442Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1668, 258, 'http://muses.deepicecream.com:7010/img/create/1553183287442Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1669, 259, NULL, '40*40');
INSERT INTO `parameter` VALUES (1670, 259, NULL, '50*50');
INSERT INTO `parameter` VALUES (1671, 259, NULL, '60*60');
INSERT INTO `parameter` VALUES (1672, 259, NULL, '70*70');
INSERT INTO `parameter` VALUES (1673, 259, NULL, '80*80');
INSERT INTO `parameter` VALUES (1674, 259, NULL, '40*60');
INSERT INTO `parameter` VALUES (1675, 259, NULL, '50*70');
INSERT INTO `parameter` VALUES (1676, 259, NULL, '60*80');
INSERT INTO `parameter` VALUES (1677, 259, NULL, '70*100');
INSERT INTO `parameter` VALUES (1678, 260, 'http://muses.deepicecream.com:7010/img/create/1553213325439blob', '木纹框');
INSERT INTO `parameter` VALUES (1679, 260, 'http://muses.deepicecream.com:7010/img/create/1553213325439blob', '黑色框');
INSERT INTO `parameter` VALUES (1680, 260, 'http://muses.deepicecream.com:7010/img/create/1553213325439blob', '白色框');
INSERT INTO `parameter` VALUES (1681, 261, NULL, '40*40');
INSERT INTO `parameter` VALUES (1682, 261, NULL, '50*50');
INSERT INTO `parameter` VALUES (1683, 261, NULL, '60*60');
INSERT INTO `parameter` VALUES (1684, 261, NULL, '70*70');
INSERT INTO `parameter` VALUES (1685, 261, NULL, '80*80');
INSERT INTO `parameter` VALUES (1686, 261, NULL, '40*60');
INSERT INTO `parameter` VALUES (1687, 261, NULL, '50*70');
INSERT INTO `parameter` VALUES (1688, 261, NULL, '60*80');
INSERT INTO `parameter` VALUES (1689, 261, NULL, '70*100');
INSERT INTO `parameter` VALUES (1690, 262, 'http://muses.deepicecream.com:7010/img/create/1553214634184blob', '木纹框');
INSERT INTO `parameter` VALUES (1691, 262, 'http://muses.deepicecream.com:7010/img/create/1553214634184blob', '黑色框');
INSERT INTO `parameter` VALUES (1692, 262, 'http://muses.deepicecream.com:7010/img/create/1553214634184blob', '白色框');
INSERT INTO `parameter` VALUES (1693, 263, NULL, '40*40');
INSERT INTO `parameter` VALUES (1694, 263, NULL, '50*50');
INSERT INTO `parameter` VALUES (1695, 263, NULL, '60*60');
INSERT INTO `parameter` VALUES (1696, 263, NULL, '70*70');
INSERT INTO `parameter` VALUES (1697, 263, NULL, '80*80');
INSERT INTO `parameter` VALUES (1698, 263, NULL, '40*60');
INSERT INTO `parameter` VALUES (1699, 263, NULL, '50*70');
INSERT INTO `parameter` VALUES (1700, 263, NULL, '60*80');
INSERT INTO `parameter` VALUES (1701, 263, NULL, '70*100');
INSERT INTO `parameter` VALUES (1702, 264, 'http://muses.deepicecream.com:7010/img/create/1553214935600blob', '木纹框');
INSERT INTO `parameter` VALUES (1703, 264, 'http://muses.deepicecream.com:7010/img/create/1553214935600blob', '黑色框');
INSERT INTO `parameter` VALUES (1704, 264, 'http://muses.deepicecream.com:7010/img/create/1553214935600blob', '白色框');
INSERT INTO `parameter` VALUES (1705, 265, NULL, '40*40');
INSERT INTO `parameter` VALUES (1706, 265, NULL, '50*50');
INSERT INTO `parameter` VALUES (1707, 265, NULL, '60*60');
INSERT INTO `parameter` VALUES (1708, 265, NULL, '70*70');
INSERT INTO `parameter` VALUES (1709, 265, NULL, '80*80');
INSERT INTO `parameter` VALUES (1710, 265, NULL, '40*60');
INSERT INTO `parameter` VALUES (1711, 265, NULL, '50*70');
INSERT INTO `parameter` VALUES (1712, 265, NULL, '60*80');
INSERT INTO `parameter` VALUES (1713, 265, NULL, '70*100');
INSERT INTO `parameter` VALUES (1714, 266, 'http://muses.deepicecream.com:7010/img/create/1553215647028blob', '木纹框');
INSERT INTO `parameter` VALUES (1715, 266, 'http://muses.deepicecream.com:7010/img/create/1553215647028blob', '黑色框');
INSERT INTO `parameter` VALUES (1716, 266, 'http://muses.deepicecream.com:7010/img/create/1553215647028blob', '白色框');
INSERT INTO `parameter` VALUES (1717, 267, NULL, '40*40');
INSERT INTO `parameter` VALUES (1718, 267, NULL, '50*50');
INSERT INTO `parameter` VALUES (1719, 267, NULL, '60*60');
INSERT INTO `parameter` VALUES (1720, 267, NULL, '70*70');
INSERT INTO `parameter` VALUES (1721, 267, NULL, '80*80');
INSERT INTO `parameter` VALUES (1722, 267, NULL, '40*60');
INSERT INTO `parameter` VALUES (1723, 267, NULL, '50*70');
INSERT INTO `parameter` VALUES (1724, 267, NULL, '60*80');
INSERT INTO `parameter` VALUES (1725, 267, NULL, '70*100');
INSERT INTO `parameter` VALUES (1726, 268, 'http://muses.deepicecream.com:7010/img/create/1553215755274blob', '木纹框');
INSERT INTO `parameter` VALUES (1727, 268, 'http://muses.deepicecream.com:7010/img/create/1553215755274blob', '黑色框');
INSERT INTO `parameter` VALUES (1728, 268, 'http://muses.deepicecream.com:7010/img/create/1553215755274blob', '白色框');
INSERT INTO `parameter` VALUES (1729, 269, NULL, '40*40');
INSERT INTO `parameter` VALUES (1730, 269, NULL, '50*50');
INSERT INTO `parameter` VALUES (1731, 269, NULL, '60*60');
INSERT INTO `parameter` VALUES (1732, 269, NULL, '70*70');
INSERT INTO `parameter` VALUES (1733, 269, NULL, '80*80');
INSERT INTO `parameter` VALUES (1734, 269, NULL, '40*60');
INSERT INTO `parameter` VALUES (1735, 269, NULL, '50*70');
INSERT INTO `parameter` VALUES (1736, 269, NULL, '60*80');
INSERT INTO `parameter` VALUES (1737, 269, NULL, '70*100');
INSERT INTO `parameter` VALUES (1738, 270, 'http://muses.deepicecream.com:7010/img/create/1553216602599blob', '木纹框');
INSERT INTO `parameter` VALUES (1739, 270, 'http://muses.deepicecream.com:7010/img/create/1553216602599blob', '黑色框');
INSERT INTO `parameter` VALUES (1740, 270, 'http://muses.deepicecream.com:7010/img/create/1553216602599blob', '白色框');
INSERT INTO `parameter` VALUES (1741, 271, NULL, '40*40');
INSERT INTO `parameter` VALUES (1742, 271, NULL, '50*50');
INSERT INTO `parameter` VALUES (1743, 271, NULL, '60*60');
INSERT INTO `parameter` VALUES (1744, 271, NULL, '70*70');
INSERT INTO `parameter` VALUES (1745, 271, NULL, '80*80');
INSERT INTO `parameter` VALUES (1746, 271, NULL, '40*60');
INSERT INTO `parameter` VALUES (1747, 271, NULL, '50*70');
INSERT INTO `parameter` VALUES (1748, 271, NULL, '60*80');
INSERT INTO `parameter` VALUES (1749, 271, NULL, '70*100');
INSERT INTO `parameter` VALUES (1750, 272, 'http://muses.deepicecream.com:7010/img/create/1553219917605blob', '木纹框');
INSERT INTO `parameter` VALUES (1751, 272, 'http://muses.deepicecream.com:7010/img/create/1553219917605blob', '黑色框');
INSERT INTO `parameter` VALUES (1752, 272, 'http://muses.deepicecream.com:7010/img/create/1553219917605blob', '白色框');
INSERT INTO `parameter` VALUES (1753, 273, NULL, '40*40');
INSERT INTO `parameter` VALUES (1754, 273, NULL, '50*50');
INSERT INTO `parameter` VALUES (1755, 273, NULL, '60*60');
INSERT INTO `parameter` VALUES (1756, 273, NULL, '70*70');
INSERT INTO `parameter` VALUES (1757, 273, NULL, '80*80');
INSERT INTO `parameter` VALUES (1758, 273, NULL, '40*60');
INSERT INTO `parameter` VALUES (1759, 273, NULL, '50*70');
INSERT INTO `parameter` VALUES (1760, 273, NULL, '60*80');
INSERT INTO `parameter` VALUES (1761, 273, NULL, '70*100');
INSERT INTO `parameter` VALUES (1762, 274, 'http://muses.deepicecream.com:7010/img/create/1553220672690blob', '木纹框');
INSERT INTO `parameter` VALUES (1763, 274, 'http://muses.deepicecream.com:7010/img/create/1553220672690blob', '黑色框');
INSERT INTO `parameter` VALUES (1764, 274, 'http://muses.deepicecream.com:7010/img/create/1553220672690blob', '白色框');
INSERT INTO `parameter` VALUES (1765, 275, NULL, '40*40');
INSERT INTO `parameter` VALUES (1766, 275, NULL, '50*50');
INSERT INTO `parameter` VALUES (1767, 275, NULL, '60*60');
INSERT INTO `parameter` VALUES (1768, 275, NULL, '70*70');
INSERT INTO `parameter` VALUES (1769, 275, NULL, '80*80');
INSERT INTO `parameter` VALUES (1770, 275, NULL, '40*60');
INSERT INTO `parameter` VALUES (1771, 275, NULL, '50*70');
INSERT INTO `parameter` VALUES (1772, 275, NULL, '60*80');
INSERT INTO `parameter` VALUES (1773, 275, NULL, '70*100');
INSERT INTO `parameter` VALUES (1774, 276, 'http://muses.deepicecream.com:7010/img/create/1553220722085blob', '木纹框');
INSERT INTO `parameter` VALUES (1775, 276, 'http://muses.deepicecream.com:7010/img/create/1553220722085blob', '黑色框');
INSERT INTO `parameter` VALUES (1776, 276, 'http://muses.deepicecream.com:7010/img/create/1553220722085blob', '白色框');
INSERT INTO `parameter` VALUES (1777, 277, NULL, '40*40');
INSERT INTO `parameter` VALUES (1778, 277, NULL, '50*50');
INSERT INTO `parameter` VALUES (1779, 277, NULL, '60*60');
INSERT INTO `parameter` VALUES (1780, 277, NULL, '70*70');
INSERT INTO `parameter` VALUES (1781, 277, NULL, '80*80');
INSERT INTO `parameter` VALUES (1782, 277, NULL, '40*60');
INSERT INTO `parameter` VALUES (1783, 277, NULL, '50*70');
INSERT INTO `parameter` VALUES (1784, 277, NULL, '60*80');
INSERT INTO `parameter` VALUES (1785, 277, NULL, '70*100');
INSERT INTO `parameter` VALUES (1786, 278, 'http://muses.deepicecream.com:7010/img/create/1553221283414blob', '木纹框');
INSERT INTO `parameter` VALUES (1787, 278, 'http://muses.deepicecream.com:7010/img/create/1553221283414blob', '黑色框');
INSERT INTO `parameter` VALUES (1788, 278, 'http://muses.deepicecream.com:7010/img/create/1553221283414blob', '白色框');
INSERT INTO `parameter` VALUES (1789, 279, NULL, '40*40');
INSERT INTO `parameter` VALUES (1790, 279, NULL, '50*50');
INSERT INTO `parameter` VALUES (1791, 279, NULL, '60*60');
INSERT INTO `parameter` VALUES (1792, 279, NULL, '70*70');
INSERT INTO `parameter` VALUES (1793, 279, NULL, '80*80');
INSERT INTO `parameter` VALUES (1794, 279, NULL, '40*60');
INSERT INTO `parameter` VALUES (1795, 279, NULL, '50*70');
INSERT INTO `parameter` VALUES (1796, 279, NULL, '60*80');
INSERT INTO `parameter` VALUES (1797, 279, NULL, '70*100');
INSERT INTO `parameter` VALUES (1798, 280, 'http://muses.deepicecream.com:7010/img/create/1553221566389blob', '木纹框');
INSERT INTO `parameter` VALUES (1799, 280, 'http://muses.deepicecream.com:7010/img/create/1553221566389blob', '黑色框');
INSERT INTO `parameter` VALUES (1800, 280, 'http://muses.deepicecream.com:7010/img/create/1553221566389blob', '白色框');
INSERT INTO `parameter` VALUES (1801, 281, NULL, '40*40');
INSERT INTO `parameter` VALUES (1802, 281, NULL, '50*50');
INSERT INTO `parameter` VALUES (1803, 281, NULL, '60*60');
INSERT INTO `parameter` VALUES (1804, 281, NULL, '70*70');
INSERT INTO `parameter` VALUES (1805, 281, NULL, '80*80');
INSERT INTO `parameter` VALUES (1806, 281, NULL, '40*60');
INSERT INTO `parameter` VALUES (1807, 281, NULL, '50*70');
INSERT INTO `parameter` VALUES (1808, 281, NULL, '60*80');
INSERT INTO `parameter` VALUES (1809, 281, NULL, '70*100');
INSERT INTO `parameter` VALUES (1810, 282, 'http://muses.deepicecream.com:7010/img/create/1553221657929blob', '木纹框');
INSERT INTO `parameter` VALUES (1811, 282, 'http://muses.deepicecream.com:7010/img/create/1553221657929blob', '黑色框');
INSERT INTO `parameter` VALUES (1812, 282, 'http://muses.deepicecream.com:7010/img/create/1553221657929blob', '白色框');
INSERT INTO `parameter` VALUES (1813, 283, NULL, '40*40');
INSERT INTO `parameter` VALUES (1814, 283, NULL, '50*50');
INSERT INTO `parameter` VALUES (1815, 283, NULL, '60*60');
INSERT INTO `parameter` VALUES (1816, 283, NULL, '70*70');
INSERT INTO `parameter` VALUES (1817, 283, NULL, '80*80');
INSERT INTO `parameter` VALUES (1818, 283, NULL, '40*60');
INSERT INTO `parameter` VALUES (1819, 283, NULL, '50*70');
INSERT INTO `parameter` VALUES (1820, 283, NULL, '60*80');
INSERT INTO `parameter` VALUES (1821, 283, NULL, '70*100');
INSERT INTO `parameter` VALUES (1822, 284, 'http://muses.deepicecream.com:7010/img/create/1553267262064Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1823, 284, 'http://muses.deepicecream.com:7010/img/create/1553267262064Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1824, 284, 'http://muses.deepicecream.com:7010/img/create/1553267262064Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1825, 285, NULL, '40*40');
INSERT INTO `parameter` VALUES (1826, 285, NULL, '50*50');
INSERT INTO `parameter` VALUES (1827, 285, NULL, '60*60');
INSERT INTO `parameter` VALUES (1828, 285, NULL, '70*70');
INSERT INTO `parameter` VALUES (1829, 285, NULL, '80*80');
INSERT INTO `parameter` VALUES (1830, 285, NULL, '40*60');
INSERT INTO `parameter` VALUES (1831, 285, NULL, '50*70');
INSERT INTO `parameter` VALUES (1832, 285, NULL, '60*80');
INSERT INTO `parameter` VALUES (1833, 285, NULL, '70*100');
INSERT INTO `parameter` VALUES (1834, 286, 'http://muses.deepicecream.com:7010/img/create/1553514576704Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1835, 286, 'http://muses.deepicecream.com:7010/img/create/1553514576704Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1836, 286, 'http://muses.deepicecream.com:7010/img/create/1553514576704Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1837, 287, NULL, '40*40');
INSERT INTO `parameter` VALUES (1838, 287, NULL, '50*50');
INSERT INTO `parameter` VALUES (1839, 287, NULL, '60*60');
INSERT INTO `parameter` VALUES (1840, 287, NULL, '70*70');
INSERT INTO `parameter` VALUES (1841, 287, NULL, '80*80');
INSERT INTO `parameter` VALUES (1842, 287, NULL, '40*60');
INSERT INTO `parameter` VALUES (1843, 287, NULL, '50*70');
INSERT INTO `parameter` VALUES (1844, 287, NULL, '60*80');
INSERT INTO `parameter` VALUES (1845, 287, NULL, '70*100');
INSERT INTO `parameter` VALUES (1846, 288, 'http://muses.deepicecream.com:7010/img/create/1553514751396Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1847, 288, 'http://muses.deepicecream.com:7010/img/create/1553514751396Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1848, 288, 'http://muses.deepicecream.com:7010/img/create/1553514751396Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1849, 289, NULL, '40*40');
INSERT INTO `parameter` VALUES (1850, 289, NULL, '50*50');
INSERT INTO `parameter` VALUES (1851, 289, NULL, '60*60');
INSERT INTO `parameter` VALUES (1852, 289, NULL, '70*70');
INSERT INTO `parameter` VALUES (1853, 289, NULL, '80*80');
INSERT INTO `parameter` VALUES (1854, 289, NULL, '40*60');
INSERT INTO `parameter` VALUES (1855, 289, NULL, '50*70');
INSERT INTO `parameter` VALUES (1856, 289, NULL, '60*80');
INSERT INTO `parameter` VALUES (1857, 289, NULL, '70*100');
INSERT INTO `parameter` VALUES (1858, 290, 'http://muses.deepicecream.com:7010/img/create/1553516767974Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1859, 290, 'http://muses.deepicecream.com:7010/img/create/1553516767974Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1860, 290, 'http://muses.deepicecream.com:7010/img/create/1553516767974Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1861, 291, NULL, '40*40');
INSERT INTO `parameter` VALUES (1862, 291, NULL, '50*50');
INSERT INTO `parameter` VALUES (1863, 291, NULL, '60*60');
INSERT INTO `parameter` VALUES (1864, 291, NULL, '70*70');
INSERT INTO `parameter` VALUES (1865, 291, NULL, '80*80');
INSERT INTO `parameter` VALUES (1866, 291, NULL, '40*60');
INSERT INTO `parameter` VALUES (1867, 291, NULL, '50*70');
INSERT INTO `parameter` VALUES (1868, 291, NULL, '60*80');
INSERT INTO `parameter` VALUES (1869, 291, NULL, '70*100');
INSERT INTO `parameter` VALUES (1870, 292, 'http://muses.deepicecream.com:7010/img/create/1553532447762Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1871, 292, 'http://muses.deepicecream.com:7010/img/create/1553532447762Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1872, 292, 'http://muses.deepicecream.com:7010/img/create/1553532447762Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1873, 293, NULL, '40*40');
INSERT INTO `parameter` VALUES (1874, 293, NULL, '50*50');
INSERT INTO `parameter` VALUES (1875, 293, NULL, '60*60');
INSERT INTO `parameter` VALUES (1876, 293, NULL, '70*70');
INSERT INTO `parameter` VALUES (1877, 293, NULL, '80*80');
INSERT INTO `parameter` VALUES (1878, 293, NULL, '40*60');
INSERT INTO `parameter` VALUES (1879, 293, NULL, '50*70');
INSERT INTO `parameter` VALUES (1880, 293, NULL, '60*80');
INSERT INTO `parameter` VALUES (1881, 293, NULL, '70*100');
INSERT INTO `parameter` VALUES (1882, 294, 'http://muses.deepicecream.com:7010/img/create/1553532687305Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1883, 294, 'http://muses.deepicecream.com:7010/img/create/1553532687305Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1884, 294, 'http://muses.deepicecream.com:7010/img/create/1553532687305Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1885, 295, NULL, '40*40');
INSERT INTO `parameter` VALUES (1886, 295, NULL, '50*50');
INSERT INTO `parameter` VALUES (1887, 295, NULL, '60*60');
INSERT INTO `parameter` VALUES (1888, 295, NULL, '70*70');
INSERT INTO `parameter` VALUES (1889, 295, NULL, '80*80');
INSERT INTO `parameter` VALUES (1890, 295, NULL, '40*60');
INSERT INTO `parameter` VALUES (1891, 295, NULL, '50*70');
INSERT INTO `parameter` VALUES (1892, 295, NULL, '60*80');
INSERT INTO `parameter` VALUES (1893, 295, NULL, '70*100');
INSERT INTO `parameter` VALUES (1894, 296, 'http://muses.deepicecream.com:7010/img/create/1553658210334Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1895, 296, 'http://muses.deepicecream.com:7010/img/create/1553658210334Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1896, 296, 'http://muses.deepicecream.com:7010/img/create/1553658210334Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1897, 297, NULL, '40*40');
INSERT INTO `parameter` VALUES (1898, 297, NULL, '50*50');
INSERT INTO `parameter` VALUES (1899, 297, NULL, '60*60');
INSERT INTO `parameter` VALUES (1900, 297, NULL, '70*70');
INSERT INTO `parameter` VALUES (1901, 297, NULL, '80*80');
INSERT INTO `parameter` VALUES (1902, 297, NULL, '40*60');
INSERT INTO `parameter` VALUES (1903, 297, NULL, '50*70');
INSERT INTO `parameter` VALUES (1904, 297, NULL, '60*80');
INSERT INTO `parameter` VALUES (1905, 297, NULL, '70*100');
INSERT INTO `parameter` VALUES (1906, 298, 'http://muses.deepicecream.com:7010/img/create/1553666692300Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1907, 298, 'http://muses.deepicecream.com:7010/img/create/1553666692300Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1908, 298, 'http://muses.deepicecream.com:7010/img/create/1553666692300Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1909, 299, NULL, '40*40');
INSERT INTO `parameter` VALUES (1910, 299, NULL, '50*50');
INSERT INTO `parameter` VALUES (1911, 299, NULL, '60*60');
INSERT INTO `parameter` VALUES (1912, 299, NULL, '70*70');
INSERT INTO `parameter` VALUES (1913, 299, NULL, '80*80');
INSERT INTO `parameter` VALUES (1914, 299, NULL, '40*60');
INSERT INTO `parameter` VALUES (1915, 299, NULL, '50*70');
INSERT INTO `parameter` VALUES (1916, 299, NULL, '60*80');
INSERT INTO `parameter` VALUES (1917, 299, NULL, '70*100');
INSERT INTO `parameter` VALUES (1918, 300, 'http://muses.deepicecream.com:7010/img/create/1553667579326Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1919, 300, 'http://muses.deepicecream.com:7010/img/create/1553667579326Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1920, 300, 'http://muses.deepicecream.com:7010/img/create/1553667579326Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1921, 301, NULL, '40*40');
INSERT INTO `parameter` VALUES (1922, 301, NULL, '50*50');
INSERT INTO `parameter` VALUES (1923, 301, NULL, '60*60');
INSERT INTO `parameter` VALUES (1924, 301, NULL, '70*70');
INSERT INTO `parameter` VALUES (1925, 301, NULL, '80*80');
INSERT INTO `parameter` VALUES (1926, 301, NULL, '40*60');
INSERT INTO `parameter` VALUES (1927, 301, NULL, '50*70');
INSERT INTO `parameter` VALUES (1928, 301, NULL, '60*80');
INSERT INTO `parameter` VALUES (1929, 301, NULL, '70*100');
INSERT INTO `parameter` VALUES (1930, 302, 'http://muses.deepicecream.com:7010/img/create/1553668052932Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1931, 302, 'http://muses.deepicecream.com:7010/img/create/1553668052932Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1932, 302, 'http://muses.deepicecream.com:7010/img/create/1553668052932Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1933, 303, NULL, '40*40');
INSERT INTO `parameter` VALUES (1934, 303, NULL, '50*50');
INSERT INTO `parameter` VALUES (1935, 303, NULL, '60*60');
INSERT INTO `parameter` VALUES (1936, 303, NULL, '70*70');
INSERT INTO `parameter` VALUES (1937, 303, NULL, '80*80');
INSERT INTO `parameter` VALUES (1938, 303, NULL, '40*60');
INSERT INTO `parameter` VALUES (1939, 303, NULL, '50*70');
INSERT INTO `parameter` VALUES (1940, 303, NULL, '60*80');
INSERT INTO `parameter` VALUES (1941, 303, NULL, '70*100');
INSERT INTO `parameter` VALUES (1942, 304, 'http://muses.deepicecream.com:7010/img/create/1554623175697Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1943, 304, 'http://muses.deepicecream.com:7010/img/create/1554623175697Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1944, 304, 'http://muses.deepicecream.com:7010/img/create/1554623175697Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1945, 305, NULL, '40*40');
INSERT INTO `parameter` VALUES (1946, 305, NULL, '50*50');
INSERT INTO `parameter` VALUES (1947, 305, NULL, '60*60');
INSERT INTO `parameter` VALUES (1948, 305, NULL, '70*70');
INSERT INTO `parameter` VALUES (1949, 305, NULL, '80*80');
INSERT INTO `parameter` VALUES (1950, 305, NULL, '40*60');
INSERT INTO `parameter` VALUES (1951, 305, NULL, '50*70');
INSERT INTO `parameter` VALUES (1952, 305, NULL, '60*80');
INSERT INTO `parameter` VALUES (1953, 305, NULL, '70*100');
INSERT INTO `parameter` VALUES (1954, 306, 'http://muses.deepicecream.com:7010/img/create/1555937052531Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1955, 306, 'http://muses.deepicecream.com:7010/img/create/1555937052531Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1956, 306, 'http://muses.deepicecream.com:7010/img/create/1555937052531Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1957, 307, NULL, '40*40');
INSERT INTO `parameter` VALUES (1958, 307, NULL, '50*50');
INSERT INTO `parameter` VALUES (1959, 307, NULL, '60*60');
INSERT INTO `parameter` VALUES (1960, 307, NULL, '70*70');
INSERT INTO `parameter` VALUES (1961, 307, NULL, '80*80');
INSERT INTO `parameter` VALUES (1962, 307, NULL, '40*60');
INSERT INTO `parameter` VALUES (1963, 307, NULL, '50*70');
INSERT INTO `parameter` VALUES (1964, 307, NULL, '60*80');
INSERT INTO `parameter` VALUES (1965, 307, NULL, '70*100');
INSERT INTO `parameter` VALUES (1966, 308, 'http://muses.deepicecream.com:7010/img/create/1558674863141Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1967, 308, 'http://muses.deepicecream.com:7010/img/create/1558674863141Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1968, 308, 'http://muses.deepicecream.com:7010/img/create/1558674863141Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1969, 309, NULL, '40*40');
INSERT INTO `parameter` VALUES (1970, 309, NULL, '50*50');
INSERT INTO `parameter` VALUES (1971, 309, NULL, '60*60');
INSERT INTO `parameter` VALUES (1972, 309, NULL, '70*70');
INSERT INTO `parameter` VALUES (1973, 309, NULL, '80*80');
INSERT INTO `parameter` VALUES (1974, 309, NULL, '40*60');
INSERT INTO `parameter` VALUES (1975, 309, NULL, '50*70');
INSERT INTO `parameter` VALUES (1976, 309, NULL, '60*80');
INSERT INTO `parameter` VALUES (1977, 309, NULL, '70*100');
INSERT INTO `parameter` VALUES (1978, 310, 'http://muses.deepicecream.com:7010/img/create/1558794720781Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1979, 310, 'http://muses.deepicecream.com:7010/img/create/1558794720781Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1980, 310, 'http://muses.deepicecream.com:7010/img/create/1558794720781Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1981, 311, NULL, '40*40');
INSERT INTO `parameter` VALUES (1982, 311, NULL, '50*50');
INSERT INTO `parameter` VALUES (1983, 311, NULL, '60*60');
INSERT INTO `parameter` VALUES (1984, 311, NULL, '70*70');
INSERT INTO `parameter` VALUES (1985, 311, NULL, '80*80');
INSERT INTO `parameter` VALUES (1986, 311, NULL, '40*60');
INSERT INTO `parameter` VALUES (1987, 311, NULL, '50*70');
INSERT INTO `parameter` VALUES (1988, 311, NULL, '60*80');
INSERT INTO `parameter` VALUES (1989, 311, NULL, '70*100');
INSERT INTO `parameter` VALUES (1990, 312, 'http://muses.deepicecream.com:7010/img/create/1558802522195Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (1991, 312, 'http://muses.deepicecream.com:7010/img/create/1558802522195Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (1992, 312, 'http://muses.deepicecream.com:7010/img/create/1558802522195Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (1993, 313, NULL, '40*40');
INSERT INTO `parameter` VALUES (1994, 313, NULL, '50*50');
INSERT INTO `parameter` VALUES (1995, 313, NULL, '60*60');
INSERT INTO `parameter` VALUES (1996, 313, NULL, '70*70');
INSERT INTO `parameter` VALUES (1997, 313, NULL, '80*80');
INSERT INTO `parameter` VALUES (1998, 313, NULL, '40*60');
INSERT INTO `parameter` VALUES (1999, 313, NULL, '50*70');
INSERT INTO `parameter` VALUES (2000, 313, NULL, '60*80');
INSERT INTO `parameter` VALUES (2001, 313, NULL, '70*100');
INSERT INTO `parameter` VALUES (2002, 314, 'http://muses.deepicecream.com:7010/img/create/1558849673935Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2003, 314, 'http://muses.deepicecream.com:7010/img/create/1558849673935Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2004, 314, 'http://muses.deepicecream.com:7010/img/create/1558849673935Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2005, 315, NULL, '40*40');
INSERT INTO `parameter` VALUES (2006, 315, NULL, '50*50');
INSERT INTO `parameter` VALUES (2007, 315, NULL, '60*60');
INSERT INTO `parameter` VALUES (2008, 315, NULL, '70*70');
INSERT INTO `parameter` VALUES (2009, 315, NULL, '80*80');
INSERT INTO `parameter` VALUES (2010, 315, NULL, '40*60');
INSERT INTO `parameter` VALUES (2011, 315, NULL, '50*70');
INSERT INTO `parameter` VALUES (2012, 315, NULL, '60*80');
INSERT INTO `parameter` VALUES (2013, 315, NULL, '70*100');
INSERT INTO `parameter` VALUES (2014, 316, 'http://muses.deepicecream.com:7010/img/create/1558854993014Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2015, 316, 'http://muses.deepicecream.com:7010/img/create/1558854993014Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2016, 316, 'http://muses.deepicecream.com:7010/img/create/1558854993014Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2017, 317, NULL, '40*40');
INSERT INTO `parameter` VALUES (2018, 317, NULL, '50*50');
INSERT INTO `parameter` VALUES (2019, 317, NULL, '60*60');
INSERT INTO `parameter` VALUES (2020, 317, NULL, '70*70');
INSERT INTO `parameter` VALUES (2021, 317, NULL, '80*80');
INSERT INTO `parameter` VALUES (2022, 317, NULL, '40*60');
INSERT INTO `parameter` VALUES (2023, 317, NULL, '50*70');
INSERT INTO `parameter` VALUES (2024, 317, NULL, '60*80');
INSERT INTO `parameter` VALUES (2025, 317, NULL, '70*100');
INSERT INTO `parameter` VALUES (2026, 318, 'http://muses.deepicecream.com:7010/img/create/1558861235166Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2027, 318, 'http://muses.deepicecream.com:7010/img/create/1558861235166Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2028, 318, 'http://muses.deepicecream.com:7010/img/create/1558861235166Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2029, 319, NULL, '40*40');
INSERT INTO `parameter` VALUES (2030, 319, NULL, '50*50');
INSERT INTO `parameter` VALUES (2031, 319, NULL, '60*60');
INSERT INTO `parameter` VALUES (2032, 319, NULL, '70*70');
INSERT INTO `parameter` VALUES (2033, 319, NULL, '80*80');
INSERT INTO `parameter` VALUES (2034, 319, NULL, '40*60');
INSERT INTO `parameter` VALUES (2035, 319, NULL, '50*70');
INSERT INTO `parameter` VALUES (2036, 319, NULL, '60*80');
INSERT INTO `parameter` VALUES (2037, 319, NULL, '70*100');
INSERT INTO `parameter` VALUES (2038, 320, 'http://muses.deepicecream.com:7010/img/create/1558861251617Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2039, 320, 'http://muses.deepicecream.com:7010/img/create/1558861251617Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2040, 320, 'http://muses.deepicecream.com:7010/img/create/1558861251617Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2041, 321, NULL, '40*40');
INSERT INTO `parameter` VALUES (2042, 321, NULL, '50*50');
INSERT INTO `parameter` VALUES (2043, 321, NULL, '60*60');
INSERT INTO `parameter` VALUES (2044, 321, NULL, '70*70');
INSERT INTO `parameter` VALUES (2045, 321, NULL, '80*80');
INSERT INTO `parameter` VALUES (2046, 321, NULL, '40*60');
INSERT INTO `parameter` VALUES (2047, 321, NULL, '50*70');
INSERT INTO `parameter` VALUES (2048, 321, NULL, '60*80');
INSERT INTO `parameter` VALUES (2049, 321, NULL, '70*100');
INSERT INTO `parameter` VALUES (2050, 322, 'http://muses.deepicecream.com:7010/img/create/1558861353107Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2051, 322, 'http://muses.deepicecream.com:7010/img/create/1558861353107Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2052, 322, 'http://muses.deepicecream.com:7010/img/create/1558861353107Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2053, 323, NULL, '40*40');
INSERT INTO `parameter` VALUES (2054, 323, NULL, '50*50');
INSERT INTO `parameter` VALUES (2055, 323, NULL, '60*60');
INSERT INTO `parameter` VALUES (2056, 323, NULL, '70*70');
INSERT INTO `parameter` VALUES (2057, 323, NULL, '80*80');
INSERT INTO `parameter` VALUES (2058, 323, NULL, '40*60');
INSERT INTO `parameter` VALUES (2059, 323, NULL, '50*70');
INSERT INTO `parameter` VALUES (2060, 323, NULL, '60*80');
INSERT INTO `parameter` VALUES (2061, 323, NULL, '70*100');
INSERT INTO `parameter` VALUES (2062, 324, 'http://muses.deepicecream.com:7010/img/create/1558861382710Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2063, 324, 'http://muses.deepicecream.com:7010/img/create/1558861382710Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2064, 324, 'http://muses.deepicecream.com:7010/img/create/1558861382710Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2065, 325, NULL, '40*40');
INSERT INTO `parameter` VALUES (2066, 325, NULL, '50*50');
INSERT INTO `parameter` VALUES (2067, 325, NULL, '60*60');
INSERT INTO `parameter` VALUES (2068, 325, NULL, '70*70');
INSERT INTO `parameter` VALUES (2069, 325, NULL, '80*80');
INSERT INTO `parameter` VALUES (2070, 325, NULL, '40*60');
INSERT INTO `parameter` VALUES (2071, 325, NULL, '50*70');
INSERT INTO `parameter` VALUES (2072, 325, NULL, '60*80');
INSERT INTO `parameter` VALUES (2073, 325, NULL, '70*100');
INSERT INTO `parameter` VALUES (2074, 326, 'http://muses.deepicecream.com:7010/img/create/1558946156165Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2075, 326, 'http://muses.deepicecream.com:7010/img/create/1558946156165Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2076, 326, 'http://muses.deepicecream.com:7010/img/create/1558946156165Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2077, 327, NULL, '40*40');
INSERT INTO `parameter` VALUES (2078, 327, NULL, '50*50');
INSERT INTO `parameter` VALUES (2079, 327, NULL, '60*60');
INSERT INTO `parameter` VALUES (2080, 327, NULL, '70*70');
INSERT INTO `parameter` VALUES (2081, 327, NULL, '80*80');
INSERT INTO `parameter` VALUES (2082, 327, NULL, '40*60');
INSERT INTO `parameter` VALUES (2083, 327, NULL, '50*70');
INSERT INTO `parameter` VALUES (2084, 327, NULL, '60*80');
INSERT INTO `parameter` VALUES (2085, 327, NULL, '70*100');
INSERT INTO `parameter` VALUES (2086, 328, 'http://muses.deepicecream.com:7010/img/create/1559135600311Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2087, 328, 'http://muses.deepicecream.com:7010/img/create/1559135600311Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2088, 328, 'http://muses.deepicecream.com:7010/img/create/1559135600311Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2089, 329, NULL, '40*40');
INSERT INTO `parameter` VALUES (2090, 329, NULL, '50*50');
INSERT INTO `parameter` VALUES (2091, 329, NULL, '60*60');
INSERT INTO `parameter` VALUES (2092, 329, NULL, '70*70');
INSERT INTO `parameter` VALUES (2093, 329, NULL, '80*80');
INSERT INTO `parameter` VALUES (2094, 329, NULL, '40*60');
INSERT INTO `parameter` VALUES (2095, 329, NULL, '50*70');
INSERT INTO `parameter` VALUES (2096, 329, NULL, '60*80');
INSERT INTO `parameter` VALUES (2097, 329, NULL, '70*100');
INSERT INTO `parameter` VALUES (2098, 330, 'http://muses.deepicecream.com:7010/img/create/1559200088173Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2099, 330, 'http://muses.deepicecream.com:7010/img/create/1559200088173Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2100, 330, 'http://muses.deepicecream.com:7010/img/create/1559200088173Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2101, 331, NULL, '40*40');
INSERT INTO `parameter` VALUES (2102, 331, NULL, '50*50');
INSERT INTO `parameter` VALUES (2103, 331, NULL, '60*60');
INSERT INTO `parameter` VALUES (2104, 331, NULL, '70*70');
INSERT INTO `parameter` VALUES (2105, 331, NULL, '80*80');
INSERT INTO `parameter` VALUES (2106, 331, NULL, '40*60');
INSERT INTO `parameter` VALUES (2107, 331, NULL, '50*70');
INSERT INTO `parameter` VALUES (2108, 331, NULL, '60*80');
INSERT INTO `parameter` VALUES (2109, 331, NULL, '70*100');
INSERT INTO `parameter` VALUES (2110, 332, 'http://muses.deepicecream.com:7010/img/create/1559200227284Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2111, 332, 'http://muses.deepicecream.com:7010/img/create/1559200227284Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2112, 332, 'http://muses.deepicecream.com:7010/img/create/1559200227284Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2113, 333, NULL, '40*40');
INSERT INTO `parameter` VALUES (2114, 333, NULL, '50*50');
INSERT INTO `parameter` VALUES (2115, 333, NULL, '60*60');
INSERT INTO `parameter` VALUES (2116, 333, NULL, '70*70');
INSERT INTO `parameter` VALUES (2117, 333, NULL, '80*80');
INSERT INTO `parameter` VALUES (2118, 333, NULL, '40*60');
INSERT INTO `parameter` VALUES (2119, 333, NULL, '50*70');
INSERT INTO `parameter` VALUES (2120, 333, NULL, '60*80');
INSERT INTO `parameter` VALUES (2121, 333, NULL, '70*100');
INSERT INTO `parameter` VALUES (2122, 334, 'http://muses.deepicecream.com:7010/img/create/1559200247707Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2123, 334, 'http://muses.deepicecream.com:7010/img/create/1559200247707Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2124, 334, 'http://muses.deepicecream.com:7010/img/create/1559200247707Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2125, 335, NULL, '40*40');
INSERT INTO `parameter` VALUES (2126, 335, NULL, '50*50');
INSERT INTO `parameter` VALUES (2127, 335, NULL, '60*60');
INSERT INTO `parameter` VALUES (2128, 335, NULL, '70*70');
INSERT INTO `parameter` VALUES (2129, 335, NULL, '80*80');
INSERT INTO `parameter` VALUES (2130, 335, NULL, '40*60');
INSERT INTO `parameter` VALUES (2131, 335, NULL, '50*70');
INSERT INTO `parameter` VALUES (2132, 335, NULL, '60*80');
INSERT INTO `parameter` VALUES (2133, 335, NULL, '70*100');
INSERT INTO `parameter` VALUES (2134, 336, 'http://muses.deepicecream.com:7010/img/create/1559202261296Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2135, 336, 'http://muses.deepicecream.com:7010/img/create/1559202261296Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2136, 336, 'http://muses.deepicecream.com:7010/img/create/1559202261296Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2137, 337, NULL, '40*40');
INSERT INTO `parameter` VALUES (2138, 337, NULL, '50*50');
INSERT INTO `parameter` VALUES (2139, 337, NULL, '60*60');
INSERT INTO `parameter` VALUES (2140, 337, NULL, '70*70');
INSERT INTO `parameter` VALUES (2141, 337, NULL, '80*80');
INSERT INTO `parameter` VALUES (2142, 337, NULL, '40*60');
INSERT INTO `parameter` VALUES (2143, 337, NULL, '50*70');
INSERT INTO `parameter` VALUES (2144, 337, NULL, '60*80');
INSERT INTO `parameter` VALUES (2145, 337, NULL, '70*100');
INSERT INTO `parameter` VALUES (2146, 338, 'http://muses.deepicecream.com:7010/img/create/1559202969588Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2147, 338, 'http://muses.deepicecream.com:7010/img/create/1559202969588Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2148, 338, 'http://muses.deepicecream.com:7010/img/create/1559202969588Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2149, 339, NULL, '40*40');
INSERT INTO `parameter` VALUES (2150, 339, NULL, '50*50');
INSERT INTO `parameter` VALUES (2151, 339, NULL, '60*60');
INSERT INTO `parameter` VALUES (2152, 339, NULL, '70*70');
INSERT INTO `parameter` VALUES (2153, 339, NULL, '80*80');
INSERT INTO `parameter` VALUES (2154, 339, NULL, '40*60');
INSERT INTO `parameter` VALUES (2155, 339, NULL, '50*70');
INSERT INTO `parameter` VALUES (2156, 339, NULL, '60*80');
INSERT INTO `parameter` VALUES (2157, 339, NULL, '70*100');
INSERT INTO `parameter` VALUES (2158, 340, 'http://muses.deepicecream.com:7010/img/create/1559202980504Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2159, 340, 'http://muses.deepicecream.com:7010/img/create/1559202980504Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2160, 340, 'http://muses.deepicecream.com:7010/img/create/1559202980504Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2161, 341, NULL, '40*40');
INSERT INTO `parameter` VALUES (2162, 341, NULL, '50*50');
INSERT INTO `parameter` VALUES (2163, 341, NULL, '60*60');
INSERT INTO `parameter` VALUES (2164, 341, NULL, '70*70');
INSERT INTO `parameter` VALUES (2165, 341, NULL, '80*80');
INSERT INTO `parameter` VALUES (2166, 341, NULL, '40*60');
INSERT INTO `parameter` VALUES (2167, 341, NULL, '50*70');
INSERT INTO `parameter` VALUES (2168, 341, NULL, '60*80');
INSERT INTO `parameter` VALUES (2169, 341, NULL, '70*100');
INSERT INTO `parameter` VALUES (2170, 342, 'http://muses.deepicecream.com:7010/img/create/1559206014237Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2171, 342, 'http://muses.deepicecream.com:7010/img/create/1559206014237Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2172, 342, 'http://muses.deepicecream.com:7010/img/create/1559206014237Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2173, 343, NULL, '40*40');
INSERT INTO `parameter` VALUES (2174, 343, NULL, '50*50');
INSERT INTO `parameter` VALUES (2175, 343, NULL, '60*60');
INSERT INTO `parameter` VALUES (2176, 343, NULL, '70*70');
INSERT INTO `parameter` VALUES (2177, 343, NULL, '80*80');
INSERT INTO `parameter` VALUES (2178, 343, NULL, '40*60');
INSERT INTO `parameter` VALUES (2179, 343, NULL, '50*70');
INSERT INTO `parameter` VALUES (2180, 343, NULL, '60*80');
INSERT INTO `parameter` VALUES (2181, 343, NULL, '70*100');
INSERT INTO `parameter` VALUES (2182, 344, 'http://muses.deepicecream.com:7010/img/create/1559210375612Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2183, 344, 'http://muses.deepicecream.com:7010/img/create/1559210375612Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2184, 344, 'http://muses.deepicecream.com:7010/img/create/1559210375612Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2185, 345, NULL, '40*40');
INSERT INTO `parameter` VALUES (2186, 345, NULL, '50*50');
INSERT INTO `parameter` VALUES (2187, 345, NULL, '60*60');
INSERT INTO `parameter` VALUES (2188, 345, NULL, '70*70');
INSERT INTO `parameter` VALUES (2189, 345, NULL, '80*80');
INSERT INTO `parameter` VALUES (2190, 345, NULL, '40*60');
INSERT INTO `parameter` VALUES (2191, 345, NULL, '50*70');
INSERT INTO `parameter` VALUES (2192, 345, NULL, '60*80');
INSERT INTO `parameter` VALUES (2193, 345, NULL, '70*100');
INSERT INTO `parameter` VALUES (2194, 346, 'http://muses.deepicecream.com:7010/img/create/1559211765679Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2195, 346, 'http://muses.deepicecream.com:7010/img/create/1559211765679Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2196, 346, 'http://muses.deepicecream.com:7010/img/create/1559211765679Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2197, 347, NULL, '40*40');
INSERT INTO `parameter` VALUES (2198, 347, NULL, '50*50');
INSERT INTO `parameter` VALUES (2199, 347, NULL, '60*60');
INSERT INTO `parameter` VALUES (2200, 347, NULL, '70*70');
INSERT INTO `parameter` VALUES (2201, 347, NULL, '80*80');
INSERT INTO `parameter` VALUES (2202, 347, NULL, '40*60');
INSERT INTO `parameter` VALUES (2203, 347, NULL, '50*70');
INSERT INTO `parameter` VALUES (2204, 347, NULL, '60*80');
INSERT INTO `parameter` VALUES (2205, 347, NULL, '70*100');
INSERT INTO `parameter` VALUES (2206, 348, 'http://muses.deepicecream.com:7010/img/create/1559237395225Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2207, 348, 'http://muses.deepicecream.com:7010/img/create/1559237395225Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2208, 348, 'http://muses.deepicecream.com:7010/img/create/1559237395225Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2209, 349, NULL, '40*40');
INSERT INTO `parameter` VALUES (2210, 349, NULL, '50*50');
INSERT INTO `parameter` VALUES (2211, 349, NULL, '60*60');
INSERT INTO `parameter` VALUES (2212, 349, NULL, '70*70');
INSERT INTO `parameter` VALUES (2213, 349, NULL, '80*80');
INSERT INTO `parameter` VALUES (2214, 349, NULL, '40*60');
INSERT INTO `parameter` VALUES (2215, 349, NULL, '50*70');
INSERT INTO `parameter` VALUES (2216, 349, NULL, '60*80');
INSERT INTO `parameter` VALUES (2217, 349, NULL, '70*100');
INSERT INTO `parameter` VALUES (2218, 350, 'http://muses.deepicecream.com:7010/img/create/1559237755842Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2219, 350, 'http://muses.deepicecream.com:7010/img/create/1559237755842Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2220, 350, 'http://muses.deepicecream.com:7010/img/create/1559237755842Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2221, 351, NULL, '40*40');
INSERT INTO `parameter` VALUES (2222, 351, NULL, '50*50');
INSERT INTO `parameter` VALUES (2223, 351, NULL, '60*60');
INSERT INTO `parameter` VALUES (2224, 351, NULL, '70*70');
INSERT INTO `parameter` VALUES (2225, 351, NULL, '80*80');
INSERT INTO `parameter` VALUES (2226, 351, NULL, '40*60');
INSERT INTO `parameter` VALUES (2227, 351, NULL, '50*70');
INSERT INTO `parameter` VALUES (2228, 351, NULL, '60*80');
INSERT INTO `parameter` VALUES (2229, 351, NULL, '70*100');
INSERT INTO `parameter` VALUES (2230, 352, 'http://muses.deepicecream.com:7010/img/create/1559237875556Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2231, 352, 'http://muses.deepicecream.com:7010/img/create/1559237875556Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2232, 352, 'http://muses.deepicecream.com:7010/img/create/1559237875556Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2233, 353, NULL, '40*40');
INSERT INTO `parameter` VALUES (2234, 353, NULL, '50*50');
INSERT INTO `parameter` VALUES (2235, 353, NULL, '60*60');
INSERT INTO `parameter` VALUES (2236, 353, NULL, '70*70');
INSERT INTO `parameter` VALUES (2237, 353, NULL, '80*80');
INSERT INTO `parameter` VALUES (2238, 353, NULL, '40*60');
INSERT INTO `parameter` VALUES (2239, 353, NULL, '50*70');
INSERT INTO `parameter` VALUES (2240, 353, NULL, '60*80');
INSERT INTO `parameter` VALUES (2241, 353, NULL, '70*100');
INSERT INTO `parameter` VALUES (2242, 354, 'http://muses.deepicecream.com:7010/img/create/1559238009710Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2243, 354, 'http://muses.deepicecream.com:7010/img/create/1559238009710Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2244, 354, 'http://muses.deepicecream.com:7010/img/create/1559238009710Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2245, 355, NULL, '40*40');
INSERT INTO `parameter` VALUES (2246, 355, NULL, '50*50');
INSERT INTO `parameter` VALUES (2247, 355, NULL, '60*60');
INSERT INTO `parameter` VALUES (2248, 355, NULL, '70*70');
INSERT INTO `parameter` VALUES (2249, 355, NULL, '80*80');
INSERT INTO `parameter` VALUES (2250, 355, NULL, '40*60');
INSERT INTO `parameter` VALUES (2251, 355, NULL, '50*70');
INSERT INTO `parameter` VALUES (2252, 355, NULL, '60*80');
INSERT INTO `parameter` VALUES (2253, 355, NULL, '70*100');
INSERT INTO `parameter` VALUES (2254, 356, 'http://muses.deepicecream.com:7010/img/create/1559238163125Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2255, 356, 'http://muses.deepicecream.com:7010/img/create/1559238163125Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2256, 356, 'http://muses.deepicecream.com:7010/img/create/1559238163125Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2257, 357, NULL, '40*40');
INSERT INTO `parameter` VALUES (2258, 357, NULL, '50*50');
INSERT INTO `parameter` VALUES (2259, 357, NULL, '60*60');
INSERT INTO `parameter` VALUES (2260, 357, NULL, '70*70');
INSERT INTO `parameter` VALUES (2261, 357, NULL, '80*80');
INSERT INTO `parameter` VALUES (2262, 357, NULL, '40*60');
INSERT INTO `parameter` VALUES (2263, 357, NULL, '50*70');
INSERT INTO `parameter` VALUES (2264, 357, NULL, '60*80');
INSERT INTO `parameter` VALUES (2265, 357, NULL, '70*100');
INSERT INTO `parameter` VALUES (2266, 358, 'http://muses.deepicecream.com:7010/img/create/1559238247410Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2267, 358, 'http://muses.deepicecream.com:7010/img/create/1559238247410Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2268, 358, 'http://muses.deepicecream.com:7010/img/create/1559238247410Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2269, 359, NULL, '40*40');
INSERT INTO `parameter` VALUES (2270, 359, NULL, '50*50');
INSERT INTO `parameter` VALUES (2271, 359, NULL, '60*60');
INSERT INTO `parameter` VALUES (2272, 359, NULL, '70*70');
INSERT INTO `parameter` VALUES (2273, 359, NULL, '80*80');
INSERT INTO `parameter` VALUES (2274, 359, NULL, '40*60');
INSERT INTO `parameter` VALUES (2275, 359, NULL, '50*70');
INSERT INTO `parameter` VALUES (2276, 359, NULL, '60*80');
INSERT INTO `parameter` VALUES (2277, 359, NULL, '70*100');
INSERT INTO `parameter` VALUES (2278, 360, 'http://muses.deepicecream.com:7010/img/create/1559238418920Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2279, 360, 'http://muses.deepicecream.com:7010/img/create/1559238418920Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2280, 360, 'http://muses.deepicecream.com:7010/img/create/1559238418920Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2281, 361, NULL, '40*40');
INSERT INTO `parameter` VALUES (2282, 361, NULL, '50*50');
INSERT INTO `parameter` VALUES (2283, 361, NULL, '60*60');
INSERT INTO `parameter` VALUES (2284, 361, NULL, '70*70');
INSERT INTO `parameter` VALUES (2285, 361, NULL, '80*80');
INSERT INTO `parameter` VALUES (2286, 361, NULL, '40*60');
INSERT INTO `parameter` VALUES (2287, 361, NULL, '50*70');
INSERT INTO `parameter` VALUES (2288, 361, NULL, '60*80');
INSERT INTO `parameter` VALUES (2289, 361, NULL, '70*100');
INSERT INTO `parameter` VALUES (2290, 362, 'http://muses.deepicecream.com:7010/img/create/1559273937968Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2291, 362, 'http://muses.deepicecream.com:7010/img/create/1559273937968Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2292, 362, 'http://muses.deepicecream.com:7010/img/create/1559273937968Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2293, 363, NULL, '40*40');
INSERT INTO `parameter` VALUES (2294, 363, NULL, '50*50');
INSERT INTO `parameter` VALUES (2295, 363, NULL, '60*60');
INSERT INTO `parameter` VALUES (2296, 363, NULL, '70*70');
INSERT INTO `parameter` VALUES (2297, 363, NULL, '80*80');
INSERT INTO `parameter` VALUES (2298, 363, NULL, '40*60');
INSERT INTO `parameter` VALUES (2299, 363, NULL, '50*70');
INSERT INTO `parameter` VALUES (2300, 363, NULL, '60*80');
INSERT INTO `parameter` VALUES (2301, 363, NULL, '70*100');
INSERT INTO `parameter` VALUES (2302, 364, 'http://muses.deepicecream.com:7010/img/create/1559273972408Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2303, 364, 'http://muses.deepicecream.com:7010/img/create/1559273972408Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2304, 364, 'http://muses.deepicecream.com:7010/img/create/1559273972408Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2305, 365, NULL, '40*40');
INSERT INTO `parameter` VALUES (2306, 365, NULL, '50*50');
INSERT INTO `parameter` VALUES (2307, 365, NULL, '60*60');
INSERT INTO `parameter` VALUES (2308, 365, NULL, '70*70');
INSERT INTO `parameter` VALUES (2309, 365, NULL, '80*80');
INSERT INTO `parameter` VALUES (2310, 365, NULL, '40*60');
INSERT INTO `parameter` VALUES (2311, 365, NULL, '50*70');
INSERT INTO `parameter` VALUES (2312, 365, NULL, '60*80');
INSERT INTO `parameter` VALUES (2313, 365, NULL, '70*100');
INSERT INTO `parameter` VALUES (2314, 366, 'http://muses.deepicecream.com:7010/img/create/1559280774603Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2315, 366, 'http://muses.deepicecream.com:7010/img/create/1559280774603Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2316, 366, 'http://muses.deepicecream.com:7010/img/create/1559280774603Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2317, 367, NULL, '40*40');
INSERT INTO `parameter` VALUES (2318, 367, NULL, '50*50');
INSERT INTO `parameter` VALUES (2319, 367, NULL, '60*60');
INSERT INTO `parameter` VALUES (2320, 367, NULL, '70*70');
INSERT INTO `parameter` VALUES (2321, 367, NULL, '80*80');
INSERT INTO `parameter` VALUES (2322, 367, NULL, '40*60');
INSERT INTO `parameter` VALUES (2323, 367, NULL, '50*70');
INSERT INTO `parameter` VALUES (2324, 367, NULL, '60*80');
INSERT INTO `parameter` VALUES (2325, 367, NULL, '70*100');
INSERT INTO `parameter` VALUES (2326, 368, 'http://muses.deepicecream.com:7010/img/create/1559285373988Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2327, 368, 'http://muses.deepicecream.com:7010/img/create/1559285373988Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2328, 368, 'http://muses.deepicecream.com:7010/img/create/1559285373988Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2329, 369, NULL, '40*40');
INSERT INTO `parameter` VALUES (2330, 369, NULL, '50*50');
INSERT INTO `parameter` VALUES (2331, 369, NULL, '60*60');
INSERT INTO `parameter` VALUES (2332, 369, NULL, '70*70');
INSERT INTO `parameter` VALUES (2333, 369, NULL, '80*80');
INSERT INTO `parameter` VALUES (2334, 369, NULL, '40*60');
INSERT INTO `parameter` VALUES (2335, 369, NULL, '50*70');
INSERT INTO `parameter` VALUES (2336, 369, NULL, '60*80');
INSERT INTO `parameter` VALUES (2337, 369, NULL, '70*100');
INSERT INTO `parameter` VALUES (2338, 370, 'http://muses.deepicecream.com:7010/img/create/1559293937693Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2339, 370, 'http://muses.deepicecream.com:7010/img/create/1559293937693Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2340, 370, 'http://muses.deepicecream.com:7010/img/create/1559293937693Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2341, 371, NULL, '40*40');
INSERT INTO `parameter` VALUES (2342, 371, NULL, '50*50');
INSERT INTO `parameter` VALUES (2343, 371, NULL, '60*60');
INSERT INTO `parameter` VALUES (2344, 371, NULL, '70*70');
INSERT INTO `parameter` VALUES (2345, 371, NULL, '80*80');
INSERT INTO `parameter` VALUES (2346, 371, NULL, '40*60');
INSERT INTO `parameter` VALUES (2347, 371, NULL, '50*70');
INSERT INTO `parameter` VALUES (2348, 371, NULL, '60*80');
INSERT INTO `parameter` VALUES (2349, 371, NULL, '70*100');
INSERT INTO `parameter` VALUES (2350, 372, 'http://muses.deepicecream.com:7010/img/create/1560146603456Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2351, 372, 'http://muses.deepicecream.com:7010/img/create/1560146603456Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2352, 372, 'http://muses.deepicecream.com:7010/img/create/1560146603456Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2353, 373, NULL, '40*40');
INSERT INTO `parameter` VALUES (2354, 373, NULL, '50*50');
INSERT INTO `parameter` VALUES (2355, 373, NULL, '60*60');
INSERT INTO `parameter` VALUES (2356, 373, NULL, '70*70');
INSERT INTO `parameter` VALUES (2357, 373, NULL, '80*80');
INSERT INTO `parameter` VALUES (2358, 373, NULL, '40*60');
INSERT INTO `parameter` VALUES (2359, 373, NULL, '50*70');
INSERT INTO `parameter` VALUES (2360, 373, NULL, '60*80');
INSERT INTO `parameter` VALUES (2361, 373, NULL, '70*100');
INSERT INTO `parameter` VALUES (2362, 374, 'http://muses.deepicecream.com:7010/img/create/1561341343617Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2363, 374, 'http://muses.deepicecream.com:7010/img/create/1561341343617Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2364, 374, 'http://muses.deepicecream.com:7010/img/create/1561341343617Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2365, 375, NULL, '40*40');
INSERT INTO `parameter` VALUES (2366, 375, NULL, '50*50');
INSERT INTO `parameter` VALUES (2367, 375, NULL, '60*60');
INSERT INTO `parameter` VALUES (2368, 375, NULL, '70*70');
INSERT INTO `parameter` VALUES (2369, 375, NULL, '80*80');
INSERT INTO `parameter` VALUES (2370, 375, NULL, '40*60');
INSERT INTO `parameter` VALUES (2371, 375, NULL, '50*70');
INSERT INTO `parameter` VALUES (2372, 375, NULL, '60*80');
INSERT INTO `parameter` VALUES (2373, 375, NULL, '70*100');
INSERT INTO `parameter` VALUES (2374, 376, 'http://muses.deepicecream.com:7010/img/create/1561341800562Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2375, 376, 'http://muses.deepicecream.com:7010/img/create/1561341800562Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2376, 376, 'http://muses.deepicecream.com:7010/img/create/1561341800562Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2377, 377, NULL, '40*40');
INSERT INTO `parameter` VALUES (2378, 377, NULL, '50*50');
INSERT INTO `parameter` VALUES (2379, 377, NULL, '60*60');
INSERT INTO `parameter` VALUES (2380, 377, NULL, '70*70');
INSERT INTO `parameter` VALUES (2381, 377, NULL, '80*80');
INSERT INTO `parameter` VALUES (2382, 377, NULL, '40*60');
INSERT INTO `parameter` VALUES (2383, 377, NULL, '50*70');
INSERT INTO `parameter` VALUES (2384, 377, NULL, '60*80');
INSERT INTO `parameter` VALUES (2385, 377, NULL, '70*100');
INSERT INTO `parameter` VALUES (2386, 378, 'http://muses.deepicecream.com:7010/img/create/1571465569492Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2387, 378, 'http://muses.deepicecream.com:7010/img/create/1571465569492Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2388, 378, 'http://muses.deepicecream.com:7010/img/create/1571465569492Commodity.jpg', '白色框');
INSERT INTO `parameter` VALUES (2389, 379, NULL, '40*40');
INSERT INTO `parameter` VALUES (2390, 379, NULL, '50*50');
INSERT INTO `parameter` VALUES (2391, 379, NULL, '60*60');
INSERT INTO `parameter` VALUES (2392, 379, NULL, '70*70');
INSERT INTO `parameter` VALUES (2393, 379, NULL, '80*80');
INSERT INTO `parameter` VALUES (2394, 379, NULL, '40*60');
INSERT INTO `parameter` VALUES (2395, 379, NULL, '50*70');
INSERT INTO `parameter` VALUES (2396, 379, NULL, '60*80');
INSERT INTO `parameter` VALUES (2397, 379, NULL, '70*100');
INSERT INTO `parameter` VALUES (2398, 380, 'http://muses.deepicecream.com:7010/img/create/1578817106575Commodity.jpg', '木纹框');
INSERT INTO `parameter` VALUES (2399, 380, 'http://muses.deepicecream.com:7010/img/create/1578817106575Commodity.jpg', '黑色框');
INSERT INTO `parameter` VALUES (2400, 380, 'http://muses.deepicecream.com:7010/img/create/1578817106575Commodity.jpg', '白色框');

-- ----------------------------
-- Table structure for torder
-- ----------------------------
DROP TABLE IF EXISTS `torder`;
CREATE TABLE `torder`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_amount` float NULL DEFAULT NULL,
  `order_sn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pay_time` datetime(0) NULL DEFAULT NULL,
  `post_script` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `trade_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  `add_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_6xnnc6pi9kconht85xfgjgpfa`(`user_id`) USING BTREE,
  CONSTRAINT `FK_6xnnc6pi9kconht85xfgjgpfa` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1315 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of torder
-- ----------------------------
INSERT INTO `torder` VALUES (1263, 158, '52402d297bab4c1aad3dbee9c6aeae97', '2019-03-21 21:35:50', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 21:35:49');
INSERT INTO `torder` VALUES (1264, 158, '3987e2b12bd546f8a0eea88af205c601', '2019-03-21 21:46:02', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 21:46:01');
INSERT INTO `torder` VALUES (1270, 158, 'ae651ac772f24184ad6355d33706a2d1', '2019-03-21 22:09:17', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 22:09:16');
INSERT INTO `torder` VALUES (1271, 158, '1074387f063e427bb14ed7df570c9d0a', '2019-03-21 22:15:09', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 22:15:08');
INSERT INTO `torder` VALUES (1272, 158, 'edaa8504eb344410804b2b785b124ab6', '2019-03-21 22:21:08', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 22:21:07');
INSERT INTO `torder` VALUES (1273, 158, '7d515a5b43d04acd8979df7c01b9ae3f', '2019-03-21 22:28:01', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 22:28:00');
INSERT INTO `torder` VALUES (1274, 158, '9a90a70f791f45fc9d62e7dbdfb67c2d', '2019-03-21 22:29:05', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 22:29:04');
INSERT INTO `torder` VALUES (1275, 158, '5859b8614bfb4bfaa1440222658565e3', '2019-03-21 22:31:37', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 22:31:37');
INSERT INTO `torder` VALUES (1276, 158, '021699869b6045f0bc5a480107b27c0d', '2019-03-21 23:05:43', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-21 23:05:42');
INSERT INTO `torder` VALUES (1278, 158, '0bbcd9d3ae954314b597fc40758495bd', NULL, NULL, NULL, 127, '广东省韶关市武江区广东;gdh;123', 0, '2019-03-22 10:12:51');
INSERT INTO `torder` VALUES (1279, 158, '00e9fbf5e65247969dca2770d6babc63', NULL, NULL, NULL, 127, '广东省韶关市武江区广东;gdh;123', 0, '2019-03-22 10:21:33');
INSERT INTO `torder` VALUES (1280, 158, '66b37b87d77445b1acf3144b2634b595', '2019-03-23 21:27:45', NULL, NULL, 127, '广东省韶关市武江区广东;gdh;123', 1, '2019-03-22 10:26:15');
INSERT INTO `torder` VALUES (1286, 316, '75ee3eb37595486a87b233653b7e7b20', '2019-03-27 14:20:04', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;13017727899', 1, '2019-03-27 14:20:03');
INSERT INTO `torder` VALUES (1298, 158, 'e4234bce57b44153a84a78d1b09e03bc', '2019-05-30 15:44:30', NULL, NULL, 124, '浙江省金华市义乌市答辩现场;美饰艺术;13758235351', 1, '2019-05-30 15:44:29');
INSERT INTO `torder` VALUES (1306, 158, '7b09ecf4137f40ea8c9a1a4cbbf5647b', NULL, NULL, NULL, 124, '浙江省金华市义乌市答辩现场;美饰艺术;13758235351', 0, '2019-05-31 11:39:09');
INSERT INTO `torder` VALUES (1307, 158, '60e2941cf18b4be6b15ee6d87b5fbc3d', '2019-05-31 11:39:51', NULL, NULL, 124, '浙江省金华市义乌市答辩现场;美饰艺术;13758235351', 1, '2019-05-31 11:39:50');
INSERT INTO `torder` VALUES (1308, 158, '9e322fdae3004d08a2f88cc5ae57a589', '2019-05-31 13:33:02', NULL, NULL, 124, '浙江省金华市义乌市答辩现场;美饰艺术;13758235351', 1, '2019-05-31 13:33:01');
INSERT INTO `torder` VALUES (1309, 158, 'd6a38cb7b2bc4690837e4ae5b716d195', '2019-05-31 17:12:29', NULL, NULL, 124, '浙江省金华市义乌市答辩现场;美饰艺术;13758235351', 1, '2019-05-31 17:12:28');
INSERT INTO `torder` VALUES (1310, 158, '0128ae26477a41979447c9cafbb45a0b', '2019-06-10 14:04:03', NULL, NULL, 122, '浙江省杭州市西湖区留和路;南唐;12345678910', 1, '2019-06-10 14:03:50');
INSERT INTO `torder` VALUES (1311, 316, '8a27f22984b24023806478e7819046f1', '2019-06-24 10:01:48', NULL, NULL, 122, '浙江省杭州市滨江区西湖;北宋;01987654321', 1, '2019-06-24 10:01:46');
INSERT INTO `torder` VALUES (1313, 316, '1866c8f0125a4482a278b3e3fc1ec265', '2019-09-19 08:09:21', NULL, NULL, 139, '浙江省杭州市滨江区留和路;好纠结;13567116463', 1, '2019-09-19 08:09:18');
INSERT INTO `torder` VALUES (1314, 158, 'd088444776cb48d78608715862bbf1f2', '2019-10-19 14:13:04', NULL, NULL, 139, '浙江省杭州市滨江区留和路;好纠结;13567116463', 1, '2019-10-19 14:13:03');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` datetime(0) NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` int(11) NULL DEFAULT NULL,
  `level` int(11) NULL DEFAULT NULL,
  `mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `token` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 141 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'https://s1.ax1x.com/2018/06/22/PpBNxP.jpg', '2006-09-26 00:00:00', 'juan88@gmail.com', 1, 5, '14550832705', '索颖', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '87bf457e-aaec-7155-2227-0b462809afd1', 'ocai');
INSERT INTO `user` VALUES (2, 'https://s1.ax1x.com/2018/06/22/Ppyv6I.jpg', '2008-04-09 00:00:00', 'wkong@hotmail.com', 0, 2, '15988352290', '索颖', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', 'b5162208-c9fe-6648-28e7-b9621314e1a1', 'juanliang');
INSERT INTO `user` VALUES (3, 'https://s1.ax1x.com/2018/06/22/Pp6Vcn.jpg', '2006-07-18 00:00:00', 'yan26@zou.com', 1, 5, '13444896839', '咎斌', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '91b9dad0-3b48-2e98-3b75-2180d89fbfce', 'zwen');
INSERT INTO `user` VALUES (4, 'https://s1.ax1x.com/2018/06/22/Ppypi4.jpg', '2004-12-21 00:00:00', 'rxia@yahoo.com', 1, 5, '13178743673', '汲杨', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '0f11e660-c821-7e06-eaa7-62aba42d2a67', 'uwang');
INSERT INTO `user` VALUES (5, 'https://s1.ax1x.com/2018/06/22/Pp6QNF.jpg', '2006-01-02 00:00:00', 'hwen@kang.cn', 0, 2, '15327863649', '养帅', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '6eaf9b91-d3b1-6933-18b7-c60d0d6bcb8d', 'xiulan09');
INSERT INTO `user` VALUES (6, 'https://s1.ax1x.com/2018/06/22/PpBJPA.jpg', '2004-06-02 00:00:00', 'jun78@gmail.com', 1, 2, '13680964694', '贺秀珍', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '475016f6-2aef-c84f-4921-94024a8efe33', 'panmin');
INSERT INTO `user` VALUES (7, 'https://s1.ax1x.com/2018/06/22/PpBWrT.jpg', '2004-07-18 00:00:00', 'acheng@chang.com', 0, 3, '15110551782', '尚秀芳', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', 'ca34497e-c02f-2f4d-8019-2ed01f0b82af', 'naxiao');
INSERT INTO `user` VALUES (8, 'https://s1.ax1x.com/2018/06/22/Ppyv6I.jpg', '2003-05-28 00:00:00', 'jun66@yahoo.com', 1, 3, '13656463928', '芮刚', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', 'c9e0e368-8d91-8bb0-2085-f55f987fea4e', 'mingli');
INSERT INTO `user` VALUES (9, 'https://s1.ax1x.com/2018/06/22/PpB85d.jpg', '2008-11-08 00:00:00', 'lei47@zou.cn', 1, 3, '15180685167', '慕艳', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', 'c5ce9067-58e5-67fc-feb9-a4a03b38d2cb', 'wei56');
INSERT INTO `user` VALUES (10, 'https://s1.ax1x.com/2018/06/22/PpBNxP.jpg', '2005-05-28 00:00:00', 'leigao@hotmail.com', 1, 4, '18224969274', '人俊', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '9e07f401-5d9f-4172-6ee6-b3fef5a98619', 'guiying28');
INSERT INTO `user` VALUES (11, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '2002-08-31 00:00:00', 'qiang61@gong.cn', 0, 3, '13363007981', '越龙', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '81b73cf0-9cfd-e3de-c15f-b8a6c69bbf55', 'fdeng');
INSERT INTO `user` VALUES (111, 'https://s1.ax1x.com/2018/06/22/PpBDaQ.jpg', '2005-10-03 00:00:00', 'jun55@mo.com', 1, 2, '15790980983', '西海燕', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '22ca98ff-a2b5-1613-6b1f-1af2703d2ddd', 'yonggao');
INSERT INTO `user` VALUES (112, 'https://s1.ax1x.com/2018/06/22/PprgBT.jpg', '2003-11-30 00:00:00', 'lei36@yahoo.com', 1, 1, '13014066676', '鄢畅', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '6e8739f2-57db-69e9-30fa-161d980d5edb', 'qiujun');
INSERT INTO `user` VALUES (113, 'https://s1.ax1x.com/2018/06/22/PpBWrT.jpg', '2003-03-22 00:00:00', 'chao50@han.com', 0, 5, '15537121335', '酆玉', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', 'b5b7da55-33b5-9565-d93c-7dbd8b425cb0', 'zqiao');
INSERT INTO `user` VALUES (114, 'https://s1.ax1x.com/2018/06/22/PpBNxP.jpg', '2000-07-15 00:00:00', 'yqin@hu.net', 0, 4, '15092700463', '羿慧', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '91c2c3d3-4dee-ce92-7ef9-42cc3564b1e6', 'yongwu');
INSERT INTO `user` VALUES (115, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '2005-07-10 00:00:00', 'xiulanye@gmail.com', 0, 3, '18783159523', '广勇', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', '7403042a-10b5-90da-7c4f-619792691e00', 'yong25');
INSERT INTO `user` VALUES (116, 'https://s1.ax1x.com/2018/06/22/PpBWrT.jpg', '2001-08-08 00:00:00', 'yanshao@yahoo.com', 1, 2, '13326707192', '贡丹', 'pbkdf2_sha256$20000$gcIJmE3uEhjo$N+KnrSXZByhF961PVuDtl3vPqehUrbb0FO4jaJqAtmw=', 'e51a2b6b-97cf-7628-1331-50cee40b9390', 'wenjuan');
INSERT INTO `user` VALUES (122, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '1997-12-17 11:05:21', 'Victor@gmail.com', 1, 0, '12345678910', '狄克推多', 'pbkdf2_sha256$20000$69Sx1tuZczOg$IJ2NoHp11sItrA7YwSYwY/KYki3c/Ovbd5c3XE2fIQo=', 'f6e18c49fc51463daf822dfe58230868', '12345678910');
INSERT INTO `user` VALUES (123, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '1998-02-12 23:40:46', 'vdnf@hdjd.djd', 1, 0, '12345678913', '我是骚吉皮', 'pbkdf2_sha256$20000$AyEzN7WtgRxS$cu0GCCj54xcJF6I/5xlP9FXcHnj6d5md/oScJTrpSMo=', '197822aa3e1e491f94dea5548e81f3ff', '12345678913');
INSERT INTO `user` VALUES (124, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '1998-05-06 16:56:14', NULL, 1, 0, '13968830312', '缪斯艺术', 'pbkdf2_sha256$20000$9Se2ewYXVvj9$FBGKFNOK4tvvx9nXIajDjuL7FFJsgc50yOncwY1Jvss=', 'f94f3b8d4d8741d99070bc27a46b45af', '13968830312');
INSERT INTO `user` VALUES (126, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '1970-01-01 08:00:00', NULL, 0, 0, '123', '功能键盘', 'pbkdf2_sha256$20000$2BbWL70Hqgq1$4IuUyVlzW+kqsr9DtjtSxp0zP/bq5waETq44KC+pAbs=', 'd0e698350e534294a7344b3483789468', '123');
INSERT INTO `user` VALUES (127, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '2019-03-06 08:00:00', 'gdh@qq.com', 0, 0, '1234', '啊啊啊啊', 'pbkdf2_sha256$20000$i9ekR3lpOW2C$ucImQ7r9bQt0FVRo/v7fIPfFxuCrOjutOeOQjbvkyfY=', '5f3d2a89996848d99d192e75158cbc87', '1234');
INSERT INTO `user` VALUES (128, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '1970-01-01 08:00:00', NULL, 1, 0, '54321', 'User_54321', 'pbkdf2_sha256$20000$kKfRZ98H2Zam$cYAOc98Z+ad375ADJNwFDs+5O2RB+rk0lZ2GEmRS20w=', '0275fe425eaf4e658ac42cebf582a114', '54321');
INSERT INTO `user` VALUES (129, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', '1998-02-02 19:31:25', NULL, 1, 0, '13757171056', '617大家长', 'pbkdf2_sha256$20000$Qu1H5SpY84GX$XE5MkZYY8mcV+IIQpzAdHDa0+EIv5bDbSDR/Gdv+Dpc=', 'dca73c4064f940c199c2a34ed39cb25f', '13757171056');
INSERT INTO `user` VALUES (130, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '13777851560', 'User_13777851560', 'pbkdf2_sha256$20000$cPucCjX4ny5f$suYAjELHvCU8jlJKUw1E4ZrXJnbSSLzSpFv3zw0YPU4=', '31e930b0465e4fb091b0abad0a7f3101', '13777851560');
INSERT INTO `user` VALUES (131, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '', 'User_', 'pbkdf2_sha256$20000$PxyZon3iqin0$UzuSPULkJAXFaoUHxsrN7NIxKax4mcFXQ50uH/1pZUI=', '6c965f10417d4deb987757b825487871', '');
INSERT INTO `user` VALUES (132, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '13968830311', 'User_13968830311', 'pbkdf2_sha256$20000$f7291I7482W2$7bCjsvpRB2QEM22ENd4sck99JxcqZaEG8FXolAi+6BA=', '965510445d0149999e0a416442884f86', '13968830311');
INSERT INTO `user` VALUES (133, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '13588891714', 'User_13588891714', 'pbkdf2_sha256$20000$mnalO9Hv1x3f$96/QEfZGuFlx+ZACH2nRufui6URZ9M8EgwxxULZX82I=', '46bc0570714d49b5a1cf674c69393bf3', '13588891714');
INSERT INTO `user` VALUES (134, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '13148473696', 'User_13148473696', 'pbkdf2_sha256$20000$GJ3Lg9Hu40vh$XiqqKYqQFkMg8KcOvjuRmU6K4CpGT1LLmaYeCsOWMIM=', '53be303337d94712934e714344981309', '13148473696');
INSERT INTO `user` VALUES (135, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '18634391143', 'User_18634391143', 'pbkdf2_sha256$20000$lBbvY48YCE25$/kpw1W4QRSKFip/p0glzTjRRbvF1/Dfa38VHf05qo7Q=', 'd53b28664de44004b538f40fdd56c92c', '18634391143');
INSERT INTO `user` VALUES (136, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '13588855161', 'User_13588855161', 'pbkdf2_sha256$20000$0xH067aEr4Ef$MsgC+btaRlUNM5E05xwBEuyjEDJiGVF+FEKyTbCSjow=', 'f4422790702e4e03af8bcc9369b185c5', '13588855161');
INSERT INTO `user` VALUES (137, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '13968830345', 'User_13968830345', 'pbkdf2_sha256$20000$4LtVP1gK4T91$yS1cXEft6ADXRG6e90EN1KYl1AFPqAeXGPAJlf66G8w=', '5601196a51f94f75bc4e381d8389c89f', '13968830345');
INSERT INTO `user` VALUES (138, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '15868091138', 'User_15868091138', 'pbkdf2_sha256$20000$imdhYfysCl8z$iw9dY9qIkaMuVhrYjuZljzLRXq7pz056azccol6VJWU=', '9922817647bd400aa49803c5226c7873', '15868091138');
INSERT INTO `user` VALUES (139, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '13567116463', 'User_13567116463', 'pbkdf2_sha256$20000$0QXi8O7219kU$uyyLRESt/d8be/x/C4tA7NIiICTXPRUyED8zGkjpMcg=', 'cd213258fc2743eb9db283d161b18980', '13567116463');
INSERT INTO `user` VALUES (140, 'https://s1.ax1x.com/2018/06/22/PpsPDf.jpg', NULL, NULL, NULL, 0, '15869156479', 'User_15869156479', 'pbkdf2_sha256$20000$APrnvf88590Z$kJ3j7cpFqZ2WHKk7epy2iqwkcxzvtF1AXAOk1ENSuJE=', 'c047114d97084f9d80db63fa696752a2', '15869156479');

-- ----------------------------
-- Table structure for user_fav_commodity
-- ----------------------------
DROP TABLE IF EXISTS `user_fav_commodity`;
CREATE TABLE `user_fav_commodity`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `commodity_id` int(11) NULL DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `UK_8fedm74r4jrj6bmr8ocn9sexu`(`user_id`, `commodity_id`) USING BTREE,
  INDEX `FK_gh580gp9t0nh9n7g0qf0qeq2p`(`commodity_id`) USING BTREE,
  CONSTRAINT `FK_bmihdhgiu08shs233l2xyci28` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_gh580gp9t0nh9n7g0qf0qeq2p` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 64 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_fav_commodity
-- ----------------------------
INSERT INTO `user_fav_commodity` VALUES (54, '2019-06-10 11:36:22', 180, 158, 124);
INSERT INTO `user_fav_commodity` VALUES (55, '2019-06-10 11:36:50', 118, 158, 122);
INSERT INTO `user_fav_commodity` VALUES (56, '2019-06-10 11:36:57', 114, 158, 122);
INSERT INTO `user_fav_commodity` VALUES (57, '2019-06-24 09:40:40', 113, 158, 122);
INSERT INTO `user_fav_commodity` VALUES (58, '2019-06-24 10:01:27', 111, 158, 122);
INSERT INTO `user_fav_commodity` VALUES (60, '2019-08-05 20:20:26', 114, 158, 139);
INSERT INTO `user_fav_commodity` VALUES (63, '2019-09-19 08:48:58', 112, 158, 139);

-- ----------------------------
-- Table structure for user_fav_filter
-- ----------------------------
DROP TABLE IF EXISTS `user_fav_filter`;
CREATE TABLE `user_fav_filter`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `filter_id` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_7ahbqc9rlifpj5iqp4t1sgygh`(`filter_id`) USING BTREE,
  INDEX `FK_q9xp7p8mu2ohejdxri1oqccq2`(`user_id`) USING BTREE,
  CONSTRAINT `FK_7ahbqc9rlifpj5iqp4t1sgygh` FOREIGN KEY (`filter_id`) REFERENCES `filter` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_q9xp7p8mu2ohejdxri1oqccq2` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_filter_history
-- ----------------------------
DROP TABLE IF EXISTS `user_filter_history`;
CREATE TABLE `user_filter_history`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `filter_id` int(11) NULL DEFAULT NULL,
  `operate_time` datetime(0) NULL DEFAULT NULL,
  `output_size` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_j91eeguaj1w1jkclwidke51mk`(`filter_id`) USING BTREE,
  INDEX `FK_t34t8vj6lbrlaxl4oqai1gf67`(`user_id`) USING BTREE,
  CONSTRAINT `FK_j91eeguaj1w1jkclwidke51mk` FOREIGN KEY (`filter_id`) REFERENCES `filter` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_t34t8vj6lbrlaxl4oqai1gf67` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for verify_code
-- ----------------------------
DROP TABLE IF EXISTS `verify_code`;
CREATE TABLE `verify_code`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
