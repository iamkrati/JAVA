public class MethodHide1 {
    public static void main(String[] args) {
        Over13.m1();

    }
}
class Over45{
    public static  void m1(){
        System.out.println("inside parent class");
    }
}
class Over13 extends Over45 {
    public static void m1() {
        System.out.println("inside child class");
    }
}

