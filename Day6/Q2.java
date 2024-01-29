package Day6;

import java.util.Scanner;

/*
 * take i/p a int from the user and then do digit some of that num , but u can only add even digit with even sum and odd digit in
 * odd sum.
 * n = 1234 -> es = 4+2->6 & od = 1+3 ->4
 */
public class Q2 {
    void sum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int es = 0;
        int os = 0;
        while(n > 0){
            int d = n%10;
            if((d&1) == 0)es+=d;
            else os+=d;
        }
        System.out.println("even digit sum is : "+es +" odd digit sum is : "+os);
        sc.close();
    }
    public static void main(String[] args) {
        Q2 obj = new Q2();
        obj.sum();
    }
}
