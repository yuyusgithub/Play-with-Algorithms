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
                }else{
                    break;
                }
            }
        }
    }

    private static void sort1(Comparable[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j > 0 && array[j].compareTo(array[j - 1]) < 0; j--) {
                    Utils.swap(array, j, j - 1);
            }
        }
    }

    private static void sortAdvance1(Comparable[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            Comparable tmp = array[i];
            int j = i;
            for ( ; j > 0 && array[j-1].compareTo(tmp) > 0; j--) {
                array[j] = array[j-1];
            }
            array[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Comparable[] datas = Utils.random(10,1,100);
//        sort(datas);
//        sort1(datas);
        sortAdvance1(datas);
        Utils.printt(datas);
    }
}
