package zrz.array;

import java.util.Arrays;

/**
 * @author zhouruizhong
 * @date 2018/12/10 10:36
 */
public class TestOpArray {

    /**
     * 为数组动态添加元素至数组最后
     * @param array 数组
     * @param dst 要添加的元素
     * @return int[]
     */
    private static int[] addElement(int[] array, int dst){
        // 创建一个新的数组，长度是原数组查到+1
        int [] newArray = new int[array.length + 1];
        // 把原数组中的数据全部复制到新数组中
        for (int i = 0; i < array.length; i++) {
            newArray [i] = array[i];
        }
        // 把目标元素放入新数组的最后
        newArray[newArray.length - 1] = dst;
        //新数组替换原数组
        array = newArray;
        return array;
    }

    /**
     * 动态添加数组元素
     * @param array 数组
     * @param dst 元素
     * @param index 下标
     * @return int[]
     */
    private static int[] addElement(int[] array, int dst, int index){
        int length = array.length;
        if (index > length) {
            throw new ArrayIndexOutOfBoundsException("索引位置不能超过" + length);
        }
        // 创建一个新的数组，长度是原数组查到+1
        int [] newArray = new int[array.length + 1];
        // 把原数组中的数据全部复制到新数组中
        for (int i = 0; i < newArray.length; i++) {
            if (i == index){
                newArray [i] = dst;
            }else if (i > index){
                newArray [i] = array[i-1];
            }else {
                newArray [i] = array[i];
            }
        }
        //新数组替换原数组
        array = newArray;
        return array;
    }

    /**
     * 通过元素vlaue 删除元素
     * @param array 原数组
     * @param value 元素的值
     * @return int[] 新数组
     */
    private static int[] removeElementByValue(int array[], int value){
        // 遍历数组
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                array = removeElement(array, i);
            }
        }
        return array;
    }

    /**
     * 通过下标index删除数组元素
     * @param array 数组
     * @param index 下标
     * @return int[] 新数组
     */
    private static int[] removeElement(int array[], int index){
        // 目标数组长度
        int length = array.length;
        if (index > length) {
            throw new ArrayIndexOutOfBoundsException("索引位置不能超过" + length);
        }
        // 新数组,数组长度减一
        int [] newArray = new int[length - 1];
        // 遍历数组
        for (int i = 0; i < newArray.length; i++) {
            if (i >= index) {
                newArray[i] = array[i+1];
            }else{
                newArray[i] = array[i];
            }
        }
        array = newArray;
        return array;
    }

    public static void main(String[] args) {
        // 解决数组的长度不可变
        int [] array = new int[]{9,8,7,6,5,4,3,2,1,5,4,3,2,1,5,4,3,2,1};
        // 查看数组的元素
        //System.out.println(Arrays.toString(array));
        // 要加入的目标元素
        //int dst = 6;
        //array = addElement(array, dst);
        //System.out.println(Arrays.toString(array));

        //dst = 5;
        //int index = 1;
        //array = addElement(array, dst, index);
        //System.out.println(Arrays.toString(array));

        //index = 2;
        //array = removeElement(array, index);

        array = new int[]{5,21,4,5,1,2,3,5,4,8,6,5,2};
        System.out.println(Arrays.toString(array));
        int value = 5;
        array = removeElementByValue(array, value);
        System.out.println(Arrays.toString(array));
    }

}
