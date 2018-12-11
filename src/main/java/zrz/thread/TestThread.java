package zrz.thread;

/**
 * @author zhouruizhong
 * @title: TestThread
 * @project zrz-j2se
 * @description TODO
 * @date 2018/11/2 16:25
 */
public class TestThread {

    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();
        System.out.println(thread.getName());

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        myRunnable.stop();
        thread1.interrupt();
        System.out.println("线程停止了");

        Thread.yield();
    }
}
