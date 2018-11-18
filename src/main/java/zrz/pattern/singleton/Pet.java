package zrz.pattern.singleton;

/**
 * @author 唐朝
 * @version 1.0
 * @projectName zrz-j2se
 * @package zrz.design.pattern.singleton
 * @className Pet
 * @description java类作用描述
 * @createDate 2018/11/8 0:00
 * @updateUser 更新者
 * @updateDate 2018/11/8 0:00
 * @updateRemark 更新说明
 */
public class Pet {

    private static Pet pet = new Pet();

    private Pet() {

    }

    public static Pet getInstance() {
        // 此代码版本为立即加载

        // 此版本代码的缺点是不能有其他实例变量

        // 因为getInstance()方法没有同步

        // 所以有可能出现非线程安全的问题

        return pet;
    }
}
