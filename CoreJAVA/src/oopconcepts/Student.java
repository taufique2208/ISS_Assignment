package oopconcepts;

// Student extends Person (Inheritance) and implements Performance (Interface)
public class Student extends Person implements Performance {
    private int[] marks;

    public Student(String name, int age, int[] marks) {
        super(name, age); // Call superclass constructor
        this.marks = marks;
    }

    // Overriding abstract method from Person
    @Override
    public void showRole() {
        System.out.println(getName() + " is a Student.");
    }

    // Implementing interface method
    @Override
    public double calculateGrade() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / (double) marks.length;
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Average Grade: " + calculateGrade());
    }
}
