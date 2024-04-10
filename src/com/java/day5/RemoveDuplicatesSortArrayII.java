package com.java.day5;

import java.util.Arrays;

public class RemoveDuplicatesSortArrayII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++)
            if(j<2 || arr[i]>arr[j-2])
                arr[j++]=arr[i];
        System.out.println(Arrays.toString(arr));
        return j;
    }
}
