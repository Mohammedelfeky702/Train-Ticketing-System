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
(9012345, 'Fast Track', 165, 'Standard'),
(1122334, 'Zooming Express', 185, 'First class');

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
    pass VARCHAR(100)
);
select * from users;

alter table users add column (gender varchar(30));
select * from users;

ALTER TABLE users ADD COLUMN kl VARCHAR(50);

select* from users;

