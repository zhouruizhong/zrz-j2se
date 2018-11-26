package zrz.redis;

import redis.clients.jedis.Jedis;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.redis
 * @class_name RedisString
 * @description java类作用描述
 * @createdate 2018/11/25 22:18
 */
public class RedisString {

    private static synchronized Jedis getJedis (){
        return new Jedis("192.168.1.88", 6579);
    }

    /**
     * 设置指定 key 的值
     * @param key 键
     * @param value 值
     * @return String
     */
    public static String set(String key, String value){
        Jedis jedis = getJedis();
        return jedis.set(key, value);
    }

    /**
     * 获取指定 key 的值
     * @param key 键
     * @return String
     */
    public static String get(String key){
        Jedis jedis = getJedis();
        return jedis.get(key);
    }

    /**
     * 返回 key 中字符串值的子字符
     * @param key 键
     * @param start 起始位置
     * @param end 结束位置
     */
    public static String getRange(String key, long start, long end){
        Jedis jedis = getJedis();
        return jedis.getrange(key, start, end);
    }

    /**
     * 将给定 key 的值设为 value ，并返回 key 的旧值(old value)。
     * @param key 键
     * @param value 新值
     * @return String 旧值
     */
    public static String getSet(String key, String value){
        Jedis jedis = getJedis();
        return jedis.getSet(key, value);
    }

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println("连接成功");

        jedis.set("name", "zhou rui zhong");

        System.out.println("name 的值是：" + jedis.get("name"));
    }
}
