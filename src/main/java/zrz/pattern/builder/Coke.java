package zrz.pattern.builder;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.pattern.builder
 * @class_name Coke
 * @description java类作用描述
 * @createdate 2018/11/18 14:39
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
