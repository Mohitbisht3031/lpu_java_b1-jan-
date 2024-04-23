import java.io.*;
import java.util.Scanner;

public class FILE {
    public static void main(String[] args) {
        try{
            File obj = new File("Saikat.txt");
            // FileWriter wrt = new FileWriter("Saikat.txt");
            // wrt.write("Saikat is a good student!!");
            // System.out.println("file generated!!!");
            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }   
}
