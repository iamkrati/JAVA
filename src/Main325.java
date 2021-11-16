public class Main325 {
    public static void main(String[] args) {
        Override1 obj1=new Override1();
        obj1.m1();
        Override obj=new Override();
        obj.m1(7);

    }
}
class Override{
    int a;
    public void m1(int b){
        this.a=b;
        System.out.println(b);
        System.out.println(a);
    }
}
class Override1 extends  Override{
    public void m1() {
//      super.m1(5);
        System.out.println("jkhdfk");
    }
}