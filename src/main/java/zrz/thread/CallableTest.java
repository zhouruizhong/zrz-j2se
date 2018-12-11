package zrz.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author zhouruizhong
 * @date 2018/12/5 11:22
 */
public class CallableTest {

    public static void main(String[] args) {
        // 创建MyCallable对象
        Callable<Integer> callable = new MyCallable();
        //使用FutureTask 类包装MyCallable对象
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        //
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Thread thread = new Thread(futureTask);
                thread.start();
            }
            if (i == 32){

            }
        }
        System.out.println("主线程for循环执行完毕....");
        try{
            int sum = futureTask.get();
            System.out.println("sum = " + sum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
