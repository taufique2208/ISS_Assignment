package stringsandarrays;

import java.util.Arrays;

public class Student {
    private String name;
    private String[] subjects;

    public Student(String name, String[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    // String operations
    public void processName() {
        System.out.println("\n--- String Operations on Student Name ---");
        System.out.println("Original Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("First 3 letters: " + name.substring(0, 3));
        System.out.println("Does name contain 'a'? " + name.contains("a"));
        System.out.println("Name starts with 'T'? " + name.startsWith("T"));
    }

    // Array operations
    public void processSubjects() {
        System.out.println("\n--- Array Operations on Subjects ---");
        System.out.println("Subjects Enrolled:");
        for (String subject : subjects) {
            System.out.println("  - " + subject);
        }

        // Sort the array
        Arrays.sort(subjects);
        System.out.println("\nSorted Subjects:");
        for (String s : subjects) {
            System.out.println("  - " + s);
        }

        // Search for a subject
        String target = "Math";
        boolean found = Arrays.asList(subjects).contains(target);
        System.out.println("\nIs " + target + " in the list? " + found);
    }

    public void displayStudent() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Subjects: " + Arrays.toString(subjects));
    }
}
