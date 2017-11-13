package yuyuTest.homeWork;

/**
 * Created by 彦祖 .
 */
public class QuickSort {

    private static void sort(Comparable[] array) {
        int size = array.length;
        sort(array, 0, size - 1);
    }

    private static void sort(Comparable[] array, int left, int right) {
        Utils.swap(array, left, (int) (Math.random() * (right - left + 1)) + left);

        if (right - left <= 15) {
            insertSort(array, left, right);
            return;
        }
        int position = partition(array, left, right);
        sort(array, left, position - 1);
        sort(array, position + 1, right);
    }

    private static int partition(Comparable[] array, int left, int right) {
        Comparable temp = array[left];
        int index = left;
        for (int i = left + 1; i <= right; i++) {
            if (array[i].compareTo(temp) < 0) {
                index++;
                Utils.swap(array, index, i);
            }
        }
        Utils.swap(array, index, left);
        return index;
    }

    private static void insertSort(Comparable[] arr, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            Comparable e = arr[i];
            int j = i;
            for (; j > l && arr[j - 1].compareTo(e) > 0; j--)
                arr[j] = arr[j - 1];
            arr[j] = e;
        }
    }

    public static void main(String[] args) {
        Comparable[] array = Utils.random(20, 0, 100);
        sort(array);
        Utils.printt(array);
    }
}
