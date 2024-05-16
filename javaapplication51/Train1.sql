 create database Train1;
 create  table Train (trainID int PRIMARY KEY auto_increment,trainName varchar(30),    capacity int , trainClass varchar(30));
 CREATE table Route (routeID int PRIMARY KEY,stationName varchar(30));
 CREATE table TrainRoute (trainID int,routeID int,FOREIGN KEY (trainID) REFERENCES Train(trainID),FOREIGN KEY (routeID) REFERENCES Route(routeID),PRIMARY KEY (trainID, routeID));
 alter table Train add column ( trainClass varchar(30));

INSERT INTO Train (trainID, trainName, capacity, trainClass) VALUES
(1234567, 'Thunder Express', 180, 'Economy'),
(2345678, 'Swift Voyager', 150, 'Standard'),
(3456789, 'Lightning Bullet', 200, 'Economy'),
(4567890, 'Rapid Transit', 170, 'First class'),
(5678901, 'Speedy Shuttle', 160, 'Standard');

INSERT INTO Train (trainID, trainName, capacity, trainClass) VALUES
(6789012, 'Turbo Commuter', 190, 'Economy'),
(7890123, 'Metro Sprinter', 175, 'Standard'),
(8901234, 'Express Runner', 155, 'Standard'),
(9012345, 'Fast Track', 165,'Standard'),
(1122334, 'Zooming Express', 185,'First class');

INSERT INTO Train (trainID, trainName, capacity, trainClass) VALUES
(2233445, 'Velocity Voyager', 195, 'Standard'),              
(3344556, 'Agile Transit', 145, 'First class'),                                
(4455667, 'Bullet Train', 210, 'Economy'),
(5566778, 'Rocket Express', 220, 'Economy'),
(6677889, 'Hyper Speed', 230, 'Economy');

INSERT INTO Train (trainID, trainName, capacity, trainClass) VALUES
(7788990, 'Jet Stream', 240, 'Economy'),
(8899001, 'Warp Rider', 250, 'Economy'),
(9900112, 'Sonic Express', 260, 'Economy'),
(1001123, 'Super Sonic', 270, 'Economy'),
(1112234, 'Flash Transit', 280, 'Economy');

INSERT INTO Train (trainID, trainName, capacity, trainClass) VALUES
(1223345, 'Rapid Rocket', 290, 'Economy'),
(2334456, 'Meteor Express', 300, 'Economy'),
(3445567, 'Lightning Sprinter', 310, 'Economy'),
(4556678, 'High Speed Bullet', 320, 'Economy'),
(5667789, 'Turbocharged', 330, 'Economy');

INSERT INTO Train (trainID, trainName, capacity, trainClass) VALUES
(6778890, 'Thunderbolt Rider', 340, 'Standard'),
(7889001, 'Velocity Jet', 350, 'Standard'),
(8990112, 'Swift Runner', 360, 'Standard'),(9901223, 'Lightning Jet', 370, 'Standard'),(1192334, 'Meteoric Express', 380, 'Standard');
select * from Train ;

INSERT INTO Route (routeID, stationName) VALUES
(1, 'Station A'),
(2, 'Station B'),
(3, 'Station C'),
(4, 'Station D'),
(5, 'Station E'),
(6, 'Station F'),
(7, 'Station G'),
(8, 'Station H'),
(9, 'Station I'),
(10, 'Station J');

select * from route;

INSERT INTO TrainRoute (trainID, routeID) VALUES
(1234567, 1),
(2345678, 2),
(3456789, 3),
(4567890, 4),
(5678901, 5),
(6789012, 6),
(7890123, 7),
(8901234, 8),
(9012345, 9),
(1122334, 10);

select * from trainroute ;

CREATE TABLE station (
  station_id INT PRIMARY KEY,
  name VARCHAR(20)
);

INSERT INTO station VALUES(1234567, 'Baker Street');
INSERT INTO station VALUES(2345678, 'Waterloo');
INSERT INTO station VALUES(3456789, 'Kings Cross');
INSERT INTO station VALUES(4567890, 'Liverpool St');
INSERT INTO station VALUES(5678901, 'Oxford Circus');
INSERT INTO station VALUES(6789012, 'Victoria');
INSERT INTO station VALUES(7890123, 'Paddington');
INSERT INTO station VALUES(8901234, 'Piccadilly');
INSERT INTO station VALUES(9012345, 'Bank');
INSERT INTO station VALUES(0123456, 'Holborn');
INSERT INTO station VALUES(9876543, 'Camden Town');
INSERT INTO station VALUES(8765432, 'Green Park');
INSERT INTO station VALUES(7654321, 'Euston');

SELECT * FROM station;

create table Passenger1 ( passenger_name varchar(200)  not null,passengerId varchar(7) primary key  not null,passenger_email varchar(200) not null );
insert into passenger1 (passengerId,passenger_name,passenger_email)values( "PSG1234" ,"John Smith","john.smith@gmail.com"),
("PSG9876","Jane Doe","jane.doe@gmail.com"),
("PSG5432","David Lee","david.lee@gmail.com"),
("PSG7890","Mary Jones","mary.jones@gmail.com"),
("PSG2587","Michael Brown","michael.brown@gmail.com"),
("PSG3698","Sarah Garcia","sarah.garcia@gmail.com"),
("PSG1029","William Miller","william.miller@gmail.com"),
("PSG8765","Jennifer Davis","jennifer.davis@gmail.com"),
("PSG4356","Daniel Hernandez","daniel.hernandez@gmail.com"),
("PSG6901","Ashley Gonzalez","ashley.gonzalez@gmail.com"),
("PSG1111","Ahmed noureldin","ibn abshwat@gmail.com");
select * from passenger1;

CREATE TABLE users(
    
    firstn VARCHAR(50),
    lastn VARCHAR(50),
    mail VARCHAR(100) primary key,
    pass VARCHAR(100),
    gender varchar(30)
);
select * from users;

alter table users add column (gender varchar(30));
select * from users;

ALTER TABLE users ADD COLUMN kl VARCHAR(50);

select* from users;

insert into users(firstn,lastn,mail,pass,gender)values("?","?","?","?","?");

alter table users add column (gedr varchar(30));
 

INSERT INTO users (firstn, lastn,mail,pass) VALUES (4, 1,4,7);
delete from users ;

ALTER TABLE users DROP COLUMN nt;

CREATE TABLE TrainStation (
    trainID INT,
    station_id INT,
    PRIMARY KEY (trainID, station_id),
    FOREIGN KEY (trainID) REFERENCES Train(trainID),
    FOREIGN KEY (station_id) REFERENCES Station(station_id)
);


select*from trainstation;


SELECT TrainStation.trainID, Train.trainName, Train.capacity, Train.trainClass, TrainStation.station_id, Station.name AS stationName
FROM TrainStation
JOIN Train ON TrainStation.trainID = Train.trainID
JOIN Station ON TrainStation.station_id = Station.station_id;

SELECT TrainStation.trainID, Train.trainName, Train.capacity, Train.trainClass, TrainStation.station_id, Station.name AS stationName
INTO NewTable
FROM TrainStation
JOIN Train ON TrainStation.trainID = Train.trainID
JOIN Station ON TrainStation.station_id = Station.station_id;

CREATE TABLE NewTable AS
SELECT TrainStation.trainID, Train.trainName, Train.capacity, Train.trainClass, TrainStation.station_id, Station.name AS stationName
FROM TrainStation
JOIN Train ON TrainStation.trainID = Train.trainID
JOIN Station ON TrainStation.station_id = Station.station_id;

select* from users;


CREATE TABLE switch AS
SELECT TrainStation.trainID, Train.trainName, Train.capacity, Train.trainClass, TrainStation.station_id, Station.name AS stationName
FROM TrainStation
JOIN Train ON TrainStation.trainID = Train.trainID
JOIN Station ON TrainStation.station_id = Station.station_id;



create table ticket(
Ticketid INT PRIMARY KEY auto_increment,
  SeatNumber int 
);
insert into ticket(Ticketid,SeatNumber) values
(11,01), (12,02),(13,03),(14,04),(15,05),(16,06),(17,07),(18,08),
(19,09), (21,10),(22,11),(23,12),(24,13),(25,14),(26,15),(27,16),
(28,17), (29,18),(31,19),(32,20),(33,21),(34,22),(35,23),(36,24),
(37,25), (38,26),(39,27),(41,28),(42,29),(43,30),(44,31),(45,32),
(46,33), (47,34),(48,35),(49,36),(51,27),(52,28),(53,29),(54,30),
(55,31), (56,32),(57,33),(58,34),(59,35),(61,36),(62,37),(63,38),
(64,39), (65,40),(66,41),(67,42),(68,43),(69,44),(71,45),(72,46),
(73,47), (74,48),(75,49),(76,50);

alter table station add column (fromstation varchar(50));
alter table station add column (tostation varchar(50));

create table stationinfo (trainid int primary key , trainname varchar(50),fromstation varchar(50),tostation varchar(50),departetime time, arrivaltime time,trainclass varchar(30));
select * from users;

SELECT * FROM stationinfo;

select *from station ;


create table passenger(firstn varchar(50) not null,lastn varchar(50) not null,pass int ,gender varchar(10)    ,passid int primary key auto_increment, mail varchar(1000));


create table passenger(passid int primary key auto_increment, firstn varchar(50) not null,lastn varchar(50) not null,  mail varchar(1000),pass int ,gender varchar(10)  );



create table passenger(  mail varchar(100) primary key  ,  firstn varchar(50) not null,lastn varchar(50) not null,pass int ,gender varchar(10)  );
drop table passenger;
select * from passenger  ; 

UPDATE stationinfo
SET arrivaltime = '06:30:00', departetime = '07:00:00'
WHERE trainid = 1122334;

UPDATE stationinfo
SET arrivaltime = '06:45:00', departetime = '07:15:00'
WHERE trainid = 1234567;

UPDATE stationinfo
SET arrivaltime = '07:00:00', departetime = '07:30:00'
WHERE trainid = 2345678;

UPDATE stationinfo
SET arrivaltime = '07:15:00', departetime = '07:45:00'
WHERE trainid = 3456789;

UPDATE stationinfo
SET arrivaltime = '07:30:00', departetime = '08:00:00'
WHERE trainid = 4567890;

UPDATE stationinfo
SET arrivaltime = '07:45:00', departetime = '08:15:00'
WHERE trainid = 5566778;

UPDATE stationinfo
SET arrivaltime = '08:00:00', departetime = '08:30:00'
WHERE trainid = 5678901;

UPDATE stationinfo
SET arrivaltime = '08:15:00', departetime = '08:45:00'
WHERE trainid = 6789012;

UPDATE stationinfo
SET arrivaltime = '08:30:00', departetime = '09:00:00'
WHERE trainid = 7890123;

UPDATE stationinfo
SET arrivaltime = '08:45:00', departetime = '09:15:00'
WHERE trainid = 8901234;

UPDATE stationinfo
SET arrivaltime = '09:00:00', departetime = '09:30:00'
WHERE trainid = 8990112;

UPDATE stationinfo
SET arrivaltime = '09:15:00', departetime = '09:45:00'
WHERE trainid = 9012345;




UPDATE stationinfo
SET arrivaltime = '06:30:00', departetime = '07:00:00'
WHERE trainid = 1122334;

UPDATE stationinfo
SET arrivaltime = '06:45:00', departetime = '07:15:00'
WHERE trainid = 1234567;

UPDATE stationinfo
SET arrivaltime = '07:00:00', departetime = '07:30:00'
WHERE trainid = 2345678;

UPDATE stationinfo
SET arrivaltime = '07:15:00', departetime = '07:45:00'
WHERE trainid = 3456789;

UPDATE stationinfo
SET arrivaltime = '07:30:00', departetime = '08:00:00'
WHERE trainid = 4567890;

UPDATE stationinfo
SET arrivaltime = '07:45:00', departetime = '08:15:00'
WHERE trainid = 5566778;

UPDATE stationinfo
SET arrivaltime = '08:00:00', departetime = '08:30:00'
WHERE trainid = 5678901;

UPDATE stationinfo
SET arrivaltime = '08:15:00', departetime = '08:45:00'
WHERE trainid = 6789012;

UPDATE stationinfo
SET arrivaltime = '08:30:00', departetime = '09:00:00'
WHERE trainid = 7890123;

UPDATE stationinfo
SET arrivaltime = '08:45:00', departetime = '09:15:00'
WHERE trainid = 8901234;

UPDATE stationinfo
SET arrivaltime = '09:00:00', departetime = '09:30:00'
WHERE trainid = 8990112;

UPDATE stationinfo
SET arrivaltime = '09:15:00', departetime = '09:45:00'
WHERE trainid = 9012345;

select *from stationinfo;

UPDATE stationinfo
SET departetime = '06:30:00', arrivaltime = '07:00:00'
WHERE trainid = 1122334;

UPDATE stationinfo
SET departetime = '06:45:00', arrivaltime = '07:15:00'
WHERE trainid = 1234567;

UPDATE stationinfo
SET departetime = '07:00:00', arrivaltime = '07:30:00'
WHERE trainid = 2345678;

UPDATE stationinfo
SET departetime = '07:15:00', arrivaltime = '07:45:00'
WHERE trainid = 3456789;

UPDATE stationinfo
SET departetime = '07:30:00', arrivaltime = '08:00:00'
WHERE trainid = 4567890;

UPDATE stationinfo
SET departetime = '07:45:00', arrivaltime = '08:15:00'
WHERE trainid = 5566778;

UPDATE stationinfo
SET departetime = '08:00:00', arrivaltime = '08:30:00'
WHERE trainid = 5678901;

UPDATE stationinfo
SET departetime = '08:15:00', arrivaltime = '08:45:00'
WHERE trainid = 6789012;

UPDATE stationinfo
SET departetime = '08:30:00', arrivaltime = '09:00:00'
WHERE trainid = 7890123;

UPDATE stationinfo
SET departetime = '08:45:00', arrivaltime = '09:15:00'
WHERE trainid = 8901234;

UPDATE stationinfo
SET departetime = '09:00:00', arrivaltime = '09:30:00'
WHERE trainid = 8990112;

UPDATE stationinfo
SET departetime = '09:15:00', arrivaltime = '09:45:00'
WHERE trainid = 9012345;


ALTER TABLE stationinfo
CHANGE COLUMN departetime arrivaltime TIME;

ALTER TABLE stationinfo
CHANGE COLUMN arrivaltime departetime TIME;

select * from station ;

select* from stationinfo;
 delete from station where name = name;


CREATE TABLE Journey (
    journeyid INT AUTO_INCREMENT PRIMARY KEY,
    trainid INT,
    trainname VARCHAR(255),
    fromstation VARCHAR(255),
    tostation VARCHAR(255),
    trainclass VARCHAR(255),
    departtime TIME,
    arrivaltime TIME,
    distance DECIMAL(10, 2)
);

select * from journey;
INSERT INTO Journey (trainid, trainname, fromstation, tostation, trainclass, departtime, arrivaltime, distance)
VALUES
    (1001, 'Stratford Express', 'Stratford', 'Baker Street', 'First Class', '06:00:00', '06:30:00',  10.00),
    (1002, 'Baker Street Express', 'Baker Street', 'Euston', 'Standard', '06:45:00', '07:15:00',  12.14),
    (1003, 'Euston Express', 'Euston', 'Canary Wharf', 'Economy', '07:00:00', '07:30:00',7.00),
    (1004, 'Canary Wharf Express', 'Canary Wharf', 'Green Park', 'First Class', '07:45:00', '08:15:00', 5.25),
    (1005, 'Green Park Express', 'Green Park', 'Bank', 'Standard', '08:00:00', '08:30:00', 9.00),
    (1006, 'Bank Express', 'Bank', 'Whitechapel', 'Economy', '08:45:00', '09:15:00', 8.50),
    (1007, 'Whitechapel Express', 'Whitechapel', 'Camden Town', 'First Class', '09:00:00', '09:30:00', 15.78),
    (1008, 'Camden Town Express', 'Camden Town', 'St Pancras', 'Standard', '09:45:00', '10:15:00', 6.28),
    (1009, 'St Pancras Express', 'St Pancras', 'Holborn', 'Economy', '10:00:00', '10:30:00', 7.15),
    (1010, 'Holborn Express', 'Holborn', 'King''s Cross', 'First Class', '10:45:00', '11:15:00', 13.25),
    (1011, 'King''s Cross Express', 'King''s Cross', 'Waterloo', 'Standard', '11:00:00', '11:30:00',  10.42),
    (1012, 'Waterloo Express', 'Waterloo', 'Piccadilly', 'Economy', '11:45:00', '12:15:00', 14.00),
    (1013, 'Piccadilly Express', 'Piccadilly', 'Clapham Junction', 'First Class', '12:00:00', '12:30:00',15.34),
    (1014, 'Clapham Junction Express', 'Clapham Junction', 'Wimbledon', 'Standard', '12:45:00', '13:15:00',  10.26),
    (1015, 'Wimbledon Express', 'Wimbledon', 'Richmond', 'Economy', '13:00:00', '13:30:00', 9.02),
    (1016, 'Richmond Express', 'Richmond', 'Victoria', 'First Class', '13:45:00', '14:15:00',  10.12),
    (1017, 'Victoria Express', 'Victoria', 'Oxford Circus', 'Standard', '14:00:00', '14:30:00',  12.15),
    (1018, 'Oxford Circus Express', 'Oxford Circus', 'Brixton', 'Economy', '14:45:00', '15:15:00',11.14),
    (1019, 'Brixton Express', 'Brixton', 'Hammersmith', 'First Class', '15:00:00', '15:30:00', 13.47),
    (1020, 'Hammersmith Express', 'Hammersmith', 'Paddington', 'Standard', '15:45:00', '16:15:00',  10.00),
    (1021, 'Paddington Express', 'Paddington', 'Liverpool St', 'Economy', '16:00:00', '16:30:00', 4.55),
    (1022, 'Liverpool St Express', 'Liverpool St', 'Crystal Palace', 'First Class', '16:45:00', '17:15:00', 7.93),
    (1023, 'Crystal Palace Express', 'Crystal Palace', 'Greenwich', 'Standard', '17:00:00', '17:30:00', 5.20);

UPDATE Journey
SET arrivaltime = DATE_ADD(departtime, INTERVAL distance / 60 HOUR)
WHERE journeyid BETWEEN 1 AND 44;
 
 select * from Journey ;

UPDATE Journey
SET arrivaltime = 
  CASE 
    WHEN distance <= 5 THEN departtime + INTERVAL 30 MINUTE
    WHEN distance <= 10 THEN departtime + INTERVAL 45 MINUTE
    WHEN distance <= 15 THEN departtime + INTERVAL 60 MINUTE
    ELSE departtime + INTERVAL 90 MINUTE
  END
WHERE trainid IN (
  '1001', '1002', '1003', '1004', '1005', '1006', '1007', '1008', '1009', '1010',
  '1011', '1012', '1013', '1014', '1015', '1016', '1017', '1018', '1019', '1020',
  '1021', '1022', '1023'
);

   
 

