package zrz.hexadecimal;

/**
 * @author 唐朝
 * @version 1.0
 * @projectName zrz-j2se
 * @package zrz.hexadecimal
 * @className TestHexadecimal
 * @description java类作用描述
 * @createDate 2018/11/6 21:22
 * @updateUser 更新者
 * @updateDate 2018/11/6 21:22
 * @updateRemark 更新说明
 */
public class TestHexadecimal {

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("10", 2));
        System.out.println(Integer.parseInt("10", 8));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));

        System.out.println(Integer.toString(10));
        System.out.println("二进制：" + Integer.toBinaryString(10));
        System.out.println("八进制：" + Integer.toOctalString(10));
        System.out.println("十六进制：" + Integer.toHexString(10));



    }
}
