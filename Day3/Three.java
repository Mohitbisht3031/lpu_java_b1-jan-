package Day3;
/**
 * Three
 */
public class Three {
    int money = 10;
    void debit(int v){
        System.out.println("Just for fun!!" + money);
    }
    // void fun2(){
    //     fun();
    // }
    public static void main(String[] args) {
        // fun();
        Three obj = new Three(); 
        System.out.println(obj.money);  
    }
    
}