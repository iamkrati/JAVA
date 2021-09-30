import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Num1or4 obj=new Num1or4();
    }
}
class Num1or4{
    int n;
    int arr[];
    Num1or4(){
        int k=0;
        System.out.println("enter size og array elements ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for (int  i=0;i<arr.length;i++)
        {
            if (arr[i]==1||arr[i]==4)
                k++;
        }
        if (k==arr.length)
            System.out.println (" True ");
        else
            System.out.println (" False ");

    }

}