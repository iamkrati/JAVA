public class Hiding {
    public static void main(String[] args) {
        Vehicle ob=new Car();
        ob.engine();
    }
}
class Vehicle{
    public static void engine(){
        System.out.println("engine in parent");
    }

}
class Car extends  Vehicle{
   public static void engine(){
       System.out.println("engine in child");
  }
}


