public class AA
{
    int x = 10;
}
class BB extends AA
{
    int x = 20;
    public static void main(String[] args)
    {
        AA a = new AA();
        System.out.println(a.x); // Output: 10, "Parent's Instance Variable"

        BB b = new BB();
        System.out.println(b.x); // Output: 20, "Child's Instance Variable"

        AA a1=new BB();
        System.out.println(a1.x); // Output: 10, "Child's Instance Variable".
    }
}