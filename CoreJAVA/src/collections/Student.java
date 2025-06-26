package collections;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Comparable implementation (sort by ID)
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return "[ID: " + id + ", Name: " + name + "]";
    }

    // Override equals and hashCode for correct Set and Map behavior
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}
