package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student(103, "Taufique");
        Student s2 = new Student(101, "Neha");
        Student s3 = new Student(102, "Vinesh");
        Student s4 = new Student(101, "Neha"); // duplicate

        // -------- List<Student> --------
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println("List (Before Sorting):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Sort using Comparable (by ID)
        Collections.sort(studentList);
        System.out.println("\nList (Sorted by ID using Comparable):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Sort using Comparator (by name)
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("\nList (Sorted by Name using Comparator):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // -------- Set<Student> --------
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4); // duplicate should not be added

        System.out.println("\nSet (Unique Students):");
        for (Student s : studentSet) {
            System.out.println(s);
        }

        // -------- Map<Student, Student> --------
        Map<Student, Student> studentMap = new HashMap<>();
        studentMap.put(s1, s1);
        studentMap.put(s2, s2);
        studentMap.put(s3, s3);
        studentMap.put(s4, s4); // overwrites s2 if equals()

        System.out.println("\nMap (Student → Student):");
        for (Map.Entry<Student, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}
