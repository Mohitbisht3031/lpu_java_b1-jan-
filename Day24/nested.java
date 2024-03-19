package Day24;

// normal nested class
class OC{
    int val = 10;
    class NC{
        void print(){
            System.out.println("the value is "+val);
        }
        void setVal(int x){
            val = x;
        }
    }
}

class OC2{
    static int val = 10;
    static class NC2{
        void print(){
            System.out.println("the value is "+val);
        }
        void setVal(int x){
            val = x;
        }
    }
}

public class nested {
    public static void main(String[] args) {
        OC2.NC2 obj = new OC2.NC2();
        obj.print();
        obj.setVal(11);
        obj.print();

    }
}

// example for creating a NC which is not static
// public class nested {
//     public static void main(String[] args) {
//         OC obj = new OC();
//         OC.NC obj2 = obj.new NC();
//         obj2.print();
//         obj2.setVal(11);
//         obj2.print();
//     }
// }
