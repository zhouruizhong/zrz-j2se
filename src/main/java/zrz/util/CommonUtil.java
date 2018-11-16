package zrz.util;

import java.util.Arrays;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.util
 * @class_name CommonUtil
 * @description java类作用描述
 * @createdate 2018/11/16 23:41
 */
public class CommonUtil {

    public static void main(String[] args) {
        Object [] a = {1,2,3};
        Object [] b = {3,1,2};
        boolean result = Arrays.deepEquals(a, b);
        System.out.println(result);
    }

}
