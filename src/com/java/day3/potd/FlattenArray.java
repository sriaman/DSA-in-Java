package com.java.day3.potd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Flatten nested arrays in java. Numbers or nested arrays can be upto n levels.

Example
Input -> [[[1],2],[3,4]]
Output -> [1,2,3,4]
 */
public class FlattenArray {
    public static void main(String[] args) {
        Object[] array = {1,2,new Object[]{3,4, new Object[]{5},6,new Object[]{7}},8,9,10};
        Integer[] flattenedArray = flatten(array);
        System.out.println(Arrays.toString(Arrays.stream(flattenedArray).toArray()));
    }
    public static List<Integer> result = new ArrayList<>();
    private static Integer[] flatten(Object[] inputArray) {
        for(Object obj:inputArray){
            if(obj instanceof Integer){
                result.add(Integer.valueOf(String.valueOf(obj)));
            }else{
                flatten((Object[]) obj);
            }
        }
        return result.toArray(new Integer[0]);
    }
}
