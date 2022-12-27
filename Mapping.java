package LeetcodeQues;
import java.util.*;
public class Mapping {
    public static int rev(int num){
        int res = 0;
        int remainder =0;
        while (num!=0) {
            remainder = num % 10;
            res = res * 10  + remainder;
            num = num / 10;
        }
        if(res > Integer.MAX_VALUE/10){
            return 0 ;
        }
        if(res < Integer.MIN_VALUE/10){
            return 0;
        }
       return res;
    }
    public static void main(String[] args) {
        System.out.println(rev(
            123456));
    }
}
