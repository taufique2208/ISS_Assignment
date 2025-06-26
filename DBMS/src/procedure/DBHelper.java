package procedure;

import java.sql.*;

public class DBHelper {
    private final String url = "jdbc:mysql://localhost:3306/testdb";
    private final String user = "root";
    private final String password = "taufique"; // <-- change this

    private Connection conn;

    public DBHelper() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
    }

    // PreparedStatement example
    public void insertStudent(int id, String name, int age) {
        String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.executeUpdate();
            System.out.println("✅ Student inserted using PreparedStatement");
        } catch (SQLException e) {
            System.err.println("Insert error: " + e.getMessage());
        }
    }

    // CallableStatement example
    public void callGetAllStudents() {
        String sql = "{CALL GetAllStudents()}";
        try (CallableStatement cs = conn.prepareCall(sql)) {
            ResultSet rs = cs.executeQuery();
            System.out.println("📋 All Students (from Stored Procedure):");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Age: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            System.err.println("Stored Procedure error: " + e.getMessage());
        }
    }

    public void close() {
        try {
            if (conn != null) conn.close();
            System.out.println("✅ Connection closed.");
        } catch (SQLException e) {
            System.err.println("Close error: " + e.getMessage());
        }
    }
}
