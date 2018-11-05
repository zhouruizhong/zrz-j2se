package zrz.thread.lock;

/**
 * @author zhouruizhong
 * @title: TestThreadLock
 * @project zrz-j2se
 * @description TODO
 * @date 2018/11/5 15:00
 */
public class TestThreadLock extends Thread {

    private double money;
    private Account account;

    private TestThreadLock(String name, Account account, double money){
        super(name);
        this.account = account;
        this.money = money;
    }

    @Override
    public void  run(){
        synchronized (account){
            double balance = account.getBalance();
            if (money <= balance){
                System.out.println(getName() + "取钱成功,吐出钞票:" + money);
                account.setBalance(balance - money);
                System.out.println("余额是:" + account.getBalance());
            }else {
                System.out.println(getName() + "取钱失败,余额不足");
            }
        }

    }

    public static void main(String[] args) {
        Account account = new Account("周瑞忠", 5000);

        new TestThreadLock("甲", account, 2000).start();
        new TestThreadLock("乙", account, 3000).start();
        new TestThreadLock("丙", account, 1000).start();
        new TestThreadLock("丁", account, 1000).start();
    }

}
