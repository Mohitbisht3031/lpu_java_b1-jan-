package Day36;

/*
 * Given a char mat , and a string str
 * check if we can get continuous char from the mat who's concat will be equal to str
 * to check in continuous manner we can go to any of the 4 neighbours of my
 * current cell
 */
public class Q1 {
// TC : O(4^n)
    boolean check(char mat[][],int i,int j,String str,int si){
        if(si >= str.length())return true;
        if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] != str.charAt(si))return false;

        char ch = mat[i][j];
        mat[i][j] = '0';
        boolean ans = false;
        ans = ans || check(mat, i+1,j,str,si+1);
        ans = ans || check(mat, i-1,j,str,si+1);
        ans = ans || check(mat, i,j+1,str,si+1);
        ans = ans || check(mat, i,j-1,str,si+1);
        mat[i][j] = ch;

        return ans;
    }

    boolean check(char mat[][],String str){

        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == str.charAt(0)){
                    if(check(mat,i,j,str,0))return true;
                }
            }
        }

        return false;
    }
}
