package Day18;

import java.util.Scanner;

/*
 * make a shape class
 * inherit it to make square and triangle class
 */
class Shape{
    int sides;
    void calArea(){
        System.out.println("calculating area");
    }

    void calPrimeter(){
        System.out.println("calculating perimeter");
    }

    int getsides(){
        return sides;
    }

}

class Triangle extends Shape{
    Triangle(int s){
        this.sides = s;
    }

    void calArea(){
        Scanner sc = new Scanner(System.in);
        int h;
        int b;
        System.out.println("please enter the height of the tri");
        h = sc.nextInt();
        System.out.println("please enter the base of the tri");
        b = sc.nextInt();
        System.out.println("area of the given triangle is : "+(0.5*(b*h)));
        sc.close();
    }

    void calPrimeter(){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("please enter the side 1 of the tri");
        a = sc.nextInt();
        System.out.println("please enter the side 2 of the tri");
        b = sc.nextInt();
        System.out.println("please enter the side 3 of the tri");
        c = sc.nextInt();
        System.out.println("primeter of the given triangle is : "+(a+b+c));
        sc.close();
    }

    int getsides(){
        return this.sides;
    }

}

public class Q1 {
    
}
