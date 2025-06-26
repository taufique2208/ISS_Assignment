package jsondemo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a Student object
            Student student = new Student(1, "Taufique", 21);

            // Initialize ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // Serialize Java object to JSON
            String json = mapper.writeValueAsString(student);
            System.out.println("Serialized JSON:\n" + json);

            // Deserialize JSON back to Student object
            Student deserialized = mapper.readValue(json, Student.class);
            System.out.println("\nDeserialized Object:\n" + deserialized);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
