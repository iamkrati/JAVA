class Check{
    public static  void main(String[] args) {
        In obj=new In();
        obj.m2();
        obj.m1();
    }
}
class Inherit {
    int a = 10;
    public void m1() {
        System.out.println(a);
    }
}
class In extends Inherit{
    public void m1() {
        a=100;
        super.m1();
    }
    public void m2(){
        System.out.println(a);
    }
}
