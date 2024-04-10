import java.util.*;

public class QUEUE {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(1);
        ll.add(10);
        ll.add(50);
        ll.add(3);
        System.out.println(ll + " "+ll.size()); 
        System.out.println("front "+ ll.peek());
        System.out.println("removing "+ ll.remove());
        System.out.println(ll);

        // for(int i = 0;i<ll.size();i++)System.out.println(ll.get(i));
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
