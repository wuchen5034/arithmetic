package com.wei.demo;

/**
 * 二分查找
 * 找到目标值出现的第一个索引
 * Input:  [1,4,4,5,7,7,8,9,9,10]，1
 * Output: 0
 */
public class FirstPositionOfTarget {

    public static void main(String[] args) {

        FirstPositionOfTarget firstPositionOfTarget = new FirstPositionOfTarget();
        int[] arr = {1, 4, 4, 5, 7, 7, 8, 9, 9, 10};
        int target = 7;
        int position = firstPositionOfTarget.getFirstPosition(arr, target);
        System.out.println(position);

    }

    public int getFirstPosition(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + ((end - start + 1) >> 1);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                for (int i = mid - 1; i >= start; i--) {
                    if (target > arr[i]) {
                        return i + 1;
                    } else {
                        continue;
                    }
                }
            }

        }


        return -1;
    }


}
