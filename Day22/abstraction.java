package Day22;

interface loan{
    void homeLoan(int x);
    void studentLoan(int x);
}

interface creditCard{
    void gold();
    void silver();
}

abstract class bankHead{
    void deposit(int x){
        System.out.println("depsoitied "+x + "amount in your acc");
    }
    void withdraw(int x){
        System.out.println("deducted "+x + "amount from your acc");
    }

    abstract String getIFSC();

}

class bankBranch1 extends bankHead implements creditCard{
    String getIFSC(){
        return "DELXXXX";
    }
    public void gold(){
        System.out.println("The limit is "+100000000);
    }
    public void silver(){
        System.out.println("the limit is "+10000);
    }
} 

public class abstraction {
    
}
