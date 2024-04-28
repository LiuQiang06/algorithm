package PaiXuFa;

import java.util.Arrays;

/**
 * @author LiuQiang
 * @date 2024/04/28 星期日 14:53
 * @description 选择排序法
 * 先定义一个记录最小元素的下标，然后循环一次后面的，找到最小的元素，最后将他放到前面排序好的序列
 */
public class XuanZe {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 44, 38, 5, 47, 155, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int index = i; //标记第一个为待比较得数
            for(int j = i + 1; j < length; j++) { //然后从后边遍历与第一个数比较
                if (arr[j] < arr[index]) {  //如果小，就交换最小值
                    index = j;  //保存最小元素的下标
                }
            }
            //找到最小值后，将最小的值放到第一的位置，进行下一遍的循环
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
