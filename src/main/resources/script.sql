CREATE DATABASE reservation;
USE reservation;


CREATE TABLE reservation (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             FirstName VARCHAR(20) NOT NULL,
                             LastName VARCHAR(20) NOT NULL,
                             NOMBREPEOPLE VARCHAR(20) NOT NULL,
                             Price VARCHAR(20) NOT NULL
)


    INSERT INTO reservation (FirstName, LastName, NOMBREPEOPLE, Price) VALUES ('Ramadan', 'Goumaneh', '4', '50.00');