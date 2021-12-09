package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Inser {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "");
      //  Statement s = con1.createStatement();
        PreparedStatement p=con1.prepareStatement("insert into city values(?,?,?)");
        // int rs=s.executeUpdate("");
        char ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter name");
            String name = sc.next();
            int a = sc.nextInt();
            int km = sc.nextInt();
            p.setString(1,name);
            p.setInt(2,a);
            p.setInt(3,km);
            p.execute();
            System.out.println("press yes or no");
            ch = sc.next().charAt(0);
        } while (ch =='Y' || ch == 'y');
        con1.close();
    }
}