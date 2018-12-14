package zrz.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author 周瑞忠
 * @version 1.0
 * @date 2018/12/13 20:43
 */

@Component
@Aspect
public class Advice {

    @Pointcut("execution(* zrz.spring.aop.MyAop.m2())")
    public void point() {
    }

    @Before("point()")
    public void before() {
        System.out.println("");
        System.out.println("这是个前置消息");
        System.out.println("");
    }

    @After("point()")
    public void after() {
        System.out.println("");
        System.out.println("这是个后置消息");
        System.out.println("");
    }

    @AfterThrowing(throwing="e", pointcut="point()")
    public void exception(Exception e) {
        System.out.println("");
        System.out.println("这是异常消息");
        System.out.println("");
    }

    @AfterReturning(returning = "s", pointcut = "point()")
    public String returning(String s){
        System.out.println("");
        System.out.println("这是返回消息 result=" + s);
        System.out.println("");
        return "success";
    }

    @Around("point()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("");
        System.out.println("注解类型环绕通知..环绕前");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("注解类型环绕通知..环绕后");
        System.out.println("");
        return result;
    }

}
