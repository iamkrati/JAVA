import java.util.Scanner;

public class Varargs {
    public static void main(String[] args) {
        Var ob=new Var();
        ob.m1("krati",1,2,3,4,5);
    }
}
class Var{
    public void m1(String Name,int rollno,int ...marks)
    {
      //  Scanner sc=new Scanner(System.in);
       // Name=sc.next();
        //rollno=sc.nextInt();
       // for (int mark : marks) {
         //   sc.nextInt();
       // }
        System.out.println(Name+" "+rollno);
        for(int i:marks)
        {
            System.out.println(i);
        }
    }

}
