package zrz.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author zhouruizhong
 * @date 2018/12/13 16:27
 */
@Component
public class MyAop {

    public void m1(){
        System.out.println("这是方法m1");
    }

    public String m2(){
        System.out.println("这是方法m2的无参方法");
        return "success";
    }

    public void m3(){
        System.out.println("这是方法m3");
    }

}
