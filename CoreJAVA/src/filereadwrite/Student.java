package filereadwrite;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {}

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Convert object to a line of text
    public String toFileString() {
        return id + "," + name + "," + age;
    }

    // Create Student object from a line of text
    public static Student fromFileString(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int age = Integer.parseInt(parts[2]);
        return new Student(id, name, age);
    }

    @Override
    public String toString() {
        return "Student { ID=" + id + ", Name='" + name + "', Age=" + age + " }";
    }
}
