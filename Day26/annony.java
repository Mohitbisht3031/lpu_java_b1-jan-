package Day26;

public class annony {
    public static void main(String[] args) {
        // annony. class which extends class
        // Thread t = new Thread() {
        //     public void run(){
        //         System.out.println("from the run of thread classs!!!");
        //     }
        // };

        // annony. clas which implements an interface
        // Runnable r = new Runnable() {
        //     public void run(){
        //         System.out.println("from the run of runnable interface!!!");
        //     }
        // };
        // Thread t = new Thread(r);

        // annony . class that is implemented in the arg / const.
        Thread t= new Thread(new Runnable() {
            public void run(){
                System.out.println("from the run of runnable interface in the arg!!!");
            }
        });

        t.start();
        System.out.println("main thread");
    }
}
