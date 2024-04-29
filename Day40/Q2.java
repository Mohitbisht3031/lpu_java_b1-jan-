package Day40;
/*
 * fing nth tribonachi number
 */
public class Q2 {
    int tri(int n){
        if( n == 0 || n <= 2)return (n == 0 ? 0 : 1);
        int n1 = tri(n-1);
        int n2 = tri(n-2);
        int n3 = tri(n-3);

        return n1+n2+n3;
    }

    // TC : O(N) , SC : O(N)
    int tri_2(int n){
        int arr[] = new int[n+1];
        // arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3;i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[n];
    }

    // O(n) , O(1).
    int tri_3(int n){
        int e1 = 0;
        int e2 = 1;
        int e3 = 1;
        for(int i = 3;i<=n;i++){
            int v = e1+e2+e3;
            e1 = e2;
            e2 = e3;
            e3  = v;
        }
        return e3;
    }
}

