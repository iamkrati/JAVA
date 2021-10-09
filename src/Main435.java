import javax.xml.namespace.QName;

public class Main435 {
    public static void main(String[] args) {
        Over obj=new Over();
        obj.m1();
        obj.m1("krati");
    }

}
class Over{
    int a;
    String Name;
    public void m1(){
        a=10;
        System.out.println(a);
    }
    public void m1(String na){
        this.Name=na;
        System.out.println(na);
        System.out.println(Name);
//        );
    }
}
