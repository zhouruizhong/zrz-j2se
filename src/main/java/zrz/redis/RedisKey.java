package zrz.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.redis
 * @class_name RedisKey
 * @description java类作用描述
 * @createdate 2018/11/25 22:22
 */
public class RedisKey {

    private static String HOST = "127.0.0.1";

    public static synchronized Jedis getJedis (){
        return new Jedis(HOST);
    }

    static Set<String> keys(){
        Jedis jedis = getJedis();
        return jedis.keys("*");
    }

    static long del(String key){
        Jedis jedis = getJedis();
        return jedis.del(key);
    }

    public static void main(String[] args) {

        Set<String> set = keys();
        set.forEach(System.out::println);

        long d = del("runoobkey");
        System.out.println(d);
    }
}
