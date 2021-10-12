public class Maini5767 {
    public static void main(String[] args) {
        Outer76 obj=new Outer76();
        obj.display();
      //  Inner34.this.
      Outer76.Inner34 ob=obj.new Inner34();
      ob.display();
    }
}
class Outer76{
    public void display(){
        System.out.println("inside outer class");
    }
    class Inner34{
        public void display(){
            System.out.println("inside inner class");
        }
    }
    Outer76(){
    //    new Inner34().display();
    }
}
