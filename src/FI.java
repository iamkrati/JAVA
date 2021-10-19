public class FI {
    public static void main(String[] args) {
        i11 obj=() -> System.out.println("Hello");
        obj.m1();
    }
}
@FunctionalInterface
interface i11 {
    public void m1();
    //public void m2();
}
