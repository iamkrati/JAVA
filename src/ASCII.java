import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Character obj=new Character();
        obj.result();
    }
}
class Character{
    int arr[];
    Character(){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("ENTER THE ASCCII VALUES OF WHICH YOU WANT A CHARACTER");
        for(int i=0;i< arr.length;i++)
        {
            Scanner sc1=new Scanner(System.in);
            arr[i]=sc1.nextInt();
        }
    }
    public void result(){
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(" "+(char)(arr[j]));
        }
    }
}
