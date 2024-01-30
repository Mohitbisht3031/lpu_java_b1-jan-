package Day7;
/*
 * take i/p of a numbr from the user and tell the user if the num is palindrome
 * or not
 * ex1: i/p = 121 o/p = "yes it is a palindrome"
 * ex2: i/p = 123 , o/p = " not a plaindrome"
 */

import java.util.Scanner;

public class Q1 {
    // approach 1
    boolean checkPalin(int n){
        int t = n;
        int nn = 0;
        while(n > 0){
            int d = n%10;
            nn*=10;
            nn+=d;
            n/=10;
        }
        return nn == t;
    }

    //approach 2
    boolean check(String s,int i,int e){
        if(i >= e)return true;
        if(s.charAt(i) != s.charAt(e))return false;
        return check(s,i+1,e-1);
    }

    boolean checkPalin2(int n){
        // Integer i = n;
        String s = Integer.toString(n);
        return check(s,0,s.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Q1 obj = new Q1();
        if(obj.checkPalin(n)){
            System.out.println("the given number is palindrome");
        }else{
            System.out.println("not a plaindrome");
        }
        sc.close();
    }
}
