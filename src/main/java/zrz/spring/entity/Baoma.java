package zrz.spring.entity;

/**
 * @author zhouruizhong
 * @date 2018/12/12 15:46
 */
public class Baoma extends Car{

    private String name;
    private String color;
    private String code;

    public Baoma(){}

    public Baoma(String name, String color, String code){
        this.name = name;
        this.color = color;
        this.code = code;
    }
}
