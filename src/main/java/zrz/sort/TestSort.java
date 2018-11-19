package zrz.sort;

import java.util.Arrays;

/**
 * @author zhouruizhong
 * @title: TestFastSort
 * @project zrz-j2se
 * @description TODO
 * @date 2018/11/19 14:24
 */
public class TestSort {

    /**
     * 快速排序
     *
     * @param numbers 带排序数组
     */
    public static void quick(int[] numbers) {
        //查看数组是否为空
        if (numbers.length > 0) {
            QuickSort.quickSort(numbers, 0, numbers.length - 1);
        }
    }

    public static void bubble(int [] numbers){
        if (numbers.length > 0) {
            BubbleSort.bubbleSort(numbers);
        }
    }

    public static void printArr(int [] numbers){
        for (int i: numbers ) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        int [] numbers = {56,84,24,95,31,57,64,21,85,46};
        int result = Arrays.binarySearch(numbers, 31);
        System.out.println("二进制查找的结果是:" + result);

        System.out.print("排序前：");
        printArr(numbers);

        Arrays.sort(numbers);
        System.out.print("Arrays 排序后：");
        printArr(numbers);

        bubble(numbers);
        System.out.print("冒泡排序后：");
        printArr(numbers);

        quick(numbers);
        System.out.print("快速排序后：");
        printArr(numbers);
    }
}
