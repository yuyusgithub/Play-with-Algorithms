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


    private static void sort(Comparable[] array) {
        int size = array.length;
        sort(array, 0, size - 1);
    }

    private static void sort(Comparable[] array,int left,int right){
        if(left >= right){
            return ;
        }
        int position = position(array,left,right);
        sort(array,left,position-1);
        sort(array,position+1,right);
    }

    private static int position(Comparable[] array, int left,int right){
        Comparable tmp = array[left];
        int index = left;
        for(int i = index+1;i<=right;i++){
            if(array[i].compareTo(tmp) < 0){
                index++;
                Utils.swap(array,i,index);
            }
        }
        Utils.swap(array,index,left);
        return index;
    }

    private static void sort1(Comparable[] array) {
        int size = array.length;
        sort1(array, 0, size - 1);
    }

    private static void sort1(Comparable[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int position = potision1(array, left, right);
        sort1(array, left, position - 1);
        sort1(array, position + 1, right);
    }


    private static int potision1(Comparable[] array, int left, int right) {
        Comparable temp = array[left];
        int index = left;
        for (int i = index + 1; i <= right; i++) {
            if (array[i].compareTo(temp) < 0) {
                index++;
                Utils.swap(array, index, i);
            }
        }
        Utils.swap(array, index, left);
        return index;
    }


}
