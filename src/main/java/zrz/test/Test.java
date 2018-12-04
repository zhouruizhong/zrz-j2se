package zrz.test;

/**
 * @author zhouruizhong
 * @date 2018/11/29 11:23
 */
public class Test {

    public static void main(String[] args) {
        // 向下转型
        Jessy jessy = (Jessy) new GirlFriend();
        jessy.singing();
        jessy.speak();

        // 向上转型
        GirlFriend girlFriend = new Jessy();
        ((Jessy) girlFriend).singing();
        girlFriend.speak();
    }
}

class GirlFriend{

    private String name;
    private double bust;
    private double waist;
    private double hip;

    public GirlFriend(){}

    void speak(){
        System.out.println(name + "在说话");
    }
}

class Jessy extends GirlFriend{
    private String name = "jessy";

    void singing (){
        System.out.println(name + "在唱歌");
    }
}

class Vicky{

    private String name;
    void draw(){
        System.out.println(name + "在画画");
    }
}

class Kim{
    private String name;
    void dance(){
        System.out.println(name + "在跳舞");
    }
}
