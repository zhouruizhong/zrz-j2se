package zrz.thread.lock;

/**
 * @author zhouruizhong
 * @title: Account
 * @project zrz-j2se
 * @description TODO
 * @date 2018/11/5 14:59
 */
public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
