public class Anon {
    public static void main(String[] args) {
        // i11 obj=() -> System.out.println("Hello");
        i111 obj = new i111() {
            @java.lang.Override
            public void m1() {
                System.out.println("hello");
            }
        };
        obj.m1();

    }
}
@FunctionalInterface
interface i111 {
    public void m1();
    //public void m2();
}