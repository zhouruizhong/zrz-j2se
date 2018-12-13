package zrz.value;

/**
 * @author zhouruizhong
 * @date 2018/11/27 16:27
 */
public class Test {

    public static void lose(int a){
        a = 10;
        System.out.println("a = " + a);
    }

    public static void subString(String string){
        string = string.substring(2);
        System.out.println("字符串截取：" + string);
    }

    public static void change(Person person){
        person.age = 12;
        person.name = "张三";
    }

    public static void main(String[] args) {
        // 值传递
        int a = 5;
        lose(a);
        System.out.println("a = " + a);

        // 值传递
        String string = "zhouruizhong";
        subString(string);
        System.out.println(string);

        // 引用传递
        Person person = new Person("李四",16);
        System.out.println("改变前 name = " + person.name);
        System.out.println("改变前 age = " + person.age);
        change(person);
        System.out.println("改变后 name = " + person.name);
        System.out.println("改变后 age = " + person.age);
    }

}
class Person{
    String name;
    int age;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
