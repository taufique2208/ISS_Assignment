package filereadwrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFileManager {

    private static final String FILE_PATH = "students.txt";

    // Write a list of students to file
    public static void writeStudentsToFile(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Student s : students) {
                writer.write(s.toFileString());
                writer.newLine();
            }
            System.out.println("✅ Students written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read students from file
    public static List<Student> readStudentsFromFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Student s = Student.fromFileString(line);
                students.add(s);
            }
            System.out.println("✅ Students read from file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
