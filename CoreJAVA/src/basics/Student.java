package basics;

//Class definition
public class Student {

 // Instance variables (State)
 // These variables store the state of the Student object
 private String name;
 private int rollNumber;
 private double marks;

 // Constructor to initialize the Student object
 // Constructor is a special method used to create and initialize objects
 public Student(String name, int rollNumber, double marks) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.marks = marks;
 }

 // Getter methods to access the instance variables
 // These methods provide a way to retrieve the state of the object
 public String getName() {
     return name;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public double getMarks() {
     return marks;
 }

 // Setter method to modify marks
 // This method allows updating the student's marks
 public void setMarks(double marks) {
     this.marks = marks;
 }

 // Method to display student details (Behavior)
 // This method defines a behavior of the Student class to display its details
 public void displayStudentDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Marks: " + marks);
 }

 // Method to simulate a student studying (Behavior)
 // This method simulates the student improving marks after studying
 public void study(double extraMarks) {
     System.out.println(name + " studied and gained " + extraMarks + " extra marks.");
     marks += extraMarks;
 }
}
