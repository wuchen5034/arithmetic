package com.wei.demo;

import java.util.Arrays;

/**
 * 2019-03-28
 * 找出数组的局部峰值
 * A[i] != A[i+1]
 * A[P] > A[P-1]
 * A[P] > A[P+1]
 * Input: [1, 2, 1, 3, 4, 5, 7, 6]
 * Output: 1 or 6
 */
public class PeakElement {

    public static void main(String[] args) {
        PeakElement peakElement = new PeakElement();
        int[] arr = {1, 2, 1, 3, 4, 5, 7, 6};
        int index = peakElement.getPeakElementIndex(arr);
        System.out.println("index:" + index);
    }


    public int getPeakElementIndex(int[] arr) {


        /**
         * 新建一个数组,比原数组长度+1,解决峰值为最后一个元素的时候,出现数组下标越界
         * 新数组最后一个元素默认填充为最小值
         */
        int[] newArr = new int[arr.length+1];
        System.arraycopy(arr,0,newArr,0,arr.length);
        newArr[arr.length]=Integer.MIN_VALUE;

        if (arr.length == 1) {
            return 0;
        }

        int start = 0;
        int end = newArr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start + 1) >> 1);
            if (newArr[mid] > newArr[mid - 1] && newArr[mid] < newArr[mid + 1]) { // 上升
                start = mid;
            } else if (newArr[mid] < newArr[mid - 1] && newArr[mid] > newArr[mid + 1]) { // 下降
                end = mid;
            } else {
                return mid;
            }

        }

        return 0;


    }


}
