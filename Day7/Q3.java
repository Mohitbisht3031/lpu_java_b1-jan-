package Day7;

import java.util.Scanner;

/**
 * r=3 ->      *
 *            * *
 *           * * *
 */
public class Q3 {
    void print(int r){
        for(int i = 0;i<r;i++){
            for(int j = 1;j<(r-i);j++)System.out.print(" ");
            for(int j = 0;j<=i;j++)System.out.print("* ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Q3 obj = new Q3();
        obj.print(r);
        sc.close();
    }
    
}