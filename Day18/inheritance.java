package Day18;

class A{
    int a;
    A(){
        System.out.println("DCA");
    }
    A(int a){
        System.out.println("PCA");
        this.a = a;
    }
}

class B extends A{
    B(int a){
        super(a);
        System.out.println("PCB");
    }
}

public class inheritance {
    public static void main(String[] args) {
        B obj = new B(10);
        System.out.println(obj.a);
    }
}
