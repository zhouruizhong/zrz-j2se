package zrz.thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author zhouruizhong
 * @title: TestScheduledTreadPool
 * @project zrz-j2se
 * @ TODO 创建一个定长线程池，支持定时及周期性任务执行。延迟执行示例代码如下：
 * @date 2018/11/2 16:27
 */
public class TestScheduledThreadPool {

    public static void main(String[] args) {

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ExecutorService scheduledThreadPool = new ScheduledThreadPoolExecutor(20, namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        ((ScheduledThreadPoolExecutor) scheduledThreadPool).schedule(() ->{
            System.out.println("当前运行的线程名称是：" + Thread.currentThread().getName());
        },0L, TimeUnit.MILLISECONDS);
        scheduledThreadPool.shutdown();
    }
}
