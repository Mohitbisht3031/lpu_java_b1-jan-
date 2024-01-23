package Day4;
/*
 * ur supposed to take i/p of weight in(kgs) and height(m) of the user
 * return wwther the user is obese , fit or skinny according to the BMI
 *  bmi < 18 -> skinny
 *  bmi >= 18 && bmi <= 22 -> fit
 *  else obese
 * only use the things we have covered in the class
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double w = sc.nextDouble();
       double h = sc.nextDouble();
       sc.close();
       double bmi = w/(h*h);
       String ans = (bmi >= 18 ? (bmi <= 22 ? "Fit" : "obese") : "Skinny");
       System.out.println("According to ur BMI you are "+ans); 
    }
}
