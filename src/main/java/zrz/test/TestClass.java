package zrz.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.test
 * @class_name TestClass
 * @description java类作用描述
 * @createdate 2018/11/17 0:11
 */
public class TestClass {

    String name;
    int age;

    public TestClass(){

    }

    {
        System.out.println("这是一个普通代码块");
    }

    static {
        System.out.println("这是一个静态方法块");
    }

    public void method(){
        System.out.println("这是一个普通的方法");
    }

    public class InnerClass{
        public void method(){
            System.out.println("这是一个内部类");
        }
    }

    public static class StaticClass{
        public void staticMethod(){
            System.out.println("这是一个静态内部类");
        }
    }

    Thread t1 = new Thread(() -> {
                    System.out.println("这是一个匿名内部类");
    });


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("sss");
        stringList.add("ddd");
        Collections.sort(stringList, (s1 , s2) -> s1.compareToIgnoreCase(s2));
         stringList.stream().count();
    }
}
