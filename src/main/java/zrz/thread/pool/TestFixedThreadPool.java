package zrz.thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 固定数量的线程池
 * @author zhouruizhong
 * @date 2018/11/2 16:26
 */
public class TestFixedThreadPool {

    private static int nThreads = 50;

    public static void main(String[] args) {

        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("demo-%d").build();
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads, threadFactory);

        executorService.submit(() -> {
            System.out.println("這是一個固定數量的綫程池");
        });
    }
}
