import java.util.Scanner;

public class Constructor1 {
    Constructor1(){
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.println("Name:"+name);
    }
    Constructor1(String course)
    {
        this();
        Scanner sc1=new Scanner(System.in);
        course= sc1.next();
        System.out.println("Course:"+course);
    }
    Constructor1(int rn)
    {
        this();
        rn=15;
        System.out.println(rn);
    }
    public static void main(String[] args) {
        Constructor1 obj=new Constructor1("j");
    }
}
