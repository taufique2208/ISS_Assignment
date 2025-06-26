-- UNNormalized Table (bad)
-- CREATE TABLE BadStudentData (
--   id INT,
--   name VARCHAR(50),
--   courses VARCHAR(255) -- 'Math,Physics,Chemistry'
-- );

-- 1NF: Eliminate multivalued attributes
CREATE TABLE Student1NF (
    student_id INT,
    course VARCHAR(50)
);

-- 2NF: Remove partial dependencies
-- Split into Students and Courses

CREATE TABLE Students2NF (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE Courses2NF (
    id INT,
    course VARCHAR(50),
    PRIMARY KEY (id, course),
    FOREIGN KEY (id) REFERENCES Students2NF(id)
);

-- 3NF: Remove transitive dependencies
-- Assume Address depends on city, not on student

CREATE TABLE Cities (
    city_id INT PRIMARY KEY,
    city_name VARCHAR(50)
);

CREATE TABLE Students3NF (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    city_id INT,
    FOREIGN KEY (city_id) REFERENCES Cities(city_id)
);
