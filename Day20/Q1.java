package Day20;

import java.util.Arrays;

/*
 * given an array of even length dived into 2 array based on the following rule
 * 1. both the array should contain unique element
 * 2. both should be of same size
 */
public class Q1 {
    // brute force -> TC : O(n^2)
    boolean isDividable(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int c = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[j] == arr[i])c++;
            }
            if(c > 2)return false;
        }
        return true;
    }

    // TC:O(nlogn)
    boolean isDividable2(int arr[]){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-2;i++){
            if(arr[i] == arr[i+2])return false;
        }
        return true;
    }

// int freq[] = new int[100000000]
    public static void main(String[] args) {
        
    }
}
