package Day37;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filehandeling {
    public static void main(String[] args) {
        try{
            File f = new File("SonuDON.txt");
            if(f.createNewFile()){
                System.out.println("file generated!!");
            }
            else System.out.println("file is already there");
            FileWriter wrt = new FileWriter("SonuDON.txt");

            wrt.write("hey my name is Sonu don!! , juhk k rehna padega mere aage!!");

            wrt.close();
            if(f.canRead())System.out.println("we can read it");
            else System.out.println("can't read it");

            if(f.canWrite())System.out.println("we can write in it");
            System.out.println(f.length());
            System.err.println(f.getName());
            System.out.println(f.getAbsolutePath());
            // if(f.delete())System.out.println("deleted!!");
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            File obj = new File("SonuDON.txt");
            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(Exception ex){
            System.out.println(ex);
        }

        String str = "Sonu DON!!!!!";
        try{
            PrintWriter wrt = new PrintWriter("SonuDON.txt");
            wrt.write(str);
            wrt.flush();
            wrt.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
