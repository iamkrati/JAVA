package _Exception_;

class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        super(str);
    }
}
public class TestThrow
{
    public static void main(String args[])
    {
        try
        {
            throw new UserDefinedException("This is user-defined exception");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Caught the exception");
        }
    }
}