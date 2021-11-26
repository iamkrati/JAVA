package JDBC;
import java.sql.*;

public class DEMOJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","");
        Statement s=con.createStatement();
        int rs=s.executeUpdate("insert into city values('a1',5,5000)");
        ResultSet rs1=s.executeQuery("select * from city;");
        while(rs1.next())
        {
            System.out.println(rs1.getString(1));
        }
        //  con.close();
    }
}
