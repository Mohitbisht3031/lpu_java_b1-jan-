package Day29;

public class EX {
    int div(int v1,int v2) throws Exception{
        // return v1/v2;
        if(v2 == 0)throw new Exception("you cannot divide it by 0");
        return v1/v2;
    }
    public static void main(String[] args) {
        EX obj = new EX();
        try{
            System.out.println(obj.div(1,0));
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally in the final block!!");
        }

        System.out.println("hey that was the div result!!");
    }    
}
