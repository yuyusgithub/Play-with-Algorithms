package yuyuTest.homeWork;

/**
 * Created by 彦祖 .
 */
public class SelectionSort {

    public static void main(String[] args) {
        Integer[] datas = Utils.random(10, 1, 100);
        sort(datas);
        Utils.printt(datas);
    }

    private static void sort(Comparable[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[minIndex].compareTo(array[j]) > 0) {
                    minIndex = j;
                }
            }
            Utils.swap(array, i, minIndex);
        }
    }


}
