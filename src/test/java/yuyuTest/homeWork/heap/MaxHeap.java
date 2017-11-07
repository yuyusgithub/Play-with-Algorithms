package yuyuTest.homeWork.heap;

import yuyuTest.homeWork.Utils;

/**
 * Created by 彦祖 .
 */
public class MaxHeap<T extends Comparable> {

    private T[] array;

    private int count;

    public MaxHeap(int capacity) {
        array = (T[]) new Comparable[capacity + 1];
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void shiftUp(int index) {
        while (index > 1 && array[index].compareTo(array[index / 2]) > 0) {
            Utils.swap(array, index, index / 2);
            index /= 2;
        }
    }

    private void shiftDown1(int k) {
        while (2 * k <= count) {
            int j = 2 * k; // 在此轮循环中,data[k]和data[j]交换位置
            if (j + 1 <= count && array[j + 1].compareTo(array[j]) > 0)
                j++;
            // data[j] 是 data[2*k]和data[2*k+1]中的最大值
            if (array[k].compareTo(array[j]) >= 0) break;
            Utils.swap(array, k, j);
            k = j;
        }
    }

    private void shiftDown(int k) {
        while (2 * k < count) {
            int child = 2 * k;
            if(child +1 <count && array[child+1].compareTo(array[child]) > 0){
                child++;
            }
            if(array[k].compareTo(array[child]) >= 0){
                break;
            }
            Utils.swap(array,k,child);
            k = child;
        }
    }

    public T extractMax() {
        T ret = array[1];
        Utils.swap(array,1, count);
        count--;
        shiftDown(1);
        return ret;
    }

    private void insert(T xxx) {
        array[count + 1] = xxx;
        count++;
        shiftUp(count);
    }

    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(100);
        System.out.println(maxHeap.size());
    }

}
