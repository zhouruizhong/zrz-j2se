package zrz.thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 创建一个单线程化的线程池，
 * 它只会用唯一的工作线程来执行任务，
 * 保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 * @author zhouruizhong
 * @date 2018/11/2 16:28
 */
public class TestSingleThreadExecutor {

    public static void main(String[] args) {

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor(namedThreadFactory);

        singleThreadPool.execute(()-> System.out.println(Thread.currentThread().getName()));
        singleThreadPool.shutdown();

    }
}
