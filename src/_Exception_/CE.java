package _Exception_;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CE {
    public static void main(String[] args) throws IOException {
        FileReader filee = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput= new BufferedReader(filee);
        for (int i=0;i<3;i++)
            System.out.println(fileInput.readLine());
        fileInput.close();
    }
}
