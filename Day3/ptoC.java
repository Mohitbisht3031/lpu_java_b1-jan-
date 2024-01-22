package Day3;
class A{
    int a;
    void setVal(int v){
        a = v;
    }
}
public class ptoC {
    public static void main(String[] args) {
        // A obj = 10; // not able to do autoboxing in user defined class
        A obj = new A();
        obj.setVal(10);
        System.out.println(obj.a);
    }
}
