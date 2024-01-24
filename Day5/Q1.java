/*
 * taking i/p of weight and height from user and cal. BMI and telling if he is fit 
 * skinny or obese . using if & else
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        sc.close();
        double bmi = (w / (h*h));
        if(bmi < 18){
            System.out.println("you are skinny!!");
        }else if(bmi <= 22){
            System.out.println("You are fit!!");
        }else System.out.println("You are obese!!");
    }
}
