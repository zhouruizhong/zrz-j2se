package zrz.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhouruizhong
 * @date 2018/12/13 16:43
 */
public class TestAop {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyAop myAop = applicationContext.getBean("myAop", MyAop.class);
        myAop.m1();
        myAop.m2();
        myAop.m3();
    }
}
