-- 在db0数据库上分别创建t_order_0、t_order_1表
USE db0;
DROP TABLE IF EXISTS t_order_0; 
CREATE TABLE t_order_0 ( 
order_id bigint NOT NULL, 
user_id bigint NOT NULL, 
PRIMARY KEY (order_id) 
) ; 

DROP TABLE IF EXISTS t_order_1; 
CREATE TABLE t_order_1 ( 
order_id bigint NOT NULL, 
user_id bigint NOT NULL, 
PRIMARY KEY (order_id) 
) ;

-- 在db1数据库上分别创建t_order_0、t_order_1表
USE db1;
DROP TABLE IF EXISTS t_order_0; 
CREATE TABLE t_order_0 ( 
order_id bigint NOT NULL, 
user_id bigint NOT NULL, 
PRIMARY KEY (order_id) 
) ; 

DROP TABLE IF EXISTS t_order_1; 
CREATE TABLE t_order_1 ( 
order_id bigint NOT NULL, 
user_id bigint NOT NULL, 
PRIMARY KEY (order_id) 
) ;