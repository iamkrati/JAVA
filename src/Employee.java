import java.util.Scanner;
public class Employee {
    int eid;
    String ename;
    int empsal;
    String cname;
    Employee(){
        System.out.println("enter eid,ename,empsal,cname");
        Scanner sc=new Scanner(System.in);
        eid=sc.nextInt();
        ename=sc.next();
        empsal=sc.nextInt();
        cname=sc.next();
    }
    public static void result(Employee arr[]){
        int max=0;
        int max1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].cname.equals("A"))
            {
                //max=arr[i].empsal;
                if(arr[i].empsal>max)
                {
                    max=arr[i].empsal;
                }
            }
            if(arr[i].cname.equals("B"))
            {
                if(arr[i].empsal>max1)
                {
                    max1=arr[i].empsal;

                }
            }
        }
        System.out.println("highest salary of A company is"+max);
        System.out.println("highest salary of B company is"+max1);
    }
}
class EmpMain{
    public static void main(String[] args) {
        System.out.println("enter no. of employees");
        int len;
        Scanner ob=new Scanner(System.in);
        len=ob.nextInt();
        Employee arr[]=new Employee[len];
        for(int i=0;i<len;i++){
            arr[i]=new Employee();
        }
        Employee.result(arr);
    }

}
