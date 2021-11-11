public class StaandnonStatic {

    public static void main(String[] args) {
        StaandnonStaati obj=new StaandnonStaati();

    }
}
class StaandnonStaati{
    //Inner ob;
    int n2=20;
    class Inner{
        int n2=30;
        public  void display(){
            int n2=40;
            System.out.println(n2);
            System.out.println(this.n2);
            System.out.println(StaandnonStaati.this.n2);
        }
    }
    StaandnonStaati(){
        Inner ob=new Inner();
        ob.display();


    }
}
