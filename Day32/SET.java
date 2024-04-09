package Day32;

import java.util.*;

public class SET {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(3);
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        lhs.add(3);
        lhs.add(1);
        lhs.add(-1);
        lhs.add(100);
        ts.add(3);
        ts.add(1);
        ts.add(-1);
        ts.add(100);
        // hs.clear();
        System.out.println(ts + " "+ ts.size() + ts.contains(4));
        Integer arr[] = Arrays.copyOf(ts.toArray(), ts.size() , Integer[].class);
        ts.toString();

        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(ts));
        // for(var e : hs){
        //     System.out.println(e);
        // }

        // Iterator<Integer> it = hs.iterator();
        // System.out.println("outside" + it.next());
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
    }
}
