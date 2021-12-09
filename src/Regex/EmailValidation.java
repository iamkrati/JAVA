package Regex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emailscollect", "root", "");
        PreparedStatement prst = conn.prepareStatement("insert into emails values(?,?)");
        Pattern p1 = Pattern.compile("[A-Za-z]");
        Pattern p = Pattern.compile("[\\w.]*@gmail.com");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name;
        String email;
        name = sc.nextLine();
        System.out.println("enter email");
        email = sc.next();
        Matcher m1 = p1.matcher(name);
        Matcher m = p.matcher(email);
        // System.out.println(m1.find());
        if (m1.find()) {
            if (m.find()) {
                //System.out.println("Valid");
                //System.out.println(m.group());
                prst.setString(1, name);
                prst.setString(2, email);
                prst.execute();
            } else
                System.out.println("not valid email");
        }
        else {
            System.out.println("not valid name");
            if (m.find()) {
                System.out.println("but valid email");
            } else
                System.out.println("not valid email");
        }
    }
}
