USE testdb;

-- Create sample table
CREATE TABLE Students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    city VARCHAR(50)
);

-- Insert data
INSERT INTO Students VALUES (1, 'Taufique', 22, 'Mumbai'), (2, 'Neha', 20, 'Delhi');

-- Basic queries
SELECT * FROM Students;
SELECT DISTINCT city FROM Students;
SELECT * FROM Students WHERE age > 21 AND city = 'Mumbai';
SELECT * FROM Students WHERE name LIKE 'N%';
SELECT * FROM Students ORDER BY age DESC;
UPDATE Students SET city = 'Pune' WHERE id = 2;
DELETE FROM Students WHERE id = 1;

-- Aliases
SELECT name AS StudentName, city AS CityName FROM Students;

-- IN, BETWEEN, WILDCARDS
SELECT * FROM Students WHERE city IN ('Delhi', 'Pune');
SELECT * FROM Students WHERE age BETWEEN 18 AND 25;
