import java.util.Scanner;

public class Boxx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Boxes obj=new Boxes();
        obj.height=sc.nextFloat();
        obj.length= sc.nextFloat();
        obj.width=sc.nextFloat();
        System.out.println("AREA=");
        System.out.println(obj.area());
        System.out.println("VOLUME=");
        System.out.println(obj.volume());
    }

}
class Boxes{
    float width;
    float length;
    float height;
    public float area(){
        float area;
        area=2*(length*width+width*height+height*length);
        return area;
    }
    public float volume(){
        float volume;
        volume=length*width*height;
        return volume;
    }
}
