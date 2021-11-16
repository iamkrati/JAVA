package _Exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        int a,b,index;
        int arr[]={10,20,30,40};
       Scanner sc=null;
        try{
           sc=new Scanner(System.in);
            a= sc.nextInt();
            b= sc.nextInt();
            index= sc.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException obj)
        {
            System.out.println(obj.getClass().getName());

        }
        finally
        {
            sc.close();
        }
    }
}
