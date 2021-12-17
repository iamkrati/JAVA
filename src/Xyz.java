class Xyz {
    public static void main(String[] args) {
        Main22 obj1=new Main22();
        obj1.m1();
        Main obj=new Main();
        obj.m1();
    }
}
class Main {
    int rollno;
   String name="aditya";
    void m1() {
       rollno = 8;
       name = "aditya";
       System.out.println(rollno + name);
   }
}
class Main22 extends Main{
    public void m1(){
        rollno=31;
        name="adi";
        System.out.println(rollno + name);
    }
}




