package LeetcodeQues;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static List<Integer>  getNum(int arr[],int size){
        int ht2[] = new int[size + 1];
        List<Integer>arrays = new ArrayList<>();
        for(int i =0;i<ht2.length;i++){
            ht2[i] = -1;
        }
        for(int i = 0;i<size;i++){
            ht2[arr[i]]  = arr[i];
        }
        for(int i = 1;i<ht2.length;i++){
            if(ht2[i]==-1){
                arrays.add(i);
            }
        }
        return arrays;
    }
    public static void main(String[] args) {
        int arr[] = {1,1};
        int size = arr.length;
        System.out.println(getNum(arr, size));
    }
}
