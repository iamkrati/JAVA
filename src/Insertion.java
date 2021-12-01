import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        int arr[]=new int[100];

        for (int i : arr) {
            arr[0]=5;
            arr[1]=8;
            arr[2]=4;
            arr[3]=1;
            arr[4]=9;
            arr[5]=7;
        }
        //[]={5,8,4,1,9,7};
        System.out.println("enter pos to inser");
        int pos,ele;
        Scanner sc=new Scanner(System.in);
        pos=sc.nextInt();
        System.out.println("enter ele");
        ele=sc.nextInt();
       // int n= arr.length;
        for(int i=6;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=ele;
        for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }
       // System.out.println(Arrays.toString(arr));
    }
}
