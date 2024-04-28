package PaiXuFa;

import java.util.Arrays;

/**
 * @author LiuQiang
 * @date 2024/04/28 星期日 14:46
 * @description 冒泡排序法
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int length = arr.length;
        int count = 0;  //记录比较次数
        //i = 0，第一轮比较
        for (int i = 0; i < length - 1; i++) {
            boolean flag = true;
            //第一轮，两两比较
            for (int j = 0; j < length - i - 1; j++) {
                int temp = arr[j];
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
                count++;
            }
            if (flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("一共比较了" + count + "次");
    }
}
