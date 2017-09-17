create database rest_api;
use rest_api;
create table extra_items (add_on_item_id bigint not null auto_increment, name varchar(255), num_of_items integer, price double precision, quantity varchar(255), primary key (add_on_item_id));
create table order_item (order_item_id bigint not null auto_increment, add_on_item_id bigint, item_quantity integer, name varchar(255), price double precision, quantity varchar(255), primary key (order_item_id));
create table orders (id bigint not null auto_increment, is_discount_avaible bit, order_item_id bigint, tax double precision, total_amount double precision, total_items integer, user_id bigint, primary key (id));
create table user (user_id bigint not null auto_increment, auth_token varchar(255), created_date date, birth date, email varchar(255), name varchar(255), password varchar(255), sex char(1), updated_date date, primary key (user_id));