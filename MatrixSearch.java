package LeetcodeQues;

public class MatrixSearch {
    public static void main(String[] args) {
        int matr[][] = {
            { 1, 2, 3, 4},
            { 8, 9,10,11},
            { 12,13,14,15}
        };
    int row = 0;
    int col =0 ;
    int flag = -1;
    int colsize= matr[0].length;
    while (col!=colsize) {
        if(matr[row][col] == 5){
            flag = 1;
            break;
        }
        else if (col == colsize-1){
            col = -1;
            if(row <=matr.length-1){
                row++;
            }
        }
        if(row == matr.length){
            break;
        }
        col++;
    }
    if(flag == 1){
        System.out.println("we Found The element");
    }
    else{
        System.out.println("Not Found");
    }
        int arr[] = {2,1,6,8,5};
        int p1 = 0;
        int p2 = 1;
        int seconda[] = new int[arr.length];
        for (int i = 0; i <=(arr.length-1)/2; i++) {
            if(arr[p1] >=arr[p2]){
                int temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
            }
            p1= p2;
            p2+=1;
        }
        for (int i = (arr.length-1)/2+1; i<arr.length-1; i++) {
            if(arr[p1] >=arr[p2]){
                int temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
            }
            p1= p2;
            p2+=1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    

    }
}
