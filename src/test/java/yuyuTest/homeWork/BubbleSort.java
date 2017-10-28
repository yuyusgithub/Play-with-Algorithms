package yuyuTest.homeWork;

/**
 * Created by 彦祖 .
 */
public class BubbleSort {

    private static void sort(Comparable[] array){
        int size = array.length;
        boolean flag = false;
        do{
            flag = false;
            for(int i = 1 ; i <size ; i++){
                if(array[i-1].compareTo(array[i])>0){
                    Utils.swap(array,i,i-1);
                    flag = true;
                }
            }
            size--;
        }while (flag);
    }


    public static void main(String[] args) {
        Comparable[] datas = Utils.random(10, 1, 100);
        sort(datas);
        Utils.printt(datas);
    }
}
