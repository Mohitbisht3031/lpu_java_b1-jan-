package Day13;

class Person_10{
    public String name;
    private int age;
    public char sex;
    protected int stnd;
    //initilizer block
    {
        stnd = 10;
        age = 100;
        System.out.println("age rn is "+age);
    }
    // Default cont.
    public Person_10(){
        System.out.println("default const");
    }

    public Person_10(String name,int age,char sex){
        System.out.println("parametize const.");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void setter(int a){
        age = a;
    }

    int getter(){
        return age;
    }
}

public class C {
    public static void main(String[] args) {
        Person_10 p = new Person_10(); //default const.
        p.name = "Sonu don";
        p.sex = 'M';
        p.setter(20);
        System.out.println(p.name+" "+p.getter()+" "+p.sex+" "+p.stnd); // Sonu don 20 M   
        Person_10 p2 = new Person_10("Sonu" , 20,'M'); // parametrize const.
        System.out.println(p2.name+" "+p2.getter()+" "+p2.sex+" "+p.stnd); //Sonu 20 M
    }
}
