package zrz.spring.factory;

import zrz.spring.entity.Audi;
import zrz.spring.entity.Baoma;
import zrz.spring.entity.Car;

/**
 * @author zhouruizhong
 * @date 2018/12/12 15:44
 */
public class CarFactory {

    public static Car getCarInstance(){
        return new Car("奥迪","红色");
    }
}
