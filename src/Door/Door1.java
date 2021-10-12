package Door;
import java.util.Scanner;
public class Door1 {
   boolean status;
    Lock lockobj;
    class Lock{
        //Output obj;
       // private boolean status;
//        public void setcon(boolean status){
//            this.status=status;
//        }
//        public boolean getcon()
//        {
//            return status;
//        }
         Lock(boolean status){
             Output obj=new Output(status);
         }

    }
    public Door1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your status");
        boolean status=sc.nextBoolean();
        lockobj=new Lock(status);
       // lockobj.setcon(status);
       // System.out.println(lockobj.getcon());
    }
}
