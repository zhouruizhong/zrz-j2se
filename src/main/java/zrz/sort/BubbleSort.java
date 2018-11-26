package zrz.sort;

import java.util.Arrays;

/**
 * @author zhouruizhong
 * @title: BubbleSort
 * @project zrz-j2se
 * @description TODO 冒泡排序
 * @date 2018/11/19 10:41
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     *
     * @param numbers 需要排序的整型数组
     */
    public static void bubbleSort(int[] numbers) {
        int temp = 0;
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                //交换两数位置
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
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

        System.out.print("没有排序前：");
        printArr(numbers);

        bubbleSort(numbers);
        System.out.print("冒泡排序后：");
        printArr(numbers);

    }

}
