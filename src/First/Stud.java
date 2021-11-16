package First;

public class Stud {
    protected int rollno;
    public String name;
    public Stud(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public void display(){
        System.out.println(rollno);
        System.out.println(name);
    }
}

