package Day21;
/*
 * given a binary string and that string will be containng atleast one '1'
 * we are supposed to make a maximum possible binary string by rearranging the char
 *  
 * */
public class Q1 {
    // TC : O(N) && SC:O(N)
    String makeMaxOdd(String s){
        char ch[] = s.toCharArray();
        int c = 0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i] == '1')c++;
            ch[i] = '0';
        }

        ch[ch.length-1] = '1';
        c--;
        int i = 0;
        while(c-- > 0){
            ch[i] = '1';
            i++;
        }
        return ch.toString();
    }
    
}