package zrz.pattern.factory;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.design.factory
 * @class_name Rectangle
 * @description java类作用描述
 * @createdate 2018/11/17 22:33
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
