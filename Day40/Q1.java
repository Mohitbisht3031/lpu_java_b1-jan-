package Day40;

import java.io.File;
import java.util.Scanner;
public class Q1 {
    static String getNum(String str){
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                int j = i;
                for(;j<str.length();j++){
                    if(str.charAt(i) >= '0' && str.charAt(i) <= '9')s.append(str.charAt(j));
                    else break;
                }
                i = j;
                s.append(' ');
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        try{
            File obj = new File("SonuDON.txt");
            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine()){
                // System.out.println(sc.nextLine());
                String str = sc.nextLine();
                System.err.println(getNum(str));
            }
            sc.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
