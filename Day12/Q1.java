/*
 * return the index of 1st unique char of the string or -1 if no uniquew char
 */

public class Q1 {
    // TC:O(n^2) -> ???
    void unique(String s){
        int ind = -1;
        for(int i = 0;i<s.length();i++){
            boolean f  = false;
            for(int j = 0;j<s.length();j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    f = true;
                    break;
                }
            }
            if(!f){
                ind = i;
                break;
            }
        }
        if(ind != -1)System.out.println("the ind of unique char is "+ind);
        else System.out.println("no unique char "+ind);
    }

// Appraoch 2 , TC : O(n) , SC : O(1)
    void unique2(String s){
        int ind = -1;
        int freq[] = new int[26];
        for(int i = 0;i<s.length();i++)freq[s.charAt(i) - 'a']++;
        for(int i = 0;i<s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                ind = i;
                break;
            }
        }
        if(ind != -1)System.out.println("the ind of unique char is "+ind);
        else System.out.println("no unique char "+ind);
    }

    public static void main(String[] args) {
        
    }
}
