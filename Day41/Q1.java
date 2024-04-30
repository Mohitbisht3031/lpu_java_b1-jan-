package Day41;

/*
 * given a string s , return true if it is a good string otherwise false
 * a string can only be good if atmost 1 character in it is occuring odd number of times
 */

public class Q1 {
    // TC : O(n^2) , SC : O(1)
    boolean checkGood(String str){
        int odd = 0;
        for(int i = 0 ;i<str.length();i++){
            int c = 0;
            for(int j = 0;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j))c++;
            }
            if((c&1) == 1)odd++;
        }
        return odd == 1;
    }

    // TC : O(n) , SC : O(26) ~ O(1)
    boolean checkGood2(String str){
        int arr[] = new int[26];
        for(int i = 0;i<str.length();i++){
            int ind = str.charAt(i) - 'a';
            arr[ind]++;
        }
        int odd = 0;
        for(int i = 0;i<26;i++){
            if(arr[i] > 0 && (arr[i]&1) == 1)odd++;
        }

        return odd == 1;
    }
}
