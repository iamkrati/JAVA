package _Exception_;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName());
        }
        finally {
//            Scanner sc=new Scanner(System.in);
//            int m=sc.nextInt();
            System.out.println(";lkjhfds");
        }
    }
}
