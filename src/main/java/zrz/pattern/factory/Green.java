package zrz.pattern.factory;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.design.factory
 * @class_name Green
 * @description java类作用描述
 * @createdate 2018/11/17 22:40
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
