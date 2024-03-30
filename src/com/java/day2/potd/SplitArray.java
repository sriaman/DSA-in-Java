package com.java.day2.potd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
  Problem statement : split the array into chunks
 */
public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int split = 3;
        System.out.println("\n Using proper algorithm (no helper method)");
        splitArray(arr,split).forEach(x-> System.out.println(Arrays.toString(x)));

        System.out.println("\n Using Arrays.copyOfRange helper method");
        splitTheArray(arr,split).forEach(x-> System.out.println(Arrays.toString(x)));
    }
/*
output should be like
  [1,2,3]
  [4,5,6]
  [7,8,9]
  [10]
*/
    private static List<int[]> splitArray(int[] arr, int split) {
        List<int[]> result = new ArrayList<>();
        int y = arr.length%split;
        for(int i=0;i<arr.length;i+=split){
            int[] temp;
            if(i+split <= arr.length) {
                temp = new int[split];
                for (int j = 0; j < split; j++)
                    temp[j] = arr[i + j];
            }else{
                temp = new int[y];
                for(int k=0;k<y;k++)
                    temp[k]=arr[i+k];
            }
            result.add(temp);
        }
        return result;
    }

    private static List<int[]> splitTheArray(int[] arr,int splitSize){
        List<int[]> lst = new ArrayList<>();
        for(int i=0;i<arr.length;i+=splitSize){
            int end = Math.min(i+splitSize,arr.length);
            int[] temp = Arrays.copyOfRange(arr,i,end);
            lst.add(temp);
        }
        return lst;
    }
}
