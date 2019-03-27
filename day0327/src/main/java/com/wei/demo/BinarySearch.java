package com.wei.demo;

/**
 * 2018-03-27
 * 二分查找
 * <p>
 * Input: nums = [1,2,2,4,5,5], target = 2
 * Output: 1 or 2
 */

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[]  arr  = {1,2,2,4,5,5};
        int target = 2;
        System.out.println(binarySearch.getIndexByBinarySearch(arr,target));
    }


    public int getIndexByBinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (end + start + 1) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }

}
