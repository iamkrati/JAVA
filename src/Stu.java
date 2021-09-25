import java.util.Scanner;

public class Stu {


    public static void main(String[] args) {
        Detail obj=new Detail();
        obj.display();


    }
}
class Detail{
    public int age;
    public int roll_no;
    public String name;
 public void display(){
     Scanner sc=new Scanner(System.in);
     age=sc.nextInt();
     roll_no=sc.nextInt();
     name=sc.next();
     System.out.println(age);
     System.out.println(roll_no);
     System.out.println(name);
 }
}
