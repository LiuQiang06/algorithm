package PaiXuFa;

import java.util.Arrays;

/**
 * @author LiuQiang
 * @date 2024/04/28 星期日 16:16
 * @description 堆排序
 */
public class Dui {
    public static void main(String[] args) {
        int a[]={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[] arr) {
        int length = arr.length;
        //构建堆
        buildHeap(arr,length);
        for ( int i = length - 1; i > 0; i-- ) {
            //将堆顶元素与末位元素调换
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //数组长度-1 隐藏堆尾元素
            length--;
            //将堆顶元素下沉 目的是将最大的元素浮到堆顶来
            sink(arr, 0,length);
        }
    }
    private static void buildHeap(int[] arr, int length) {
        for (int i = length / 2; i >= 0; i--) {
            sink(arr,i, length);
        }
    }

    private static void sink(int[] arr, int index, int length) {
        int leftChild = 2 * index + 1;//左子节点下标
        int rightChild = 2 * index + 2;//右子节点下标
        int present = index;//要调整的节点下标

        //下沉左边
        if (leftChild < length && arr[leftChild] > arr[present]) {
            present = leftChild;
        }

        //下沉右边
        if (rightChild < length && arr[rightChild] > arr[present]) {
            present = rightChild;
        }

        //如果下标不相等 证明调换过了
        if (present != index) {
            //交换值
            int temp = arr[index];
            arr[index] = arr[present];
            arr[present] = temp;

            //继续下沉
            sink(arr, present, length);
        }
    }
}
