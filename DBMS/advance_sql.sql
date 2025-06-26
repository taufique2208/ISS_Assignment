-- DROP & ALTER
ALTER TABLE Courses ADD COLUMN instructor VARCHAR(50);
DROP INDEX idx_course_name ON Courses;

-- AUTO INCREMENT
CREATE TABLE AutoTest (
    id INT AUTO_INCREMENT PRIMARY KEY,
    value VARCHAR(50)
);

-- VIEWS
CREATE VIEW StudentView AS
SELECT name, city FROM Students;

-- NULL Values
SELECT * FROM Students WHERE city IS NULL;

-- GROUP BY & HAVING
SELECT city, COUNT(*) as total FROM Students GROUP BY city HAVING COUNT(*) > 0;

-- Functions
SELECT COUNT(*) FROM Students;
SELECT AVG(age) FROM Students;

-- Null functions
SELECT IFNULL(city, 'Unknown') FROM Students;

-- Stored Procedure
DELIMITER //
CREATE PROCEDURE GetAllStudents()
BEGIN
    SELECT * FROM Students;
END //
DELIMITER ;

-- Callable
CALL GetAllStudents();
