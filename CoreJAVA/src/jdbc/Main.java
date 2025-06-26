package jdbc;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // DB URL, username, and password
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "taufique"; // replace with your actual password

        Connection conn = null;

        try {
            // Load the MySQL JDBC driver (optional for modern versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to database!");

            // 1. Insert a student
            String insertSQL = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setInt(1, 105);
            insertStmt.setString(2, "Taufique");
            insertStmt.setInt(3, 22);
            insertStmt.executeUpdate();
            System.out.println("✅ Inserted student");

            // 2. Read students
            String selectSQL = "SELECT * FROM student";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("\n📄 Students in DB:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found.");
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        } finally {
            // Close connection
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Closing connection failed.");
            }
        }
    }
}
