package com.java.day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.

 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2};
        System.out.println("Using HashSet \n");
        System.out.println(removeDuplicatesUsingSet(nums));
        System.out.println("Optimal Approach but using Swap \n");
        System.out.println(removeDuplicates(nums));
        System.out.println("Optimal Approach \n");
        System.out.println(removeDuplicatesOptimalApproach(nums));
    }

    private static int removeDuplicates(int[] nums) { // using swap with o(n) TC
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                //swap
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
        return i+1;
    }

    private static int removeDuplicatesUsingSet(int[] nums) { // using Set O(n) SC and TC
        Set<Integer> set = new HashSet<>();
        for(int e: nums)
            set.add(e);
        int i=0;
        for (Integer integer : set) {
            nums[i] = integer;
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return set.size();
    }

    private static int removeDuplicatesOptimalApproach(int[] nums){ //with no swapping and takes o(n) TC
        int counter = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[counter] != nums[i]){
                counter++;
                nums[counter] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return counter+1;
    }
}