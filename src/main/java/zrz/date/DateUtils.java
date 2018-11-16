package zrz.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.date
 * @class_name DateUtils
 * @description java类作用描述
 * @createdate 2018/11/17 0:52
 */
public class DateUtils {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        System.out.println("当前时间是:" + localTime);
    }
}
