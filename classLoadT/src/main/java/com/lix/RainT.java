package com.lix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RainT {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 45, 65, 33, 12};
        System.out.println("交换之前：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        //xuanze(arr);
        //charu(arr);
        kuaisu(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    private static void kuaisu(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp = arr[start];
        while (start != end) {
            while (arr[end] >= temp && end > start) {
                end--;
            }
            arr[end] = arr[start];
            while (arr[start] <= temp&& end > start) {
                start++;
            }
            arr[start] = arr[end];
        }
    }

    public static void charu(int[] array) {
        int i, j, temp;
        for (i = 1; i < array.length; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (temp > array[j]) {
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = temp;
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

    private static void xuanze(int[] arr) {
        //选择排序的优化
        for (int i = 0; i < arr.length; i++) {// 做第i趟排序
            int k = i;
            for (int j = i; j < arr.length - 1; j++) {// 选最小的记录
                if (arr[k] > arr[j + 1]) {
                    k = j + 1; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i != k) {  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println();
        System.out.println("交换后：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /* public static void main(String[] args) {
         int[] x = {1, 0, 1, 2};
        // System.out.println(new RainT().get(x));
         int[] xuanze = new RainT().xuanze(x);
         for (int i : xuanze) {
             System.out.println(i);
         }
     }
 */
    private int get(int[] o) {
        int length = o.length;
        int num = 0;
        for (int i = 0; i < length; i++) {
            int leftMax = 0;
            int rightMax = 0;
            if (i - 1 >= 0) {
                leftMax = o[i - 1];
            }
            if (i + 1 <= length - 1) {
                rightMax = o[i + 1];
            }
            for (int j = i; j + 1 <= length - 1; j++) {
                if (rightMax <= o[j + 1]) {
                    rightMax = o[j + 1];
                }
            }
            for (int j = i; j - 1 >= 0; j--) {
                if (leftMax <= o[j - 1]) {
                    leftMax = o[j - 1];
                }
            }
            System.out.println("第" + i + "个" + o[i] + "左边最大:" + leftMax);
            System.out.println("第" + i + "个" + o[i] + "右边最大:" + rightMax);
            int k = rightMax - o[i];
            if (k < 0) {
                k = 0;
            }
            int x = leftMax - o[i];
            if (x < 0) {
                x = 0;
            }
            num = (leftMax > rightMax) ? num + k : num + x;
            System.out.println(num);
        }
        return num;
    }

}
