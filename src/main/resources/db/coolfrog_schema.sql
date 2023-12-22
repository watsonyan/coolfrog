drop database if exists coolfrog;
drop user if exists 'coolfrog'@'%';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database coolfrog default character set utf8mb4 collate utf8mb4_unicode_ci;
use coolfrog;
create user 'coolfrog'@'%' identified by 'coolfrog';
grant all privileges on coolfrog.* to 'coolfrog'@'%';
flush privileges;
