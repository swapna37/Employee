DROP TABLE IF EXISTS Employee;  
CREATE TABLE Employee (  
employeeId VARCHAR   PRIMARY KEY,  
firstName VARCHAR(50) NOT NULL,  
lastName VARCHAR(50) NOT NULL  ,
email VARCHAR(50) NOT NULL,  
doj date NOT NULL,
salary BIGINT NOT NULL,  
phoneNumber VARCHAR(50) NOT NULL  
);



INSERT INTO Employee VALUES (1, 'Swapna','Barma','ss@imaginnovate.com','2024-01-01',100000,'9876543211');    
INSERT INTO Employee VALUES (2, 'sravani','P','ps@imaginnovate.com','2022-01-01',200000,'8976543210');   
