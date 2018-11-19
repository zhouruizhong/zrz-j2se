package zrz.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author zhouruizhong
 * @title: TestHashtable
 * @project zrz-j2se
 * @description TODO
 * @date 2018/11/14 11:54
 */
public class TestHashtable {

    public static void main(String[] args) {
        Map<String, Object> map = new Hashtable<>(11);

        map.put("apple", "苹果");
        map.put("apple", "红苹果");
        map.put("banana", "香蕉");
        map.put("orange", "桔子");

        System.out.println("集合中是否存在梨子:" + map.containsKey("pear"));
        System.out.println("集合中是否存在桔子:" + map.containsValue("桔子"));

    }
}
