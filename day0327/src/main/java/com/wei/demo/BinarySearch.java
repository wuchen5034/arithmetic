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
        int target = 5;
        System.out.println(binarySearch.getIndexByBinarySearch(arr,target));
        System.out.println(binarySearch.refBinarySearch(arr,target));
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


    public int refBinarySearch(int[] arr,int key){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            /**
             * 如果写成(end+start+1)/2,end和start很大的时候,加法会溢出
             * 推荐如下写法
             * mid = start + (end - start) / 2 or mid = start + ((end - start) >> 1)
             */
            int mid = start + (end-start) / 2;

            /**
             * 建议先比较大于或者小于,因为大于小于的可能性要远远大于等于的时候,
             * 这样写出来的算法比较次数是最少的，虽然时间复杂度都是一样的。
             */
            if (key < arr[mid]) {
                end = mid -1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }


        }



        return  -1;

    }






}
