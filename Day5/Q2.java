/*
 * taking i/p of weight and height from user and cal. BMI and telling if he is fit 
 * skinny or obese . using switch
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();
        int bmi = (w / (h*h));
        switch (bmi) {
            case 18:
                System.out.println("you are skinny!!");
                break;
            case 22:
                System.out.println("you are fit!!");
                break;
            default:
                System.out.println("You are obese!!!");
        }
    }
}
