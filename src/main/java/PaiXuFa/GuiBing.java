package PaiXuFa;

import java.util.Arrays;

/**
 * @author LiuQiang
 * @date 2024/04/28 星期日 15:33
 * @description 归并排序法
 */
public class GuiBing {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] temp = new int[arr.length];
        mergersort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergersort(int[] arr, int left, int right, int[] temp) {
        //分解
        if (left < right) {
            int mid = (left + right) / 2;
            //向左递归进行分解
            mergersort(arr, left, mid, temp);
            //向右递归进行分解
            mergersort(arr, mid + 1, right, temp);
            //每分解一次便合并一次
            merger(arr, left ,right, mid, temp);
        }
    }

    private static void merger(int[] arr, int left, int right, int mid, int[] temp) {
        int i = left;   //初始i，左边有序序列的初始索引
        int j = mid + 1;    //初始化j，右边有序序列的初始索引（右边有序序列的初始位置即中间位置的后一位置）
        int t = 0;  //指向temp数组的当前索引，初始为0

        //先把左右两边的数据（已经有序）按规则填充到temp数组
        //直到左右两边的有序序列，有一边处理完成为止
        while (i <= mid && j <= right) {
            //如果左边有序序列的当前元素小于或等于右边的有序序列的当前元素，就将左边的元素填充到temp数组中
            if(arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t++;//索引往后移
                i++;//i后移
            } else {
                //反之，将右边有序序列的当前元素填充到temp数组中
                temp[t] = arr[j];
                t++;//索引向后移
                j++;//j后移
            }
        }
        //把剩余数据的一边的元素填充到temp中
        while (i <= mid) {
            //此时说明左边序列还有剩余元素
            //全部填充到temp数组
            temp[t] = arr[i];
            t++;
            i++;
        }
        while (j <= right) {
            //此时说明左侧序列还有剩余元素
            //全部填充到temp数组
            temp[t] = arr[j];
            t++;
            j++;
        }
        //将temp数组的元素复制到原数组
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }
}
