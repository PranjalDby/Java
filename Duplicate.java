package LeetcodeQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {
    public static List<Integer>dupli(int arr[],int size){
        List<Integer>lis = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                lis.add(arr[i]);
            }
        }
           return lis;
    }
    public static void main(String[] args) {
        int arr[] = {9,9,4,10,8,5,2,2,7};
        int size = arr.length;
    System.out.println(dupli(arr, size));

    }
}
