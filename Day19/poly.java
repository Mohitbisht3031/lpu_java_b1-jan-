package Day19;

class Animal{
    // parent class method
    void speak(){
        System.out.println("animal speaks!!");
    }
}

class Dog extends Animal{
    // redefined -> overriding!
    @Override
    void speak(){
        System.out.println("Dog barks");
    }
}

public class poly {
    // method overloading -> compile time poly
    // 1. same sign. with different no. of parameters
    // 2. or different type of args
    // 3. both
    int max(int a,int b){
        return (a>=b ? a : b);
    }

    int max(int a,int b,int c){
        return max(max(a,b),c);
    }

    public static void main(String[] args) {
        // Animal a = new Dog();
        // Dog d = new Animal(); 
        // a.speak();
        // d.speak();        
    }

}
