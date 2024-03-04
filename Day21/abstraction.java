package Day21;

abstract class Person{
    String name;
    char sex;
    protected int noFr;

    abstract int numOfFr();
    void intro(){
        System.out.println("hey my name is "+this.name);
    }
}

class Sonu extends Person{

    Sonu(String name){
        this.name = name;
    }
    // int no.Fr
    int numOfFr(){
        return this.noFr;
    }
}


abstract class Branch{
    int noStaff;
    abstract void IFSC();
}

interface loan{
    int homeloan(int amount);
    int educationLoan(int amount);
}

interface creditCard {
    void gold(int salary);
    void silver(int salary);
}

class delhiBranch implements loan,creditCard{
    void IFSC(){
        System.out.println("xxxtttt");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Sonu obj = new Sonu("Sonu");
        obj.intro();
    }
}
