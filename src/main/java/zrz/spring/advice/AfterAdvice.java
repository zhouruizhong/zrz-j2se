package zrz.spring.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author zhouruizhong
 * @date 2018/12/13 17:58
 */
public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("");
        System.out.println("这是后置通知.......");
        System.out.println("");
        System.out.println("切点方法返回值=" + o.toString());
        System.out.println("切点方法=" + method.getName());
        System.out.println("切点方法参数=" + Arrays.toString(objects));
        System.out.println("切点所在类对象=" + o1.getClass().getName());
        System.out.println("");
    }
}
