import static java.lang.Math.*;
import  static  java.lang.System.*;
class StaticImp {
    public static void main(String[] args)
    {
        // We are calling static member of System class
        // directly without System class name
        out.println(sqrt(4));
        out.println(pow(2, 2));
        out.println(abs(6.3));
    }
}
