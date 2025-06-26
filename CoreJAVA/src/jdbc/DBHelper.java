package jdbc;


import java.sql.*;

public class DBHelper {
    private final String url = "jdbc:mysql://localhost:3306/testdb";
    private final String user = "root";
    private final String password = "taufique"; // ✅ Replace this
    private Connection conn;

    // Constructor to initialize DB connection
    public DBHelper() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection(url, user, password);
    }

    // Insert a student into the database
    public void insertStudent(int id, String name, int age) {
        String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            int rows = stmt.executeUpdate();
            System.out.println("Inserted " + rows + " student(s).");
        } catch (SQLException e) {
            System.err.println("Insert error: " + e.getMessage());
        }
    }

    // Display all students from the database
    public void fetchAndPrintStudents() {
        String sql = "SELECT * FROM student";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n--- Student List ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (SQLException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }

    // Close the database connection
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("✅ Connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Close error: " + e.getMessage());
        }
    }
}
