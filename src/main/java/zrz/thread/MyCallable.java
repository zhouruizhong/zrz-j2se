package zrz.thread;

import java.util.concurrent.Callable;

/**
 * @author zhouruizhong
 * @date 2018/12/5 10:52
 */
public class MyCallable implements Callable<Integer> {

    private int i = 0;

    /**
     * 带返回值
     * @return Integer
     * @throws Exception 抛出异常
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i);
            sum += i;
        }
        System.out.println();
        return sum;
    }
}
