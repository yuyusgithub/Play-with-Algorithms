package yuyuTest.homeWork;

/**
 * Created by 彦祖 .
 */
public class insertSort {

    private static void sort(Comparable[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    Utils.swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void sort2(Comparable[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            Comparable t = array[i];
            int j = i;
            for (; j > 0; j--) {
                if (array[j - 1].compareTo(t) > 0) {
                    array[j] = array[j - 1];
                } else {
                    break;
                }
            }
            array[j] = t;
        }
    }

    private static void sortAdvance(Comparable[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            Comparable o = array[i];
            int j = i;
            for (; j > 0 && array[j - 1].compareTo(o) > 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = o;
        }
    }


    public static void main(String[] args) {
        Comparable[] datas = Utils.random(10, 1, 100);
        sort2(datas);
        Utils.printt(datas);
    }
}
