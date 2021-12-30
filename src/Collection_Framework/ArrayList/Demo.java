package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(5);
        obj.add(14);
        System.out.println(obj);
        obj.set(1,50);
        System.out.println(obj);
        obj.remove(1);
        obj.add(24);
        System.out.println(obj);

    }
}
