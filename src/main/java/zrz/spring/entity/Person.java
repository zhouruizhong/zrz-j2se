package zrz.spring.entity;

/**
 * @author zhouruizhong
 * @date 2018/12/12 14:33
 */
public class Person {
    private int id;
    private String name;

    public Person(){
        System.out.println("这是一个无参构造方法");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
