-- *****************************************************
-- * Simple database model for Customers application.
-- * 
-- * Author:  Sobhy Haleem
-- * Description:  Ready for summer!  Run this SQL in
-- *   your favorite Apache derby schema if you are
-- *   not using the NetBeans sample database
-- *****************************************************

CREATE TABLE CUSTOMER (
CUSTOMER_ID INTEGER NOT NULL,
DISCOUNT_CODE CHAR(1) NOT NULL,
ZIP VARCHAR(10) NOT NULL,
"NAME" VARCHAR(30),
ADDRESSLINE1 VARCHAR(30),
ADDRESSLINE2 VARCHAR(30),
CITY VARCHAR(25),
"STATE" CHAR(2),
PHONE CHAR(12),
FAX CHAR(12),
EMAIL VARCHAR(40),
CREDIT_LIMIT INTEGER,
DEPARTMENT_ID INTEGER,
PRIMARY KEY (CUSTOMER_ID));


CREATE TABLE DEPARTMENT (
id Integer  NOT NULL,
"NAME" VARCHAR(30));

INSERT INTO DEPARTMENT (id, NAME) 
VALUES (1, 'Computer Science');
INSERT INTO DEPARTMENT (id, NAME) 
VALUES (2, 'Information System');
INSERT INTO DEPARTMENT (id, NAME) 
VALUES (3, 'Information Technology');


ALTER TABLE APP.CUSTOMER ADD FOREIGN KEY (DEPARTMENT_ID) REFERENCES APP.DEPARTMENT(ID);

INSERT INTO CUSTOMER (CUSTOMER_ID, DISCOUNT_CODE, ZIP, "NAME", ADDRESSLINE1, GENDER, DEPARTMENT_ID, CITY, "STATE", PHONE, FAX, EMAIL, CREDIT_LIMIT) 
	VALUES (1, 'N', '95117', 'SObhy Haleem', '111 E. Las Olivas Blvd', 'Male', 1, 'Fort Lauderdale', 'FL', '305-555-0188', '305-555-0189', 'jumboeagle@example.com', 100000);
INSERT INTO CUSTOMER (CUSTOMER_ID, DISCOUNT_CODE, ZIP, "NAME", ADDRESSLINE1, GENDER, DEPARTMENT_ID, CITY, "STATE", PHONE, FAX, EMAIL, CREDIT_LIMIT) 
	VALUES (2, 'M', '95035', 'Adam Mostafa', '9754 Main Street USA', 'Male', 2,  'Miami', 'FL', '305-555-0148', '305-555-0149', 'www.new.example.com', 50000);
INSERT INTO CUSTOMER (CUSTOMER_ID, DISCOUNT_CODE, ZIP, "NAME", ADDRESSLINE1, GENDER, 3, DEPARTMENT_ID, CITY, "STATE", PHONE, FAX, EMAIL, CREDIT_LIMIT) 
	VALUES (3, 'M', '85638', 'Memo Ahmed', '8989 Red Albatross Drive', 'Female', 'Houston', 'TX', '214-555-0133', '214-555-0134', 'www.wrencomp.example.com', 25000);