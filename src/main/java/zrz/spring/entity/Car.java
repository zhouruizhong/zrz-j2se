package zrz.spring.entity;

/**
 * @author zhouruizhong
 * @date 2018/12/12 15:53
 */
public class Car {

    private String name;
    private String color;

    public Car(){

    }

    public Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void driver(){
        System.out.println(name + "在行驶...");
    }
}
