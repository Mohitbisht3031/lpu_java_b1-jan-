package Day3;

class metric{
    int kms;
    int m;
    void set(int km,int me){
        kms = km;
        m= me;
    }

}

class Imperial{
    int miles;
    int foot;
    void set(int m,int f){
        miles = m ;
        foot = f;
    }
    Imperial(){}
    Imperial(metric m){
        miles = (m.kms)/(int)1.6;
        foot = (m.m*(int)3.2);
    }
}
public class CtoC {
    public static void main(String[] args) {
        metric m = new metric();
        m.set(10, 5);
        Imperial i = new Imperial();
        i.set(5, 15);
        System.out.println("the value of i is" + i.miles +"," + i.foot);
        i = new Imperial(m);
        System.out.println("the value of i is" + i.miles +"," + i.foot);
    }
}
