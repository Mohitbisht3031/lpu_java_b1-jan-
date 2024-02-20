/*
* given an int array having repetetive num
* one num is getting repeated n/2 number of time
* print the majority num frome the array(the num getting repeated more then n/2 number of time)
*/

import java.util.Arrays;

public class Q1 {
// brute force TC: O(n^2) -> O(1)
void majority(int arr[]){
for(int i = 0;i<arr.length;i++){
int c = 1;
for(int j = i+1;j<arr.length;j++){
if(arr[i]==arr[j])c++;
}
if(c >= arr.length/2){System.out.print(arr[i]);
break;
}
}
return;
}

// TC :O(nlogn) , SC(1)
void majority2(int arr[]){
Arrays.sort(arr);
int mid = (arr.length-1)/2;
System.out.print(arr[mid]);
}

// TC : O(N)
void majority3(int arr[]){
    int freq[] = new int[100000001];
    for(int i = 0;i<arr.length;i++){
        freq[arr[i]]++;
    }

    for(int i = 0;i<freq.length;i++){
        if(freq[i] >= (arr.length-1)/2){
            System.out.println(i);
        }
    }
    return;
}

// TC : O(N) , SC: O(1)
void majority4(int arr[]){
    int c = 1;
    int n = arr[0];
    for(int i = 1;i<arr.length;i++){
        if(n == arr[i])c++;
        else c--;
        if(c==0){
            c = 1;
            n = arr[i];
        }
    }

    System.out.println(n);
}

public static void main(String[] args){

}
}