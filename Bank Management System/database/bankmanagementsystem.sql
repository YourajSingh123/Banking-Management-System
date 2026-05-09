create database bankmanagementsystem2;
show databases;
use bankmanagementsystem2;


create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), Email varchar(30), marital_status varchar(20), address varchar(40), city varchar(25), pincode varchar(20), state varchar(25)); 
select * from signup;

create table signup22(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(30), pan varchar(20), aadhar varchar(40), scitizen varchar(25), eaccount varchar(20)); 
select * from signup22;

create table signup3(formno varchar(20), accountType varchar(40), cardNumber varchar(25), pin varchar(10), facility varchar(100));
select * from signup3;

create table login(formno varchar(20), cardNumber varchar(25), pin varchar(10));
select * from login;

create table bank(pin varchar(20), date varchar(50), type varchar(20), amount varchar(20));
select * from bank;
