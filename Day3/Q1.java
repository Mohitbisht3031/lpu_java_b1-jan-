/*
 * Take an int i/p from the user and print it's corresponding char value in the o/p
 */
package Day3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char ch = (char)a;
        System.out.println("characted corresponding to the given i/p is " + ch);
        sc.close();     
    }
}
