package com.java.day1;

/*
find a duplicates in sequence of number which are in sorted order
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10};
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] == arr[m + 1] || arr[m] == arr[m - 1]) {
                System.out.println(arr[m]);
                return;
            } else {
                if (arr[m - 1] == m) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
    }
}
