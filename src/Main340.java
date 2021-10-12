import java.util.Scanner;

public class Main340 {
    public static void main(String[] args) {
        Point obj11=new Point();
        Point obj111=new Point(5,4);
    }
}
class Point{
    private int x;
    private int y;
    public void setxy(int x,int y){
        this.x=x;
        this.y=y;

        System.out.println("value of x "+x+"value of y "+y);
    }
    public void setx(int x){
        this.x=x;
        System.out.println("value of x"+x);
    }
    public void sety(int y)
    {
       this.y=y;
        System.out.println("value of y"+y);
    }
    public Point(){
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y= sc.nextInt();
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
        setxy(x,y);
        setx(x);
        sety(y);
    }
}