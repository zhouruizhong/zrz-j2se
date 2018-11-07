package zrz.design.pattern.singleton;

/**
 * @author 唐朝
 * @version 1.0
 * @projectName zrz-j2se
 * @package zrz.design.pattern.singleton
 * @className TestSingleton
 * @description java类作用描述
 * @createDate 2018/11/8 0:09
 * @updateUser 更新者
 * @updateDate 2018/11/8 0:09
 * @updateRemark 更新说明
 */
public class TestSingleton {

    public static void main(String[] args) {

        SingletonThread singletonThread1 = new SingletonThread();
        SingletonThread singletonThread2 = new SingletonThread();
        SingletonThread singletonThread3 = new SingletonThread();

        singletonThread1.start();
        singletonThread2.start();
        singletonThread3.start();
    }
}
