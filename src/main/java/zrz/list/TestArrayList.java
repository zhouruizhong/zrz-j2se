package zrz.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 是一个数组队列，相当于动态数组。它由数组实现，随机访问效率高，随机插入、随机删除效率低。
 * @author zhouruizhong
 * @date 2018/11/23 11:59
 */
public class TestArrayList {

    private static List<String> list = new ArrayList<>(10);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new AddString("s1"));
        Thread thread2 = new Thread(new AddString("s2"));
        Thread thread3 = new Thread(new AddString("s3"));
        Thread thread4 = new Thread(new AddString("s4"));
        Thread thread5 = new Thread(new AddString("s5"));
        Thread thread6 = new Thread(new AddString("s6"));
        System.out.println("开始打印list");
        list.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("结束打印list");
    }

    static class AddString implements Runnable{

        private String string;

        public AddString(String s){
            this.string = s;
        }

        @Override
        public void run(){
            list.add(string);
        }
    }
}
