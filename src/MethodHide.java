public class MethodHide {
    public static void main(String[] args) {
        ChildMethodClass ob=new ChildMethodClass();
        ob.printMessage();
    }
}
class BaseMethodClass {

    public static void printMessage() {
        System.out.println("base static method");
    }
}
class ChildMethodClass extends BaseMethodClass {

    public static void printMessage() {
        //  super.printMessage();
        System.out.println("child static method");
    }
}