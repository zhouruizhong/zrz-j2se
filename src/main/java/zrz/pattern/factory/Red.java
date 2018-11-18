package zrz.pattern.factory;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.design.factory
 * @class_name Red
 * @description java类作用描述
 * @createdate 2018/11/17 22:39
 */
public class Red implements  Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
