package Day10;

/*
 *  -> given a mat
 *  -> tranform the mat according to the given condition
 *  -> convert the entire ith row and jth col into 0 if element i,j is a 0
 */

public class Q1 {
    //Approach1 -> TC : O(n^3) , SC : O(m*n)
    void change(int arr[][]){
        int nArr[][] = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == 0){
                    for(int k = 0;k<nArr.length;k++)nArr[k][j] = -1;
                    for(int k = 0;k<nArr[i].length;k++)nArr[i][k] = -1;
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(nArr[i][j] == -1)nArr[i][j] = 0;
                else nArr[i][j] = arr[i][j];
            }
        }

    }

    // approach2 , TC : O( N^2) , SC : O(N+M)
    void change2(int arr[][]){
        int r[] = new int[arr.length];
        int c[] = new int[arr[0].length];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == 0){
                    r[i] = -1;
                    c[j] = -1;
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(r[i] == -1 || c[j] == -1){
                    arr[i][j] = 0;
                }
            }
        }

        return;
    }
    public static void main(String[] args) {
        
    }
}
