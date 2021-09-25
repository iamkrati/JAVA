import java.util.Scanner;

public class ThisKeyword {
    int emp_id;
    ThisKeyword(int empid){
       //1:emp_id=20;
        //2:System.out.println(emp_id);
        //for 1and2 statement we print the value using sout
        Scanner sc=new Scanner(System.in);
        emp_id=sc.nextInt();
        this.emp_id=empid;
        //by using this statement his keyword can be used to refer current class instance variable and
        // holding current object address. If there is ambiguity between the instance variables and
        // parameters, this keyword resolves the problem of ambiguity.
    }

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(10);//how to input from user here
        System.out.println(obj.emp_id);
    }
}
