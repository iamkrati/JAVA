import java.util.Scanner;

class Stu1 {
    int rollno;
    String sname;
    int submarks[];
    Stu1(){
    submarks=new int[5];
    for(int i=0;i<submarks.length;i++)
    {
        Scanner sc=new Scanner(System.in);
        submarks[i]=sc.nextInt();
    }
    }
    public void show(){
        for(int res:submarks)
        {
            System.out.println(res);
        }
    }
}
class Array2Stu{
    public static void main(String[] args) {
        Stu1 obj=new Stu1();
        obj.show();
    }
}
