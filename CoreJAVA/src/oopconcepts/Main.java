package oopconcepts;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Person reference, Student object
        Person student = new Student("Taufique", 21, new int[]{80, 90, 85, 70});

        student.showRole();  // Calls overridden method

        // Downcast to access Student-specific method
        if (student instanceof Student) {
            Student s = (Student) student;
            s.displayStudentDetails();
        }
    }
}
