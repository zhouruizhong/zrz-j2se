package zrz.pattern.builder;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.pattern.builder
 * @class_name Item
 * @description java类作用描述
 * @createdate 2018/11/17 22:44
 */
public interface Item {

    /**
     *
     * @return
     */
    public String name();

    /**
     *
     * @return
     */
    public Packing packing();

    /**
     *
     * @return
     */
    public float price();
}
