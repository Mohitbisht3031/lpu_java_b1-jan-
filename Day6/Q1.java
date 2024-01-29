package Day6;
/*
 * take int i/p (n) from the user and then print that nth num from the fib series
 * t1:
 *  n= 0 -> o/p= 1
 * n = 2 -> o/p =2
 * n = 4 -> o/p = 3
 */

import java.util.Scanner;

public class Q1 {
    // recursive method
    int fib(int n){
        if(n < 0)return -1;
        if(n <=1)return 1;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = sc.nextInt();
        Q1 obj = new Q1();
        int v = obj.fib(n);
        if(v == -1)System.out.println("enter correct value");
        System.out.println("the requried num is :" +v);
        // int a = 1;
        // int b = 1;
        // if(n <= 1)System.out.println(n+"th fin digit is : "+a);
        // for(int i = 0;i<=n-2;i++){
        //     int s = a+b;
        //     a = b;
        //     b = s;
        // }
        // System.out.println(n+"th fin digit is : "+ b);
        sc.close();
    }
}
