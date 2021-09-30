import java.util.Scanner;

class GFG
{
    public static void main (String[] args)
    {
        int[] arr = new int[5];
      //  arr[0] = 10;
       // arr[1] = 20;
       for(int i=0;i<arr.length;i++){
           Scanner sc=new Scanner(System.in);
           arr[i]=sc.nextInt();
       }
        for (int i = 0; i <arr.length; i++)
            System.out.println(arr[i]);
    }
}