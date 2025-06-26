package datatypes;

// Class definition
public class Student {

    // Instance variables (State) using basic data types
    private String name;
    private int rollNumber;
    private double marks;
    private boolean isPassed;
    private char grade;
    private float attendancePercentage;
    private long registrationNumber;
    private byte semester;
    private short totalCredits;

    // Final variable (cannot be changed once assigned)
    private final String studentId;

    // Static variable (shared by all instances)
    private static int studentCount = 0;

    // Constructor to initialize the Student object
    public Student(String name, int rollNumber, double marks, boolean isPassed,
                   char grade, float attendancePercentage, long registrationNumber,
                   byte semester, short totalCredits, String studentId) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.isPassed = isPassed;
        this.grade = grade;
        this.attendancePercentage = attendancePercentage;
        this.registrationNumber = registrationNumber;
        this.semester = semester;
        this.totalCredits = totalCredits;
        this.studentId = studentId;
        studentCount++;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public char getGrade() {
        return grade;
    }

    public float getAttendancePercentage() {
        return attendancePercentage;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public byte getSemester() {
        return semester;
    }

    public short getTotalCredits() {
        return totalCredits;
    }

    public String getStudentId() {
        return studentId;
    }

    // Setter methods
    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setAttendancePercentage(float attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + isPassed);
        System.out.println("Grade: " + grade);
        System.out.println("Attendance: " + attendancePercentage + "%");
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Semester: " + semester);
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("Student ID: " + studentId);
    }

    // Method to update marks
    public void updateMarks(double extraMarks) {
        System.out.println("Gained " + extraMarks + " marks...");
        marks += extraMarks;
    }

    // Static method to get the student count
    public static int getStudentCount() {
        return studentCount;
    }
}
