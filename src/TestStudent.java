import First.Stud;
public class TestStudent extends Stud{


    public TestStudent(int rollno, String name) {
        super(rollno, name);
    }

    public static void main(String[] args) {
        TestStudent obj=new TestStudent(10,"Krati");
        System.out.println(obj.rollno);
        obj.display();
    }
}
