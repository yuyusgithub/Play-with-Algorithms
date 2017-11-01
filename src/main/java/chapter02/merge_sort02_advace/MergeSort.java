package chapter02.merge_sort02_advace;

import java.util.*;

public class MergeSort {

    // 我们的算法类不允许产生任何实例
    private MergeSort() {
    }

    // 将arr[l...mid]和arr[mid+1...r]两部分进行归并
    private static void merge(Comparable[] array, int left, int mid, int right) {
        Comparable[] tmp = Arrays.copyOfRange(array, left, right + 1);
        int leftIndex = left;
        int rightIndex = mid + 1;
        for (int i = left; i <= right; i++) {
            if (leftIndex > mid) { //说明左边的已经排完了
                array[i] = tmp[rightIndex - left];
                rightIndex++;
            } else if (rightIndex > right) { //it means the right side has been sorted;
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

    // 递归使用归并排序,对arr[l...r]的范围进行排序
    private static void sort(Comparable[] arr, int l, int r) {

        if (l >= r)
            return;

        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void sort(Comparable[] arr) {

        int n = arr.length;
        sort(arr, 0, n - 1);
    }

    // 测试MergeSort
    public static void main(String[] args) {

        // Merge Sort是我们学习的第一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        // 注意：不要轻易尝试使用SelectionSort, InsertionSort或者BubbleSort处理100万级的数据
        // 否则，你就见识了O(n^2)的算法和O(nlogn)算法的本质差异：）
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("bobo.algo.MergeSort", arr);

        return;
    }
}