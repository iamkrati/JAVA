public class Simple {
    public static int a=10;
    public static void main(String[] args) {
       Main1 n=new Main1();
       n.test();
      // n.a=10;
       Main2 m=new Main2();
      // m.dis();
    }
}
class Main1{
    public void test(){
        //int a=18;
       // int a=18;
        System.out.println(Simple.a);
    }
}
class Main2{
   // System.out.println(" ");
    public void dis(int a)
    {
        System.out.println(a);
    }
}
