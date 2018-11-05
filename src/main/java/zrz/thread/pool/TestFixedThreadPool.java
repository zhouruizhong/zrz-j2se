package zrz.thread.pool;

/**
 * @author zhouruizhong
 * @title: TestFixedThreadPool
 * @project zrz-j2se
 * @description TODO
 * @date 2018/11/2 16:26
 */
public class TestFixedThreadPool {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        },"fixedThreadPool").start();
    }
}
