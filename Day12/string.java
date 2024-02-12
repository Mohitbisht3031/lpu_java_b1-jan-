public class string {
    public static void main(String[] args) {
        // String s = "My name is Mohit!!";
        // String str = s.substring(1,5); // substr(startInd);
        String s1= "Mohit";
        String s2 = new String("MOHIT");
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("same!");
        }else System.out.println("same same but different !!");
    }
}
