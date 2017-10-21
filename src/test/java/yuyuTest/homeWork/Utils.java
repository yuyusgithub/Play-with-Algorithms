package yuyuTest.homeWork;

/**
 * Created by 彦祖 .
 */
public class Utils {

    public static void printt(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static Integer[] random(int n,int left ,int right){
        Integer[] datas = new Integer[n];
        for(int i = 0 ; i<n;i++){
            datas[i] = (int)(Math.random()*(right-left+1)+left);
        }
        return datas;
    }

    public static void swap(Comparable[] array, int i, int j) {
        Comparable x = array[i];
        array[i] = array[j];
        array[j] = x;
    }
}
