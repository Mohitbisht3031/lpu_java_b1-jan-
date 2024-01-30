package Day7;

import java.util.Scanner;

/*
 * take i/p of rows from the user and them print the pattern
 * r = 2 -> *
 *          * *
 * 
 * r = 4 -> *
 *          * *
 *          * * *
 *          * * * *
 */
public class Q2 {
    void Printpatter(int r){
        for(int i = 0;i<r;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Q2 obj = new Q2();
        obj.Printpatter(r);
        sc.close();
    }
}
