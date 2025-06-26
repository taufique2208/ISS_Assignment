-- Create table with constraints
CREATE TABLE Courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50) NOT NULL UNIQUE,
    credits INT CHECK (credits >= 1 AND credits <= 5),
    dept_id INT DEFAULT 1
);

-- Index
CREATE INDEX idx_course_name ON Courses(course_name);
