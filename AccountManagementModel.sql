CREATE TABLE `user` (
`id` int(8) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户ID',
`c_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '该条数据创建时间',
`del_flag` int UNSIGNED NOT NULL DEFAULT 1 COMMENT '删除标识',
`dis_flag` int UNSIGNED NOT NULL DEFAULT 1 COMMENT '禁用标识',
`name` varchar(25) CHARACTER SET utf8 NOT NULL COMMENT '用户昵称',
`email` varchar(25) CHARACTER SET utf8 NOT NULL COMMENT '用户账户绑定邮箱',
`psw` varchar(25) CHARACTER SET utf8 NOT NULL COMMENT '用户账户密码',
PRIMARY KEY (`id`) 
);
CREATE TABLE `account` (
`id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '账号数据ID',
`c_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '该条数据创建时间',
`del_flag` int UNSIGNED NOT NULL DEFAULT 1,
`dis_flag` int UNSIGNED NOT NULL DEFAULT 1,
`a_id` int UNSIGNED NULL COMMENT '账号ID',
`nickname` varchar(0) CHARACTER SET utf8 NULL COMMENT '账号昵称',
`email` varchar(0) CHARACTER SET utf8 NULL COMMENT '账号邮箱',
`tel` int UNSIGNED NULL COMMENT '手机号',
`psw` varchar(0) CHARACTER SET utf8 NULL COMMENT '账号密码',
`discription` varchar(0) CHARACTER SET utf8 NULL COMMENT '账号描述',
PRIMARY KEY (`id`) 
);
