public class AbstractDemo {
    public static void main(String[] args) {
       B b=new B();
       b.m1();
       b.m2();
    }
}
abstract class A{
    int a=10;
    abstract void m1();
    void m2()
    {
        System.out.println("CONCRETE METHOD");
    }
}
class B extends A{
    void m1(){
        System.out.println("abstract methood");
    }
//    @Override
//    void m2() {
//        super.m2();
//    }
}
