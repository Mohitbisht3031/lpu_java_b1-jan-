// interface
interface Square {
    int square(int x);
}

public class ano {
    public static void main(String[] args) {
        
        Thread t = new Thread(new Runnable() {
            public void run(){
                System.out.println("RT");
            }            
        });
        t.start();
        System.out.println("MT");
        // Square obj = new Square() {
        //     public int square(int x){
        //         return x*x;
        //     }
        // };
        // System.out.println(obj.square(10));
    }
}
