import java.util.Scanner;

public class OneMore {
    public static  int age;
//    age=16;
    public static int roll_no;
    public static void main(String[] args) {
//        OneMore obj = new OneMore();
        System.out.println("Enter age and roll no : ");
        Scanner sc=new Scanner(System.in);
        OneMore.age=sc.nextInt();
        OneMore.roll_no=sc.nextInt();
        System.out.println("age : "+OneMore.age+" roll-no : "+OneMore.roll_no);
    }
}