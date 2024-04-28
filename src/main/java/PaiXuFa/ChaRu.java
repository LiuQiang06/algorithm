package PaiXuFa;

import java.util.Arrays;

/**
 * @author LiuQiang
 * @date 2024/04/28 星期日 15:03
 * @description 插入排序法
 * 定义一个待插入的数，再定义一个待插入数的前一个数的下标，然后拿待插入数与前面数组一一比较，最后交换
 */
public class ChaRu {
    public static void main(String[] args) {

        int arr[] = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        int length = arr.length;

        for (int i = 0; i < length; i++) {//长度不减1，因为要留多一个位置方便插入数
            //定义待插入的数
            int insertValue = arr[i];
            //找到待插入数的前一个数的下标
            int insertIndex = i - 1;
            //拿arr[i]和arr[i - 1]的前面数组比较
            while (insertIndex >= 0 && insertValue < arr[insertIndex]){
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
