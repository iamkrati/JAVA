package _Exception_;

public class CE1
{
    public static void main(String[] args)
    {
        System.out.println("Hello Java");
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException OBJ)
        {
            OBJ.printStackTrace();
        }
    }
}
