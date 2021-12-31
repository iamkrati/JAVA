package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(1);
        obj.add(8);
        obj.add(0);
        ListIterator<Integer> list1=obj.listIterator();
        while(list1.hasPrevious())
        {
            int str=list1.previous();
            System.out.println(str);
        }
    }
}
