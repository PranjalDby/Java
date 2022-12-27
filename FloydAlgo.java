package LeetcodeQues;

public class FloydAlgo {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        int slow = 0;
        int fast =0;
        int dupli = 0;
        while(true){
            slow = arr[slow];
            fast = arr[arr[fast]];
            if(slow == fast){
                break;
            }
        }
        int slow2=0;
        while(true){
            slow = arr[slow];
            slow2 = arr[slow2];
            if(slow == slow2){
                dupli = slow;
                break;
            }
        }
        System.out.println(dupli);
    }
}
