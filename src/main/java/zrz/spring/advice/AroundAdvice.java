package zrz.spring.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author zhouruizhong
 * @date 2018/12/14 14:52
 */
public class AroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕-前置");
        Object result = invocation.proceed();
        System.out.println("环绕--后置");
        return result;
    }
}
