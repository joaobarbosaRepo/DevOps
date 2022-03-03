create database agenda;

create table contatos(
id int auto_increment key,
nome varchar(30) NOT NULL,
numero varchar(12) UNIQUE,
email varchar(30))
