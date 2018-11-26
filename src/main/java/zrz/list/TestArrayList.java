package zrz.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 是一个数组队列，相当于动态数组。它由数组实现，随机访问效率高，随机插入、随机删除效率低。
 * @author zhouruizhong
 * @date 2018/11/23 11:59
 */
public class TestArrayList {

    private static List<String> list = new ArrayList<>(10);

    public static void main(String[] args) {
        AddString thread1 = new AddString("s1");
        AddString thread2 = new AddString("s2");
        AddString thread3 = new AddString("s3");
        AddString thread4 = new AddString("s4");
        AddString thread5 = new AddString("s5");
        AddString thread6 = new AddString("s6");
        System.out.println("开始打印list");
        list.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("结束打印list");


        List<String> list = new ArrayList<>(10);
        list.add("马云");
        list.add("马化腾");
        list.add("任正非");
        list.add("王健林");
        list.add("李彦宏");
        list.add("刘强东");
        list.add("张一鸣");

        List<String> list1 = list.stream().filter(s -> s.contains("马")).collect(Collectors.toList());
        System.out.println(list1);
        list1.forEach(s -> {System.out.println(s);});
    }

    static class AddString implements Runnable{

        private String string;

        public AddString(String s){
            this.string = s;
        }

        @Override
        public void run(){
            System.out.println("开始添加");
            list.add(string);
            System.out.println("添加结束");
        }
    }
}
