package zrz.spring.entity;

/**
 * @author zhouruizhong
 * @date 2018/12/12 15:01
 */
public class User {

    private int id;
    private String name;

    public User(){}

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
