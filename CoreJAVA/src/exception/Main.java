package exception;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Taufique");

        try {
            System.out.println("Setting valid marks...");
            student.setMarks(85);  // Valid
            student.display();

            System.out.println("\nSetting invalid marks...");
            student.setMarks(150);  // Invalid: throws custom exception

        } catch (InvalidMarksException e) {
            // Catching custom exception
            System.out.println("Caught Exception: " + e.getMessage());

        } catch (Exception e) {
            // Catching generic exceptions
            System.out.println("Something went wrong: " + e);

        } finally {
            // Finally block runs always
            System.out.println("\nOperation complete. (finally block)");
        }

        System.out.println("\nProgram continues normally...");
    }
}
