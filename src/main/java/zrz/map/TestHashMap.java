package zrz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 唐朝
 * @version 1.0
 * @projectName zrz-j2se
 * @package zrz.map
 * @className TestHashMap
 * @description java类作用描述
 * @createDate 2018/11/6 20:48
 * @updateUser 更新者
 * @updateDate 2018/11/6 20:48
 * @updateRemark 更新说明
 */
public class TestHashMap {

    public void test(){
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {

        Map<String, Object> map = new HashMap<>(16);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("map中加入"  + 2);
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("map中加入"  + 2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("map中加入"  + 3);
            }
        }).start();

        Thread.sleep(3000);
        Set<String> set = map.keySet();
        for (String string : set){
            System.out.println( "key = " + string);
        }

        Collection<Object> collection =  map.values();
        for (Object object : collection){
            System.out.println("value = " + object.toString());
        }
    }
}
