package JDBC;

import java.sql.*;

public class UpdateQ2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con1 = null;
        try {
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "");
        } catch (Exception ex) {
//            System.out.println("Connection could not be established");
//            System.out.println(ex.getMessage());
//            System.exit(0);
        }
        Statement s = con1.createStatement();
        ResultSet s1 = s.executeQuery("select ename,job,sal,comm from emp  where sal<=2000 and sal>=1000");
        while (s1.next()) {
            System.out.print(s1.getString(1)+" ");
            System.out.print(s1.getString(2)+" ");
            System.out.print(s1.getInt(3)+" ");
            System.out.println(s1.getString(4)+" ");
        }
        con1.close();
    }
}
