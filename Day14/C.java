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

    //diff type of arg
    // diff no. of args
    // both
    int max(int a,int b){
        return (a >= b ? a : b);
    }
    int max(int a,int b,int c){
        if(a >= b){
            if(a >= c)return a;
            else return c;
        }
        return (b >= c ? b : c);
    }
    int max(int a,int b,int c,int d){
        return max(max(a,b,c),d);
    }

    int max(int a,int b,int c,int d,int e){
        return max(max(a,b,c,d),e);
    }
}

enum Designation{
    CEO,CFO,CTO;
}

public class C {
    public static void main(String[] args) {
        
    }    
}
