create table customer(
Customer_id int not null auto_increment,
Title varchar(8),
FirstName varchar(50) NOT NULL,
LastName varchar(50) NOT NULL,
Address1 varchar(100) NOT NULL,
Address2 varchar(100),
City varchar(100) NOT NULL,
County varchar(100),
PostCode varchar(20) NOT NULL,
Country varchar(50),
HomePhone varchar(20),
MobilePhone varchar(20),
Email varchar(255),
Primary key (customer_id)
);

Create table caravan(
Caravan_id int not null auto_increment,
Make varchar(100) NOT NULL,

awn_size double,
Internal_length double,
shipping_length double,
fixed_bed double,
end_bathroom double,
Berth double,
production_year int,
Enabled bool,
Comments blob,
Primary key (caravan_id)
);


Create table event(
event_id int not null auto_increment,
event_name varchar(255),
event_location varchar(255),
primary key (event_id)
);