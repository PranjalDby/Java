package LeetcodeQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingDuplicates {
    public static List<Integer> findDuplicate(int arr[],int size){
        int p1 = 0;
        int p2 = size-1;
        List<Integer>indexlis= new ArrayList<>();
        Arrays.sort(arr);
        while(p1!=size && p2!=p1){
            System.out.println(p1+":"+p2);
            if(arr[p2] == arr[p1]){
                indexlis.add(arr[p1]);
                size--;
            }
            if(p2 == p1+1){
                p2 = size;
                p1+=1;
            }
            p2--;
        }
        return indexlis;
    }
    public static void main(String[] args) {
        int arr[] = {9,9,4,10,8,5,2,2,7};
        int size = arr.length;
        System.out.println(findDuplicate(arr, size));
    }

}
