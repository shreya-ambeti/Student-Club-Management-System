create database clubmanagementsystem;
use clubmanagementsystem;
create table login(username varchar(20), password varchar(20));
insert into login values('admin', '12345');
create table studentclub(name varchar(20), joining varchar(20), dob varchar(30), year varchar(20), address varchar(100), phone varchar(20), email varchar(40), branch varchar(20), clubrole varchar(30), aadhar char(12), stId varchar(15));

select * from studentclub;