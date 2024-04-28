package PaiXuFa;

import java.util.Arrays;

/**
 * @author LiuQiang
 * @date 2024/04/28 星期日 15:13
 * @description 希尔排序法
 * 插入排序的升级
 */
public class XiEr {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 4};
        int length = arr.length;
        int count = 0;  //比较次数
        for (int gap = length / 2; gap > 0; gap = gap / 2) {
            //将整个数组分为若干个子数组
            for (int i = gap; i < length; i++) {
                //遍历各组元素
                for (int j = i - gap; j >= 0; j = j - gap) {
                    //交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + gap];
                    arr[j + gap] = temp;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("一共比较了" + count + "次");
    }
}
