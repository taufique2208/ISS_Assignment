CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

-- Create the table
CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

-- Create stored procedure
DELIMITER //
CREATE PROCEDURE GetAllStudents()
BEGIN
    SELECT * FROM student;
END //
DELIMITER ;
