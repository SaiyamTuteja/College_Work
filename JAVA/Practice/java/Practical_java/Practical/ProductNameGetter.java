
import java.sql.*;
import java.util.Scanner;

public class ProductNameGetter {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection(url, username, password); CallableStatement cstmt = conn.prepareCall("{call getName(?, ?)}")) {
            cstmt.setInt(1, id);
            cstmt.registerOutParameter(2, Types.VARCHAR);
            cstmt.execute();
            String name = cstmt.getString(2);
            System.out.println("Product name for ID " + id + ": " + name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
