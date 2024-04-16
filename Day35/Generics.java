package Day35;

class Multiply<E>{
    E a;
    E b;
    Multiply(E a,E b){
        this.a = a;
        this.b = b;
    }
    void ans(){
        // return ;
        System.out.println(a+" "+b);
    }
}

class Person<E,V>{
    E name;
    V age;
    Person(E name , V age){
        this.name = name;
        this.age = age;
    }

    void intro(){
        System.out.println("My name is "+name + " my age is "+age);
    }

}

public class Generics {
    public static void main(String[] args) {
        Multiply<Double> obj = new Multiply(5.555, 5.555);
        Multiply<Integer> obj2 = new Multiply(5, 5);
        // // System.out.println("The product is "+obj.ans());
        // obj.ans();
        // obj2.ans();
        Person<String,Integer>p1 = new Person("Sonu", 19);
        Person<String,Double>p2 = new Person("Mohit", 32.5);
        p1.intro();
        p2.intro();
    }
}
