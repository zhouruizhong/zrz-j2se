package zrz.thread.lock;

/**
 * @ProjectName: zrz-j2se
 * @Package: zrz.thread.lock
 * @ClassName: TestVolatile
 * @Description: java类作用描述
 * @Author: 唐朝
 * @CreateDate: 2018/11/5 22:53
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/5 22:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TestVolatile implements Runnable {

    private double money;
    private Account account;

    private TestVolatile(String name, Account account, double money){
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        double balance = account.getBalance();
        if (money <= balance){
            System.out.println(account.getName() + "取钱成功,吐出钞票:" + money);
            account.setBalance(balance - money);
            System.out.println("余额是:" + account.getBalance());
        }else {
            System.out.println(account.getName()  + "取钱失败,余额不足");
        }
    }

    public static void main(String[] args) {
        Account account = new Account("周瑞忠", 5000);

        new TestVolatile("甲", account, 2000);
        new TestVolatile("乙", account, 3000);
        new TestVolatile("丙", account, 1000);
        new TestVolatile("丁", account, 1000);
    }
}
