package Day17;

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
    B(){
        System.out.println("DCB");
    }
    B(int a){
        System.out.println("PCB");
        this.a = a;
    }
}

public class inherit {
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
