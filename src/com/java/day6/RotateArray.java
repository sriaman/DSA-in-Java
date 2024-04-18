package com.java.day6;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotateII(nums, 7);
    }

    private static void rotateI(int[] nums, int k) {
        int n=nums.length;
        int[] arr = new int[n];
        if(k>n)
            k=k%n;
        for(int i=0;i<n;i++)
            arr[i] = nums[(n-k+i)%n];
        System.out.println(Arrays.toString(arr));
    }
    private static void rotateII(int[] nums, int k) { //optimize solution
        int n=nums.length;
        if(k>=n)
            k=k%n;
        for(int i=0;i<n/2;i++){
            int temp = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<k/2;i++){
            int temp = nums[i];
            nums[i] = nums[k-i-1];
            nums[k-i-1] = temp;
        }
        System.out.println(Arrays.toString(nums));
        int i=k;
        int j=n-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
    }

}
