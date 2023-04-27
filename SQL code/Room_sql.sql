USE test_raumplan

-- 2 OG.
INSERT INTO `room` (`id`, `nummer`) VALUES ('38', '2.01');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('1', '118', '38');
INSERT INTO `room` (`id`, `nummer`) VALUES ('39', '2.02');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('2', '10', '39');
INSERT INTO `room` (`id`, `nummer`) VALUES ('40', '2.03');-- Besprechungsraum
INSERT INTO `room` (`id`, `nummer`) VALUES ('41', '2.04');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('3', '20', '41');
INSERT INTO `room` (`id`, `nummer`) VALUES ('42', '2.05');--Klo

-- 1 OG.
INSERT INTO `room` (`id`, `nummer`) VALUES ('0', '1.00');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('15', '185', '0');
INSERT INTO `room` (`id`, `nummer`) VALUES ('1', '1.01');-- Besprechungsraum
INSERT INTO `room` (`id`, `nummer`) VALUES ('2', '1.02');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('16', '130', '2');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('17', '184', '2');
INSERT INTO `room` (`id`, `nummer`) VALUES ('3', '1.03');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('18', '127', '3');
INSERT INTO `room` (`id`, `nummer`) VALUES ('4', '1.04');-- idk
INSERT INTO `room` (`id`, `nummer`) VALUES ('5', '1.05');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('19', '37', '5');
INSERT INTO `room` (`id`, `nummer`) VALUES ('6', '1.06');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('20', '174', '6');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('21', '195', '6');
INSERT INTO `room` (`id`, `nummer`) VALUES ('7', '1.07');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('22', '42', '7');
INSERT INTO `room` (`id`, `nummer`) VALUES ('8', '1.08');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('23', '181', '8');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('24', '186', '8');
INSERT INTO `room` (`id`, `nummer`) VALUES ('9', '1.09');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('25', '112', '9');
INSERT INTO `room` (`id`, `nummer`) VALUES ('10', '1.10');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('26', '35', '10');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('27', '44', '10');

INSERT INTO `room` (`id`, `nummer`) VALUES ('11', '1.11');-- IDK
INSERT INTO `room` (`id`, `nummer`) VALUES ('12', '1.12');-- IDK
INSERT INTO `room` (`id`, `nummer`) VALUES ('13', '1.13');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('28', '77', '13');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('29', '76', '13');
INSERT INTO `room` (`id`, `nummer`) VALUES ('14', '1.14');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('30', '16', '14');
INSERT INTO `room` (`id`, `nummer`) VALUES ('15', '1.15');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('31', '39', '15');
INSERT INTO `room` (`id`, `nummer`) VALUES ('16', '1.16');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('32', '140', '16');
INSERT INTO `room` (`id`, `nummer`) VALUES ('17', '1.17');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('33', '17', '17');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('34', '189', '17');
INSERT INTO `room` (`id`, `nummer`) VALUES ('18', '1.18');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('35', '141', '18');
INSERT INTO `room` (`id`, `nummer`) VALUES ('19', '1.19');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('36', '138', '19');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('37', '188', '19');
INSERT INTO `room` (`id`, `nummer`) VALUES ('20', '1.20');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('38', '136', '20');

INSERT INTO `room` (`id`, `nummer`) VALUES ('21', '1.21');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('39', '25', '21');
INSERT INTO `room` (`id`, `nummer`) VALUES ('22', '1.22');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('40', '45', '22');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('41', '69', '22');
INSERT INTO `room` (`id`, `nummer`) VALUES ('23', '1.23');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('42', '73', '23');
INSERT INTO `room` (`id`, `nummer`) VALUES ('24', '1.24');-- IDK
INSERT INTO `room` (`id`, `nummer`) VALUES ('25', '1.25');-- IDK
INSERT INTO `room` (`id`, `nummer`) VALUES ('26', '1.26');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('43', '14', '26');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('44', '57', '26');
INSERT INTO `room` (`id`, `nummer`) VALUES ('27', '1.27');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('45', '172', '27');
INSERT INTO `room` (`id`, `nummer`) VALUES ('28', '1.28');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('46', '103', '28');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('47', '155', '28');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('48', '165', '28');
INSERT INTO `room` (`id`, `nummer`) VALUES ('29', '1.29');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('49', '152', '29');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('50', '197', '29');
INSERT INTO `room` (`id`, `nummer`) VALUES ('30', '1.30');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('51', '36', '30');

INSERT INTO `room` (`id`, `nummer`) VALUES ('31', '1.31');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('52', '153', '31');
INSERT INTO `room` (`id`, `nummer`) VALUES ('32', '1.32');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('53', '59', '32');
INSERT INTO `room` (`id`, `nummer`) VALUES ('33', '1.33');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('54', '169', '33');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('55', '176', '33');
INSERT INTO `room` (`id`, `nummer`) VALUES ('34', '1.34');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('56', '46', '34');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('57', '134', '34');
INSERT INTO `room` (`id`, `nummer`) VALUES ('35', '1.35');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('58', '102', '35');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('59', '47', '35');
INSERT INTO `room` (`id`, `nummer`) VALUES ('36', '1.36');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('60', '11', '36');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('61', '171', '36');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('62', '142', '36');
INSERT INTO `room` (`id`, `nummer`) VALUES ('37', '1.37');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('63', '148', '37');

-- EG
INSERT INTO `room` (`id`, `nummer`) VALUES ('43', '0.01');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('4', '26', '43');
INSERT INTO `room` (`id`, `nummer`) VALUES ('44', '0.02');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('5', '191', '44');
INSERT INTO `room` (`id`, `nummer`) VALUES ('45', '0.03');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('6', '190', '45');
INSERT INTO `room` (`id`, `nummer`) VALUES ('46', '0.04');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('7', '108', '46');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('8', '132', '46');
INSERT INTO `room` (`id`, `nummer`) VALUES ('47', '0.05');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('9', '196', '47');
INSERT INTO `room` (`id`, `nummer`) VALUES ('48', '0.06');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('10', '187', '48');
INSERT INTO `room` (`id`, `nummer`) VALUES ('49', '0.07');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('11', '151', '49');
INSERT INTO `room` (`id`, `nummer`) VALUES ('50', '0.08');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('12', '18', '50');
INSERT INTO `room` (`id`, `nummer`) VALUES ('51', '0.09');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('13', '48', '51');
INSERT INTO `zuweisung` (`id`, `person_id`, `room_id`) VALUES ('14', '93', '51');