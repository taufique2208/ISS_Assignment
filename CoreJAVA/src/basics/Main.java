package basics;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Taufique", 101, 85.5);

        // Display initial details
        System.out.println("Initial Student Details:");
        student.displayStudentDetails();

        // Simulate studying
        student.study(4.5);

        // Display updated details
        System.out.println("\nUpdated Student Details:");
        student.displayStudentDetails();
    }
}
