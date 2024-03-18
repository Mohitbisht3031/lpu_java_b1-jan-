 
 @FunctionalInterface
 interface loan{
    int salary = 10000;
    int homeLoan(int s);
 }

// class midClass implements loan{
//     public boolean homeLoan(int s){
//         return s>=salary ? true : false;
//     }
// }

public class Interface {
    public static void main(String[] args) {
        // midClass obj = new midClass();
        // obj.homeLoan(1000000);
        // loan obj = (int s) -> {
        //     if(s >= 10000)return true;
        //     return false;
        // };
        loan obj = (int s) -> s * s;
        int ans = obj.homeLoan(100);
        System.out.println(ans);
    }
}
