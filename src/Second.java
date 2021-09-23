import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
//         Person obj1=new Person();
//         Person obj2=new Person();
//        obj1.display();
//        obj2.display();
//        Person obj3=new Person(23,"KK",5);
//        obj3.display();
        Person arr[]=new Person[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Person();

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
        }
    }

}


class Person{
    int age;
    String name;
    float height;
    //String collegename;
    Person(){
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();
        name=sc.next();
        height=sc.nextFloat();
    }
    public void display()
    {
        System.out.println(age);
        System.out.println(name);
        System.out.println(height);

    }
//
//    public Person(int age, String name, float height) {
//        this.age = age;
//        this.name = name;
//        this.height = height;
//    }
}

