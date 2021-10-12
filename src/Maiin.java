import java.util.Scanner;

public class Maiin {
    public static void main(String[] args) {
        Box3d obj=new Box3d();
        obj.disp();
    }
}
class Box{
    float length;
    float breadth;
    float height;
    public  Box(){
        Scanner sc=new Scanner(System.in);
        length=sc.nextFloat();
        breadth=sc.nextFloat();
        height=sc.nextFloat();
    }
}
class Box3d extends Box{
    public void disp(){
        float area;
        float volume;
        area=(length*breadth)+(breadth*height)+(height*length);
        volume=length*breadth*height;
        System.out.println("area="+area+"volume="+volume);
    }
}












