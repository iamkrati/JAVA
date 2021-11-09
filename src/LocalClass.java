import java.util.Scanner;

public class LocalClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Door obj=new Door();
        obj.check(sc.next());
    }
}
class Door{
    public void check(String key)
    {
        class Lock{
            static String Passkey="YesAccess";
            public static void result(String tkey){
                if(Passkey.equals(tkey))
                    System.out.println("VALID");
                else
                    System.out.println("NOT VALID");
            }
        }
        Lock.result(key);
    }
}
