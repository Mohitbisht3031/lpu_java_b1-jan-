public class multi {
    public static void main(String[] args) {
        // way1
        // int arr[][] = {{1,2,3},
        //             {4,5,6},
        //             {7,8,9}};
        // way2
        int arr[][] = new int[3][3];
        // int arr2[3][3];
        // for(int i = 0;i<arr.length;i++){
        //     for(int j = 0;j<arr[0].length;j++)System.out.print(arr[i][j]);
        //     System.out.println();
        // }
        for(int[] a : arr){
            for(int e : a)System.out.print(e);
            System.out.println();
        }
    }
}
