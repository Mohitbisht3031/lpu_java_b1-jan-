package Day24;
//way1
/*
public class threads extends Thread{
    public void run(){
        System.out.println("child thread");
    }
    public static void main(String[] args) {
        threads t = new threads();
        t.start();
        System.out.println("main thread!");
    }
}
*/
// way2
/*
public class threads implements Runnable{
    public void run(){
        System.out.println("CT");
    }

    public static void main(String[] args) {
        threads t = new threads();
        Thread T = new Thread(t);
        T.start();
        System.out.println("MT");
    }
}*/

// way 3 using lamba expression
public class threads{
    public static void main(String[] args) {
        Runnable obj = () -> {
            System.out.println("RIT");
        };
        Thread t = new Thread(obj);
        t.start();
        System.out.println("MT");
    }
}