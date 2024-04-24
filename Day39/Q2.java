package Day39;
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
}
