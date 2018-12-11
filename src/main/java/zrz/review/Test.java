package zrz.review;

/**
 * @author zhouruizhong
 * @date 2018/12/10 16:39
 */
public class Test {

    public static void main(String[] args) {
        Integer integer = new Integer(1);

        Integer i2 = Integer.valueOf(2);

        Integer a = -129;
        Integer b = -129;

        System.out.println("a == b " + (a == b));

        String string = new String("zhang san");
        string.equals("zhang");
    }
}
