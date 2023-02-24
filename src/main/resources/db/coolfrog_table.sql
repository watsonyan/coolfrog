use coolfrog;
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户昵称',
  `password` varchar(32) NOT NULL COMMENT '加密后的密码',
  `gender` tinyint NOT NULL DEFAULT '0',
  `mobile` varchar(15) NOT NULL DEFAULT '' COMMENT '手机号码',
  `coin` int(11) NOT NULL DEFAULT '0',
  `avatar` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '用户头像',
  `province` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '',
  `status` INT(2) NOT NULL DEFAULT 1 COMMENT '状态，0：禁用，1：启用',
  `openid` varchar(32) NOT NULL COMMENT 'openid',
  `session_key` varchar(32) NOT NULL default '' COMMENT 'session key',
  `last_login_time` datetime NOT NULL DEFAULT NOW() COMMENT '上次登录时间',
  `create_time` datetime NOT NULL DEFAULT NOW() COMMENT '创建时间',
  `last_update_time` datetime NOT NULL DEFAULT NOW() COMMENT '上次更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

# DROP TABLE IF EXISTS `tbl_oauth`;
# CREATE TABLE `tbl_oauth` (
#     `id` bigint(20) NOT NULL,
#     `uid` bigint(20) NOT NULL COMMENT '用户id',
#     `openid` varchar(32) NOT NULL COMMENT 'openid',
#     PRIMARY KEY (`id`)
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户登录授权表'

DROP TABLE IF EXISTS `tbl_book`;
CREATE TABLE `tbl_book` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `level` tinyint NOT NULL DEFAULT 1 COMMENT '级别',
    `name` varchar(32) NOT NULL COMMENT '书名',
    `cover` varchar(256) NOT NULL COMMENT '封面图片',
    `status` INT(2) NOT NULL DEFAULT 1 COMMENT '状态，0：禁用，1：启用',
    `create_time` datetime NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `last_update_time` datetime NOT NULL DEFAULT NOW() COMMENT '上次更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='书本表';

DROP TABLE IF EXISTS `tbl_lesson`;
CREATE TABLE `tbl_lesson` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `book_id` bigint(20) NOT NULL DEFAULT 1 COMMENT '书本id',
    `title` varchar(32) NOT NULL COMMENT '标题',
    `word_ids` varchar(256) NOT NULL DEFAULT '[]' COMMENT '课文主要单词ids',
    `sentence_ids` varchar(256) NOT NULL DEFAULT '[]' COMMENT '课文句子ids',
    `status` INT(2) NOT NULL DEFAULT 1 COMMENT '状态，0：禁用，1：启用',
    `create_time` datetime NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `last_update_time` datetime NOT NULL DEFAULT NOW() COMMENT '上次更新时间',
    PRIMARY KEY (`id`), FOREIGN KEY (`book_id`) REFERENCES tbl_book(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课文表';

DROP TABLE IF EXISTS `tbl_sentence`;
CREATE TABLE `tbl_sentence` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `lesson_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '所属课文id',
    `content` varchar(32) NOT NULL COMMENT '文本内容',
    `image` varchar(256) NOT NULL COMMENT '图片',
    `audio` varchar(256) NOT NULL COMMENT '音频',
    `is_word` tinyint NOT NULL DEFAULT 0 COMMENT '是否为单词',
    `status` tinyint NOT NULL DEFAULT 1 COMMENT '状态，0：禁用，1：启用',
    `create_time` datetime NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `last_update_time` datetime NOT NULL DEFAULT NOW() COMMENT '上次更新时间',
    PRIMARY KEY (`id`), FOREIGN KEY (`lesson_id`) REFERENCES tbl_lesson(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课文单词、句子表';

