{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red255\green255\blue255;}
{\*\expandedcolortbl;;\csgray\c0;\csgray\c100000;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 create table customer(\
Customer_id int not null auto_increment,\
Title varchar(8),\
FirstName varchar(50) NOT NULL,\
LastName varchar(50) NOT NULL,\
Address1 varchar(100) NOT NULL,\
Address2 varchar(100),\
City varchar(100) NOT NULL,\
County varchar(100),\
PostCode varchar(20) NOT NULL,\
Country varchar(50),\
HomePhone varchar(20),\
MobilePhone varchar(20),\
Email varchar(255),\
Primary key (customer_id)\
);\
\
Create table caravan(\
Caravan_id int not null auto_increment,\
Make varchar(100) NOT NULL,\
Model varchar(100) NOT NULL,\
awn_size double,\
Internal_length double,\
shipping_length double,\
fixed_bed double,\
end_bathroom double,\
Berth double,\
production_year int,\
Enabled bool,\
Comments blob,\
Primary key (caravan_id)\
);\
\
Create table event(\
event_id int not null auto_increment,\
event_name varchar(255),\
event_location varchar(255),\
primary key (event_id)\
);\
\
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f1\fs22 \cf2 \cb3 \CocoaLigature0 insert into adcaravans.customer values(\
Default,\
"Mr",\
"Jack",\
"Wass",\
"44 Shelley Close",\
"",\
"Yeovil",\
"Somerset",\
"BA21 3TX",\
"UK",\
"01935 415570",\
"07450517784",\
"wassj93@gmail.com");}