
/*
 * given an integer n, we are supposed to find a pivot element x between 1 and n
 * such that the sum from 1 to x and sum from x to n is equal and if no such element
 * is there return -1;
 */

public class Q1{
    // TC : O(n) , SC : O(1)
    int pivot(int n){
        int ts = (n*(n+1))/2 ;
        int cs = 0;
        for(int i = 1;i<n;i++){
            cs+=i;
            if(cs == (ts-cs)+i)return i;
        }
        return -1;
    }

    // TC : O(logn) , SC:O(1)
    int pivot2(int n){
        int s = 1;
        int e = n;
        int ts = (n*(n+1))/2;
        while(s <= e){
            int mid = ((e-s)+s)/2;
            int cs = (mid*(mid+1))/2;
            if(cs == (ts-cs)+mid)return mid;
            else if(cs < (ts-cs)+mid)s = mid+1;
            else e = mid-1;
        }
        return -1;
    }

}