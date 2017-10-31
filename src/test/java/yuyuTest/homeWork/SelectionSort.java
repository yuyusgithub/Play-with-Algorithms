package yuyuTest.homeWork;

/**
 * Created by 彦祖 .
 */
public class SelectionSort {

    private static void sort3(Comparable[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for(int j = i+1;j<size;j++){
                if(array[j].compareTo(array[minIndex])<0){
                    minIndex = j;
                }
            }
            Utils.swap(array,i,minIndex);
        }
    }


    private static void sort2(Comparable[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    minIndex = j;
                }
            }
            Utils.swap(array, minIndex, i);
        }
    }


    public static void main(String[] args) {
        Integer[] datas = Utils.random(10, 1, 100);
        sort3(datas);
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

    private static void sort1(Comparable[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int mixIndex = i;
            int j = i + 1;
            for (; j < size; j++) {
                if (array[mixIndex].compareTo(array[j]) > 0) {
                    mixIndex = j;
                }
            }
            Utils.swap(array, mixIndex, i);
        }
    }
}
