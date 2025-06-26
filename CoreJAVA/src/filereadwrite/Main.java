package filereadwrite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create sample students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Taufique", 22));
        studentList.add(new Student(102, "Neha", 21));

        // Write students to file
        StudentFileManager.writeStudentsToFile(studentList);

        // Read students back from file
        List<Student> loadedStudents = StudentFileManager.readStudentsFromFile();

        // Display loaded students
        for (Student s : loadedStudents) {
            System.out.println(s);
        }
    }
}
