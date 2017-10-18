package chapter01.selection_sort01;

public class SelectionSort {

    // 我们的算法类不允许产生任何实例
    private SelectionSort() {
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // 寻找[i, n)区间里的最小值的索引,并把最小值和当前 i位置上的值进行交换；
            int minIndex = i; //起始先默认最小 位置为0；
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            swap(arr, i, minIndex);//交换
        }
    }

    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
