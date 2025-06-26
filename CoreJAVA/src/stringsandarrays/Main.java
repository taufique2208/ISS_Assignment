package stringsandarrays;

public class Main {
    public static void main(String[] args) {
        // Create a student with name and subjects
        String[] subjectList = {"Physics", "Chemistry", "Math", "English", "Computer"};
        Student s1 = new Student("Taufique", subjectList);

        // Display student details
        s1.displayStudent();

        // Perform string operations
        s1.processName();

        // Perform array operations
        s1.processSubjects();
    }
}