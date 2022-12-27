package LeetcodeQues;
import java.util.HashMap;
import java.util.Map;

public class ArithmeticSubsequence {
    public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        long ans = 0;
        Map<Integer,Integer>[] count = new Map[n];
        for(int i = 0;i<n;i++){
            count[i] = new HashMap<>(i);
            for (int j = 0; j <i; j++) {
                long d = (long)nums[i]-(long)nums[j];
                if(d < Integer.MIN_VALUE || d > Integer.MAX_VALUE){
                    continue;
                }
                int cd = (int)d;
                int sum = count[j].getOrDefault(cd,0);
                int a = count[i].getOrDefault(cd,0);
                count[i].put(cd,a + sum + 1);
                ans+=sum;
            }
        }
        return (int)ans;
    }
    public static void main(String[] args) {

       int arr[] = {2,4,6,8,10};
       System.out.println(numberOfArithmeticSlices(arr));
    }
}
