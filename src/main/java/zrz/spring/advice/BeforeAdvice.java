package zrz.spring.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author zhouruizhong
 * @date 2018/12/13 16:40
 */
public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("这是前置通知.......");
        System.out.println("");
        System.out.println("切点方法名=" + method.getName());
        System.out.println("切点方法参数=" + Arrays.toString(objects));
        System.out.println("切点方法所在类对象=" + o.getClass().getName());
        System.out.println("");
    }
}
