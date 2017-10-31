package yuyuTest.homeWork;

/**
 * Created by 彦祖 .
 */
public class MergeSort {

    private static void sort(Comparable[] array){
        int size = array.length;
        sort(array,0,size);
    }

    private static void sort(Comparable[] array,int l,int r){
        if(l >= r){
            return ;
        }
        int mid = (l+r)/2;
        sort(array,l,mid);
        sort(array,mid+1,r);
        merge(array,l,r);
    }

    private static void merge(Comparable[] array,int l,int r){

    }
}

