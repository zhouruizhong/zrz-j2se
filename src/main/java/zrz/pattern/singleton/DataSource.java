package zrz.pattern.singleton;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.design.pattern.singleton
 * @class_name DataSource
 * @description java类作用描述
 * @createdate 2018/11/17 22:24
 */
public class DataSource {

    private static DataSource ourInstance = new DataSource();

    public static DataSource getInstance() {
        return ourInstance;
    }

    private DataSource() {

    }
}
