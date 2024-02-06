package Day10;

public class mutli {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5},{6,7,8,9}};

        //premitive for
        // for(int i = 0;i<arr.length;i++){
        //     for(int j = 0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //for each / enhanced for
        for(var ar : arr){
            for(var e : ar)System.out.print(e);
            System.out.println();
        }

    }
}
