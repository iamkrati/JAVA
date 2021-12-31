package Collection_Framework.ArrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        for(int i:obj)
            System.out.println(i);
    }
}
