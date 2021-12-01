package JDBC;
import java.sql.*;
import java.io.*;
public class New {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakshi", "root", "");

            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select * from rshita");
            while(rs.next())
            {
                System.out.println(rs.getString(1) + " " + rs.getInt(2));
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}