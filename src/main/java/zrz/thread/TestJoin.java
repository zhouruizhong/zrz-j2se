package zrz.thread;

/**
 * @author zhouruizhong
 * @date 2018/12/6 9:56
 */
public class TestJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
                System.out.println("First task started");
                System.out.println("Sleeping for 2 seconds");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("First task completed");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Second task completed");
        });
        Thread t3 = new Thread(() -> {
            System.out.println("three task completed");
        });
        t1.start();
        t2.start();
        t1.join();
        t3.start();
    }
}
