package zrz.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author zhouruizhong
 * @date 2018/12/13 16:27
 */
@Service
public class MyAop {

    public void m1(){
        System.out.println("这是方法m1");
    }

    @Pointcut()
    public void m2(){
        System.out.println("这是方法m2");
    }

    public void m3(){
        System.out.println("这是方法m3");
    }

}
