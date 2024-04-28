package PaiXuFa;

import java.util.Arrays;

/**
 * @author LiuQiang
 * @date 2024/04/28 星期日 15:21
 * @description 快速排序法
 * 冒泡排序法的升华版
 */
public class KuaiSu {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int low, int high) {
        int i;
        int j;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //基准位，low = length时，汇报异常java.lang.ArrayIndexOutOfBoundsException: 4，所以必须在if判断后面，就跳出方法
        int temp = arr[low];
        while (i < j) {
            //先从右边开始往左递减，找到比temp小的值才停止
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边开始往右递增，找到比temp大的值才停止
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //满足i < j就交换，继续循环while(i < j)
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        //最后将基准位跟 arr[i]与arr[j]相等的位置，进行交换，此时i=j
        arr[low] = arr[i];
        arr[i] = temp;
        //左递归
        quickSort(arr, low, j - 1);
        //右递归
        quickSort(arr, j + 1, high);
    }
}
