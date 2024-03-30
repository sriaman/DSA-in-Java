package com.java.day1;

/******************************************************************************

 Given two sorted arrays, the task is to merge them in a sorted manner.

 Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
 Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

 Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
 Output: arr3[] = {4, 5, 7, 8, 8, 9}

 *******************************************************************************/
import java.util.*;

public class MergeArray{

    public static void main(String[] args) {
        int arr1[] = {11, 13, 15, 17, 0, 0, 0, 0};

        int arr2[] = {12, 14, 16, 17};


        int arr3[] = mergeArrays(arr1,4, arr2,4);

        System.out.println("Array after merging - " + Arrays.toString(arr3));
    }

    public static int[] mergeArrays(int[] arr1,int n, int[] arr2, int m) {
        int i = n-1;
        int j = m-1;
        int k = m+n-1;

        while(j>=0){
            if(i==-1){
                i=0;
                arr1[i]=0;
            }
            if(arr1[i]<arr2[j]){
                arr1[k--] = arr2[j--];
            }
            else{
                arr1[k--]= arr1[i--];
            }
        }
        return arr1;
    }
}

