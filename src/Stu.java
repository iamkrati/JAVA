import java.util.Scanner;

public class Stu {


    public static void main(String[] args) {
        Detail obj=new Detail();
     //   obj.display();


    }
}
class Detail{
    public int num;
    public int n;
    Detail()
    {
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
     //   System.out.println(num);
        n=num;
        int re;
        int sum=0;
        while(n!=0){
            re=n%10;
            sum=sum*10+re;
            n=n/10;
        }
        if(sum==num)
               System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
