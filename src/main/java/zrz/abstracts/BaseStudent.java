package zrz.abstracts;

/**
 * @author 唐朝
 * @version 1.0
 * @projectName zrz-j2se
 * @package zrz.abstracts
 * @className BaseStudent
 * @description java类作用描述
 * @createDate 2018/11/8 0:36
 * @updateUser 更新者
 * @updateDate 2018/11/8 0:36
 * @updateRemark 更新说明
 */
public class BaseStudent extends Student {
    @Override
    void study() {
        System.out.println("base study");
    }
}
