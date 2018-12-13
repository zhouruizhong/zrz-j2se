package zrz.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author zhouruizhong
 * @date 2018/12/13 16:27
 */
@Repository
public class MyAop {

    public void m1(){
        System.out.println("这是方法m1");
    }

    public void m2(){
        System.out.println("这是方法m2（切点方法）");
    }

    public void m3(){
        System.out.println("这是方法m3");
    }

}
