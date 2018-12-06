package zrz.thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 缓存线程池，超过60s池内线程没有被使用，则删掉。就是一个动态的线程池，我们不需要关心线程数
 * @author zhouruizhong
 * @date 2018/11/2 16:25
 */
public class TestCachedThreadPool {

    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("demo-%d").build();
        ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);

        executorService.execute(() ->{
            System.out.println(Thread.currentThread().getName());
        });
        executorService.shutdown();
    }

}
