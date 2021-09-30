import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

        //  for(int i=0;i<arr.length;i++){
        //    arr[i]=new int;
        //}
        CheckNum obj=new CheckNum();
        obj.check();
    }
}

class CheckNum {

    int arr[];
    int n;
    CheckNum() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            Scanner sc1 = new Scanner(System.in);
            arr[i] = sc1.nextInt();
        }
    }
    public void check()
    {
        System.out.println("ENTER NO TO BE CHECK IN ARRAY");
        Scanner ch=new Scanner(System.in);
        int ch1;
        ch1=ch.nextInt();
        for(int i = 0; i<arr.length; i++)
        {
            if (ch1==arr[i])
            {
                System.out.println("FOUND");
                break;}
            else
                System.out.println("NOT FOUND");
        }

    }
}