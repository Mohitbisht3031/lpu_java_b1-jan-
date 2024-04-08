import java.util.*;
public class ArrayL {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer>arr2 = new ArrayList<>(5);
        
        arr2.add(5);
        arr2.add(20);
        arr2.add(50);
        arr2.add(500);
        arr2.add(2,3);
        int arr3[] = new int [10]; 
        System.out.println(arr + " "+arr2.remove(4) + " "+arr2);
        for(int i = 0;i<arr2.size();i++){
            System.out.print(arr2.get(i)+" ");
        }
    }
}
