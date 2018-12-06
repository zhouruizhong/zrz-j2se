package zrz.thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 调度指定时间执行任务的线程池，只有一个线程
 * @author 周瑞忠
 * @date 2018/12/6 22:14
 */
public class TestSingleScheduledThreadPool {

    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("demo-%d").build();
        ScheduledExecutorService pool = Executors.newSingleThreadScheduledExecutor(threadFactory);

        //参数少了初始延迟时间
        pool.schedule(() -> {
            System.out.println(Thread.currentThread().getName());
        }, 1000, TimeUnit.MILLISECONDS);
    }
}
