package com.java.day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 */

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,3,3,4,4};
        System.out.println(majorityElementsII(nums));
    }

    //HashMap
    private static int majorityElementsI(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int maxi=Integer.MIN_VALUE;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue()>maxi){
                maxi = i.getValue();
                result = i.getKey();
            }
        }
        return result;
    }

    //Moore voting algorithms
    private static int majorityElementsII(int[] nums){
        int count = 0;
        int ele =0;
        for(int num:nums){
            if(count==0){
                ele=num;
            }
            if(num==ele){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }

}
