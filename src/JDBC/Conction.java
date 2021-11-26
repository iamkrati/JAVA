package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conction {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "");
        }
        catch (Exception ex)
        {
            System.out.println("Connection could not be established");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        System.out.println("Connection Established Successfully");
    }
}
