package Day34;
import java.util.*;
/*
 * given an integer array return an array of size 3 that will be consisting of 
 * 3 min elements from the given array
 */
public class Q1 {
    // Tc : O(nlogn) , SC : O(1)
    int[] min3(int arr[]){
        Arrays.sort(arr);
        int ans[] = new int[3];
        for(int i = 0;i<3;i++){
            ans[i] = arr[i];
        }
        return ans;
    }

    // TC : O(n) , SC : O(1)
    int[] min3_2(int arr[]){
        Queue<Integer> pq = new PriorityQueue<>((x,y) -> y-x);

        for(var e : arr){
            if(pq.size() < 3){
                pq.add(e);
            }else{
               if(pq.peek() > e){
                pq.poll();
                pq.add(e);
               } 
            }
        }

        int i =0;
        int ans[] = new int[3];
        Iterator<Integer>it = pq.iterator();
        while(it.hasNext()){
            ans[i] = it.next();
            i++;
        }
        return ans;
    }

}
