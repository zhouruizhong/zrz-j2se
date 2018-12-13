package zrz.spring.entity;

/**
 * @author zhouruizhong
 * @date 2018/12/12 15:45
 */
public class Audi extends Car{

    private String name;
    private String color;

    public Audi(){

    }

    public Audi(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public void driver(){
        System.out.println("奥迪车在行驶....");
    }
}
