package zrz.thread;

/**
 * @author zhouruizhong
 * @date 2018/12/5 10:01
 */
public class MyRunnable implements Runnable {

    private volatile boolean stop;

    @Override
    public void run() {
        while (!stop){
            System.out.println("实现runnable接口的线程开始执行了....");
        };
    }

    public void stop(){
        this.stop = true;
    }
}
