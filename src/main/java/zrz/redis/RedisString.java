package zrz.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

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
        return new Jedis("127.0.0.1", 6379);
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

    /**
     * 对 key 所储存的字符串值，获取指定偏移量上的位(bit)
     * @param key 键
     * @param offset 偏移量
     * @return boolean
     */
    public static Boolean getBit(String key, int offset){
        Jedis jedis = getJedis();
        return jedis.getbit(key, offset);
    }

    /**
     * 获取所有(一个或多个)给定 key 的值。
     * @param keys 多个键
     * @return List<String>
     */
    public static List<String> mGet(String... keys){
        Jedis jedis = getJedis();
        return jedis.mget(keys);
    }

    /**
     * 对 key 所储存的字符串值，设置或清除指定偏移量上的位(bit)。
     * @param key 键
     * @param offset 偏移量
     * @param value 值
     * @return boolean
     */
    public static Boolean setBit(String key, int offset, String value){
        Jedis jedis = getJedis();
        return jedis.setbit(key, offset, value);
    }

    /**
     * 将值 value 关联到 key ，并将 key 的过期时间设为 seconds (以秒为单位)
     * @param key 键
     * @param seconds 秒
     * @param value 值
     */
    public static String setEx(String key, int seconds, String value){
        Jedis jedis = getJedis();
        return jedis.setex(key, seconds, value);
    }

    /***
     * 只有在 key 不存在时设置 key 的值
     * @param key 键
     * @param value 值
     * @return Long
     */
    public static Long setNx(String key, String value){
        Jedis jedis = getJedis();
        return jedis.setnx(key, value);
    }

    /**
     * 用 value 参数覆写给定 key 所储存的字符串值，从偏移量 offset 开始
     * @param key
     * @param offset
     * @param value
     * @return
     */
    public  static Long setRange(String key, long offset, String value){
        Jedis jedis = getJedis();
        return jedis.setrange(key, offset, value);
    }

    public static void main(String[] args) {
        System.out.println("result=" + set("name", "zhou rui zhong"));
        System.out.println("name 的值是：" + get("name"));
        System.out.println(getRange("name", 2, 3));

    }
}
