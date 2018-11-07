package zrz.design.pattern.singleton;

/**
 * @author 唐朝
 * @version 1.0
 * @projectName zrz-j2se
 * @package zrz.design.pattern.singleton
 * @className TestThread
 * @description java类作用描述
 * @createDate 2018/11/8 0:04
 * @updateUser 更新者
 * @updateDate 2018/11/8 0:04
 * @updateRemark 更新说明
 */
public class SingletonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Pet.getInstance().hashCode());
    }
}
