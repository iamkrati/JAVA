import First.Stud;

import java.util.Scanner;

public class TestStudent extends Stud{
//    public void dis9(){
//        System.out.println(rollno);
//    }
    public TestStudent(int rollno, String name) {
        super(rollno, name);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TestStudent obj=new TestStudent(sc.nextInt(), sc.next());
       // System.out.println(obj.rollno);
      
        obj.display();
    }
}
