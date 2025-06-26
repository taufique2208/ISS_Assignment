package procedure;

public class Main {
    public static void main(String[] args) {
        try {
            DBHelper db = new DBHelper();

            // Insert using PreparedStatement
            db.insertStudent(201, "Taufique", 22);
            db.insertStudent(202, "Neha", 21);

            // Call stored procedure using CallableStatement
            db.callGetAllStudents();

            db.close();
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
    }
}
