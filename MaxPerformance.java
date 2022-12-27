package LeetcodeQues;

import java.util.Queue;

import javax.management.Query;

import Ds.Heaps1;

public class MaxPerformance {
    public static void divide(int arr[],int low,int high){
        if(low>high){
            return;
        }
            int mid = low+(high-low)/2;
            divide(arr, low,mid-1);
            divide(arr,mid+1, high);
            conquer(arr, low, high, mid);
    }
    public static void conquer(int arr[],int low,int high,int mid){
        int res[] = new int[high-low+1];
        int x =0;
        int left=low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                res[x++] = arr[left++];
            }
            else{
                res[x++] = arr[right++];
            }
        }
        while(left<=mid){
            res[x] = arr[left];
            x++;left++;
        }
        while(right<=high){
            
            res[x++] = arr[right++];
            // x++;right++;
        }
        for (int i = 0,j=low; i < res.length; i++,j++) {
            arr[j] = res[i];
        }

    }
    public void divide_dsc(int arr[],int low,int high){
        if(low>high){
            return;
        }
        else{
            int mid = (high+low)/2;
            divide_dsc(arr, low,mid-1);
            divide_dsc(arr,mid+1, high);
            conquer_dsc(arr, low, high, mid);
        }
    }
    public  void conquer_dsc(int arr[],int low,int high,int mid){
        int res[] = new int[high-low+1];
        int x =0;
        int left=low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]>=arr[right]){
                res[x++] = arr[left++];
            }
            else{
                res[x++] = arr[right++];
            }
        }
        while(left<=mid){
            res[x] = arr[left];
            left++;x++;
        }
        while(right<=high){
            
            res[x] = arr[right];
            right++;x++;
        }
        for (int i = 0,j=low; i < res.length; i++,j++) {
            arr[j] = res[i];
        }

    }

    public static int get(int eff[],int sped[],int k){
        int prev_per= 0;
        int per = 0;
        int speed[] = new int[100];
        int x = 0;
        for (int i = 0; i < eff.length-1; i++) {
            for (int j = 0; j < sped.length-1; j++) {
                    if(i==0 && j == 0){
                      per = eff[i] * sped[j];
                      prev_per = per;
                      speed[x] = sped[j];
                    }
                    else{
                        if(sped[j+1]>sped[j]){
                            speed[x] = sped[j];
                        }
                        per = Math.min(eff[i],eff[i+1]) * (speed[x] + sped[j] + sped[j+1]);
                        if(per>prev_per){
                            break;
                        }

                    }

            }
        }
        return per;
    }
    public static void main(String[] args) {
        int speed[] = {2,10,3,1,5,8};
        divide(speed, 0, speed.length-1);
        int eff[] = {5,4,3,9,7,2};
        MaxPerformance max = new MaxPerformance();
        max.divide_dsc(eff, 0, eff.length-1);
        System.out.println(get(eff, speed, 2));
        // [9,7,5,4,3,2]
        // [1,2,5,8,10,3]
    }
}
