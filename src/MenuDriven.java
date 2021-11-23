import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Driven obj=new Driven();
        obj.Menu();
    }
}
class Driven{
    public void Menu(){
        Scanner sc=new Scanner(System.in);
        char ch;
       do
        {
        System.out.println("1.For find prime number");
        System.out.println("2.For find factorial of a number");
        System.out.println("3.For find fibonacci series");
        int num=0;
        try {
             num = sc.nextInt();
        }
        catch (InputMismatchException ex)
        {
            System.out.println(ex);
        }
        switch(num) {
            case 1:
                int n;
                System.out.println("enter number to check prime or not");
                n = sc.nextInt();
                int flag = 0;
                for (int i = 2; i <= n / 2; i++) {
                    if (n % 2 == 0) {
                        flag = 1;
                    }
                }
                if (flag==1) {
                    System.out.println(n + " is not a prime number");
                } else {
                    System.out.println(n + " is a prime number");
                }
                break;
            case 2:
                int n1;
                System.out.println("enter number to find factorial");
                n1 = sc.nextInt();
                int f = 1;
                for (int i = 1; i <= n1; i++) {
                    f = f * i;
                }
                System.out.println("Factorial of " + n1 + "is " + f);
                break;
            case 3:
                int num1 = 0;
                int num2 = 1;
                int nuum, num3;
                System.out.println("enter terms");
                nuum = sc.nextInt();
                System.out.print(num1 + " " + num2);
                for (int i = 2; i < nuum; i++) {
                    num3 = num1 + num2;
                    System.out.print(" " + num3);
                    num1 = num2;
                    num2 = num3;
                }
        }
        System.out.println("press y for continue");
            ch=sc.next().charAt(0);
        }while(ch=='Y' || ch=='y');
    }
    }

