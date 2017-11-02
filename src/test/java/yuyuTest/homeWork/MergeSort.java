package yuyuTest.homeWork;

import java.util.Arrays;

/**
 * Created by 彦祖 .
 */
public class MergeSort {

    private static void sort(Comparable[] array) {
        int size = array.length;
        sort(array, 0, size - 1);
    }

    private static void sort(Comparable[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        sort(array, left, mid);
        sort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(Comparable[] array, int left, int mid, int right) {
        Comparable[] tmp = Arrays.copyOfRange(array, left, right + 1);
        int leftIndex = left;
        int rightIndex = mid + 1;
        for (int i = left; i <= right; i++) {
            if (leftIndex > mid) {
                array[i] = tmp[rightIndex - left];
                rightIndex++;
            } else if (rightIndex > right) {
                array[i] = tmp[leftIndex - left];
                leftIndex++;
            } else if (tmp[leftIndex-left].compareTo(tmp[rightIndex-left]) < 0) {
                array[i] = tmp[leftIndex - left];
                leftIndex++;
            } else {
                array[i] = tmp[rightIndex - left];
                rightIndex++;
            }
        }
    }


    public static void main(String[] args) {
        Comparable[] array = Utils.random(10, 0, 10);
        sort(array);
        Utils.printt(array);
    }
}

