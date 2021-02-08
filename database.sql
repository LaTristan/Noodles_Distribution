create database Noodle

CREATE TABLE user_info{
    UseID int primary key,--用户id
    Fortune float,--余额
    History varchar(400),--历史记录（推荐记录编号）
}

CREATE TABLE product_info{--产品信息
    PID int primary key,--产品编号
    Introduction varchar(100),--产品介绍（种类）
}