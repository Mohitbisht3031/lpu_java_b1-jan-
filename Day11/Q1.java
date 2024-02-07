package Day11;

public class Q1 {
    // example of varargs
    int max(int... val){
        int maxi = 0 ;

        System.out.println(val.length);
        for(int i = 0;i<val.length;i++){
            maxi = Math.max(maxi,val[i]);
        }
        return maxi ;
    }

    void print(String... val){
        for(var s : val){
            System.out.print(s+" ");
        }
        System.err.println();
        return;
    }
    public static void main(String[] args) {
        Q1 obj = new Q1();
        obj.print("hey","My ","name","is","Mohit!!");
    }
}
