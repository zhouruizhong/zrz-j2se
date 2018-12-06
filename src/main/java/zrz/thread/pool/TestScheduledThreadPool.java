package zrz.thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 创建一个定长线程池，支持定时及周期性任务执行。延迟执行示例代码如下：
 * @author zhouruizhong
 * @date 2018/11/2 16:27
 */
public class TestScheduledThreadPool {

    public static void main(String[] args) {

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ScheduledExecutorService  scheduledThreadPool = Executors.newScheduledThreadPool(10, namedThreadFactory);

        /*
         * 提交到线程池
         * 参数1：Runnable
         * 参数2：初始延迟时间
         * 参数3：间隔时间
         * 参数4：时间单位
         */
        scheduledThreadPool.scheduleAtFixedRate(() -> {
            System.out.println(Thread.currentThread().getName());
        }, 1000, 2000, TimeUnit.MILLISECONDS);

    }
}
