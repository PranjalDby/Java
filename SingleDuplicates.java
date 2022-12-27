package LeetcodeQues;

public class SingleDuplicates {
    public static void main(String[] args) {
        // constraints 
        // only single elements in arrray are duplicates or repeats
        int arr[] = {1,2,1,3,4};
        int s = arr.length-1;
        int prev = 0;
        int firs_prev = 0;
        int duplic = 0;
        for (int i = 1; i <=s; i++) {
           prev = arr[arr[i]];
           firs_prev = prev;
           if(firs_prev == prev){
            duplic = firs_prev;
            break;
           }
           
        }
        System.out.println(duplic);
    }
}
