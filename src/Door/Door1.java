package Door;
import java.util.Scanner;
public class Door1 {
   boolean status;
    Lock lockobj;
    class Lock{
        Output obj;
        // public boolean status;
         Lock(){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter your status");
             boolean status=sc.nextBoolean();
             obj=new Output(status);
         }

//        public void setcon(boolean status){
//            this.status=status;
//
//        }
//        public boolean getcon()
//        {
//            return status;
//        }
    }
    public Door1(){
        lockobj=new Lock();
//        lockobj.setcon(status1);
//        System.out.println(lockobj.getcon());
    }
}
