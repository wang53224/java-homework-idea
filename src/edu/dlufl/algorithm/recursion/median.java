package edu.dlufl.algorithm.recursion;

/**
 * 两个长度相等的有序数组中找到上中位数
 */
public class median {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        System.out.println(getUpMedian(arr1,arr2));

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {3, 4, 5, 6, 7};
        System.out.println(getUpMedian(arr3,arr4));

    }

    public static int getUpMedian(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null)
            return -1;

        //开始寻找
        return find(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);
    }

    public static int find(int[] arr1, int l1, int r1, int[] arr2, int l2, int r2) {
        int mid1 = l1 + (r1 - l1) / 2;
        int mid2 = l2 + (r2 - l2) / 2;

        if (l1 >= r1)
            return Math.min(arr1[l1], arr2[l2]);

        //元素个数为奇数,offset为0;反之为1
        int offset = ((r1 - l1 + 1) & 1) ^ 1;
        if (arr1[mid1] < arr2[mid2]) {
            return find(arr1, mid1 + offset, r1, arr2, l2, mid2);
        } else if (arr1[mid1] > arr2[mid2]) {
            return find(arr1, l1, mid1, arr2, mid2 + offset, r2);
        } else {
            return arr1[mid1];
        }
    }
}
