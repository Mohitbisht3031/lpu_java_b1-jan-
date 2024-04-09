package Day32;

import java.util.*;
// import javax.swing.text.html.HTMLDocument.Iterator;

public class MAP {
    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("Mohit",3);
        hm.put("Sonu",4);
        hm.put("Mohit",5);
        // hm.remove("Mohit");
        // System.out.println(hm + " "+ hm.size() + hm.containsKey("Mohit") + hm.isEmpty());
        // hm.clear();
        // System.out.println(hm + " "+ hm.size() +" "+ hm.isEmpty());

        // for(Map.Entry<String,Integer> e : hm.entrySet()){
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }

        Iterator<Map.Entry<String,Integer>> it = hm.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String,Integer> e = it.next();
            System.out.println(e.getKey() + " "+e.getValue());
        }

    }
}
