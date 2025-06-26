package loopanddecisionmaking;

public class Main {
    public static void main(String[] args) {
        // Create student with marks for 5 subjects
        int[] marks = {85, 72, 90, 66, 78};
        Student student = new Student("Taufique", marks);

        // Display result
        student.displayResult();

        // While loop: count subjects above 75
        int count = 0, i = 0;
        while (i < marks.length) {
            if (marks[i] > 75) {
                count++;
            }
            i++;
        }
        System.out.println("\nSubjects with marks above 75: " + count);

        // Do-while loop: print all marks again (for demonstration)
        System.out.println("\nPrinting marks using do-while:");
        int j = 0;
        do {
            System.out.println("  Subject " + (j + 1) + ": " + marks[j]);
            j++;
        } while (j < marks.length);
    }
}
