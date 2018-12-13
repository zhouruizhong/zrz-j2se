package zrz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zrz.spring.entity.Audi;
import zrz.spring.entity.Car;
import zrz.spring.entity.Person;

/**
 * @author zhouruizhong
 * @date 2018/12/12 14:32
 */
public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Person person = applicationContext.getBean("person", Person.class);
        //person.setId(1);
        //person.setName("周瑞忠");

        Car car = applicationContext.getBean("car", Car.class);
        car.driver();
    }
}
