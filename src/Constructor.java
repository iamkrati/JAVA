import java.util.Scanner;

public class Constructor {
    Constructor(){
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.println("Name:"+name);
    }
    Constructor(String course)
    {
        this();
        Scanner sc1=new Scanner(System.in);
        course= sc1.next();
        System.out.println("Course:"+course);
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor("j");
    }
}
