package zrz.thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author zhouruizhong
 * @title: TestCachedThreadPool
 * @project zrz-j2se
 * @description TODO
 * @date 2018/11/2 16:25
 */
public class TestCachedThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(() ->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.shutdown();
    }

}
