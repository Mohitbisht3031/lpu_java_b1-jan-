package Day26;

/*
 * Given an integer arr 
 * make an ans array of same leng where ith index will be consisting of 
 * product of all the element of the arr except the ith element
 */

public class Q1 {
    // brute force approach, TC : O(n^2) , SC : O(1) 
    int[] product(int arr[]){
        int ans[] = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            int p = 1;
            for(int j = 0;j<arr.length;j++){
                if(i == j)continue;
                p*=arr[j];
            }
            ans[i] = p;
        }

        return ans;
    }

    // optimized , TC : O(n) , SC :O(n)
    int[] product2(int arr[]){
        int ans[] = new int[arr.length];
        int suff[] = new int[arr.length];
        suff[arr.length-1] = 1;
        for(int i = arr.length-2;i>=0;i--){
            suff[i] = arr[i+1]*suff[i+1];
        }
        int p = 1;
        for(int i = 0;i<arr.length;i++){
            ans[i] = p*suff[i];
            p*=arr[i];
        }
        return ans;
    }

}
