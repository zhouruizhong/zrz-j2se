package zrz.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 周瑞忠
 * @version 1.0
 * @date 2018/12/13 20:43
 */

@Component
@Aspect
public class Advice {

    @Pointcut("execution(* *.m2())")
    public void point(){
    }

    @Before("point()")
    public void before(){
        System.out.println("这是个前置消息");
    }

    @After("point()")
    public void after(){
        System.out.println("这是个后置消息");
    }

    @Around("point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("注解类型环绕通知..环绕前");
        proceedingJoinPoint.proceed();
        System.out.println("注解类型环绕通知..环绕后");
    }


}
