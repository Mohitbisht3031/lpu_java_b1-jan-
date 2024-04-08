package Day30;

import Day30.Sonu;

public class EXconti {
    int D(int v) throws Sonu{
        // if(v == 0)throw new Sonu("Mere ilake me aane ka nhi !!");
        assert v==0 : "Mere ilake me aane ka nhi !!";
        return v;
    }


    
    public static void main(String[] args) {
        EXconti obj = new EXconti();
        try{
            obj.D(0);
        } catch (Sonu ex){
            System.out.println("Sonu wants to say "+ex.getMessage());
        }
    }

}
