public class Test245 {
    public static void main(String[] args) {
        TesstChild obj=new TesstChild();
        obj.square();
    }
}
interface Tesst{
    void square();
}
class TesstChild implements Tesst{
    //@Override
    public void square() {
        System.out.println("square  method ");
    }
}
