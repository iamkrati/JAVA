import java.util.Scanner;

public class LocalClass1 {
    public static void main(String[] args) {

        Door1 obj=new Door1();
        obj.check();
    }
}
class Door1{
    public void check()
    {
        class Lock{
            String key;
            Lock(){
                Scanner sc=new Scanner(System.in);
                key=sc.next();
            }
            static String Passkey="YesAccess";
            public void result(){
                if(Passkey.equals(key))
                    System.out.println("Door Opened");
                else
                    System.out.println("Wrong Password");
            }
        }
        new Lock().result();
    }
}

