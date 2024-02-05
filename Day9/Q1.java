
/* 
 * -> given an array of length n ,all the elements in the array is in range [1,n]
 * -> in the array due to error one element got repeated and one got missing
 * -> tell the missing anad repeated element from the arr
 */

public class Q1 {
    // approach 1 -> TC : O(n^2) , SC : O(1)
    void findMissRepeat(int arr[]){
        int r = 0;
        int m = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    r = arr[i];
                    break;
                }
            }
            if(r != 0)break;
        }
        for(int i = 1;i<=arr.length;i++){ //[1,n]
            boolean f = false;
            for(int  j =0;j<arr.length;j++){
                if(arr[j] == i){
                    f = true;
                    break;
                }
            }
            if(f){
                m = i;
                break;
            }
        }

        System.out.println("the missing element is "+m + " the repeated element is "+r);

    }

    // approach 2 -> TC : O(N) , SC : O(n)
    void findMissRepeat2(int arr[]){ 
        int r = 0;
        int m = 0;
        int freq[] = new int[arr.length+1];
        for(int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
            if(freq[arr[i]] == 2)r = arr[i];
        }
        for(int i = 1;i<=arr.length;i++){
            if(freq[i] == 0){
                m = i;
                break;
            }
        }
        System.out.println("the missing element is "+m + " the repeated element is "+r);
    }   

    public static void main(String[] args) {
        
    }
}
