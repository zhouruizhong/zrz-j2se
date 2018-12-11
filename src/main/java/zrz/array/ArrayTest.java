package zrz.array;

/**
 * @author 周瑞忠
 * @version 1.0
 * @date 2018/11/17 0:10
 */
public class ArrayTest {

    public static void main(String[] args) {
        // 创建一个数组
        int [] array = new int[3];
        // 获取数组的长度
        int length = array.length;
        System.out.println("array length" + length);

        // 访问数组中的元素：数组名[下标] 注意:下标从0开始，最大可以取到的长度-1
        int element0 = array[0];
        System.out.println("element0=" + element0);

        // 为数组中的元素赋值
        array[0] = 99;
        System.out.println("element0=" + array[0]);

        array[1] = 98;
        array[2] = 97;
        // 遍历数组
        for (int i = 0; i < length; i++) {
            System.out.println("array element" + i + "=" + array[i]);
        }

        // 创建数组的同时为数组中的元素赋值
        int [] arrays = new int[]{90,80,70,60,50};
        // 获取数组的长度
        System.out.println("arrays length =" + arrays.length);
    }
}
