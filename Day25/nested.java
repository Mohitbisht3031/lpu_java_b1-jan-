
class OC{
    static int val = 10;
    static class IC{
        void print(){
            System.out.println("the value is "+val);
        }
    }
}

public class nested {
    public static void main(String[] args) {
        // OC obj = new OC();
        OC.IC obj2 = new OC.IC();
        obj2.print();
    }
}
