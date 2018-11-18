package zrz.pattern.factory;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.design.factory
 * @class_name AbstractFactory
 * @description java类作用描述
 * @createdate 2018/11/17 22:41
 */
public abstract class AbstractFactory {

    /**
     *
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     *
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape) ;
}
