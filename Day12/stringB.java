public class stringB {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Mohit");
        StringBuilder s2 = new StringBuilder("Mohit");
        // s.append(" Bisht");
        // System.out.println(s);
        // s2.append(" Negi");
        // System.out.println(s2);
        // if(s.compareTo(s2) == 0){
        //     System.out.println("same");
        // }else System.out.println("diff");
        // for(int i = 0;i<s.length();i++)System.out.println(s.charAt(i));
        for(char ch : s.toString().toCharArray())System.out.println(ch);
    }
}
