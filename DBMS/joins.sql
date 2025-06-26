-- Department table
CREATE TABLE Departments (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

-- Add foreign key to Students
ALTER TABLE Students ADD COLUMN department_id INT;
ALTER TABLE Students ADD FOREIGN KEY (department_id) REFERENCES Departments(id);

-- Insert data
INSERT INTO Departments VALUES (1, 'CS'), (2, 'IT');
UPDATE Students SET department_id = 1 WHERE id = 2;

-- INNER JOIN
SELECT s.name, d.name AS dept FROM Students s
JOIN Departments d ON s.department_id = d.id;

-- LEFT JOIN
SELECT s.name, d.name AS dept FROM Students s
LEFT JOIN Departments d ON s.department_id = d.id;

-- RIGHT JOIN
SELECT s.name, d.name AS dept FROM Students s
RIGHT JOIN Departments d ON s.department_id = d.id;

-- FULL JOIN (not directly supported in MySQL, simulate using UNION)
SELECT s.name, d.name AS dept FROM Students s
LEFT JOIN Departments d ON s.department_id = d.id
UNION
SELECT s.name, d.name AS dept FROM Students s
RIGHT JOIN Departments d ON s.department_id = d.id;
