package JDBC;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertImageToMySqlDB {
    public static void main(String args[]) throws Exception{
        //Registering the Driver
    //    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //Getting the connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/images", "root", "");
        System.out.println("Connection established......");
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO iim VALUES(?,?)");
        pstmt.setString(1, "sample image");
        //Inserting Blob type
        File file=new File("C:\\Users\\KRATI GOYAL\\Downloads\\1632196267989.jpg");
        FileInputStream fis=new FileInputStream(file);
//        InputStream in = new FileInputStream("");
  //      pstmt.setBlob(2, in);
        //Executing the statement
        pstmt.setBinaryStream(2,fis,(int)file.length());
        pstmt.execute();
        System.out.println("Record inserted......");
    }
}
