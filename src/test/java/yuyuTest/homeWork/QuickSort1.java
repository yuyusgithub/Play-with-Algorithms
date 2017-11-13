package yuyuTest.homeWork;

/**
 * Created by 彦祖 .
 */
public class QuickSort1 {

    public static void main(String[] args) {
        Comparable[] array = Utils.random(20, 0, 100);
        sort(array);
        Utils.printt(array);
    }

    private static void sort(Comparable[] array){
        int size = array.length;
        sort(array,0,size-1);
    }

    private static void sort(Comparable[] array,int left ,int right){
        if(left >= right){
            return ;
        }
        int j = potision(array,left,right);

    }

    private static int partition1(Comparable[] array, int left, int right) {
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

    private static int potision(Comparable[] array, int left, int right){
        Comparable temp = array[left];
        int index = left;
        return 0;
    }



}
