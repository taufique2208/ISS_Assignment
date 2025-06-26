package datatypes;

public class Main {
    public static void main(String[] args) {
        // Creating a student object with all types of data
        Student student = new Student(
            "Taufique Ansari",     // String
            101,                   // int
            88.75,                 // double
            true,                  // boolean
            'A',                   // char
            95.5f,                 // float
            123456789012L,         // long
            (byte) 6,              // byte
            (short) 120,           // short
            "STD2025001"           // final String
        );

        // Printing each attribute to understand data types
        System.out.println("----- Student Details -----");
        System.out.println("Name (String): " + student.getName());
        System.out.println("Roll Number (int): " + student.getRollNumber());
        System.out.println("Marks (double): " + student.getMarks());
        System.out.println("Passed (boolean): " + student.isPassed());
        System.out.println("Grade (char): " + student.getGrade());
        System.out.println("Attendance Percentage (float): " + student.getAttendancePercentage());
        System.out.println("Registration Number (long): " + student.getRegistrationNumber());
        System.out.println("Semester (byte): " + student.getSemester());
        System.out.println("Total Credits (short): " + student.getTotalCredits());
        System.out.println("Student ID (final String): " + student.getStudentId());

        // Display the total number of students created (static variable)
        System.out.println("Total Students Created (static): " + Student.getStudentCount());
    }
}
