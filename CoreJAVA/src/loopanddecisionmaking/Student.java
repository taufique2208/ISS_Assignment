package loopanddecisionmaking;


public class Student {
    private String name;
    private int[] subjectMarks;  // Array to store marks for multiple subjects

    // Constructor
    public Student(String name, int[] subjectMarks) {
        this.name = name;
        this.subjectMarks = subjectMarks;
    }

    // Method to calculate total marks
    public int getTotalMarks() {
        int total = 0;
        for (int mark : subjectMarks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate average marks
    public double getAverage() {
        return getTotalMarks() / (double) subjectMarks.length;
    }

    // Method to get grade using decision making
    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "Fail";
    }

    // Display student result
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks per Subject:");
        
        // Using for loop
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("  Subject " + (i + 1) + ": " + subjectMarks[i]);
        }

        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }
}
