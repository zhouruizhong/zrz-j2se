package zrz.spring.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author zhouruizhong
 * @date 2018/12/14 9:55
 */
public class MyThrowsAdvice implements ThrowsAdvice {

    public void throwsAdvice(Exception e){
        System.out.println("这是异常通知=" + e.getMessage());
    }
}
