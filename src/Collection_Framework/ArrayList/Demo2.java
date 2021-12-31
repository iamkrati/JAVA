package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2{
        public static void main(String[] args) {
                ArrayList<Integer> obj=new ArrayList<>();
                obj.add(1);
                obj.add(2);
                obj.add(3);
                Iterator<Integer> itr=obj.iterator();
                while(itr.hasNext())
                        System.out.println(itr.next());
        }
}
