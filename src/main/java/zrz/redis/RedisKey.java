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

    private static synchronized Jedis getJedis (){
        return new Jedis("192.168.1.88", 6579);
    }

    /**
     * 获取所有key
     * @return Set<String>
     */
    private static Set<String> keys(){
        Jedis jedis = getJedis();
        return jedis.keys("*");
    }

    /**
     * key 存在时删除 key。
     * @param key key名
     * @return long 1 成功0 失败
     */
    private static long del(String key){
        Jedis jedis = getJedis();
        return jedis.del(key);
    }

    /**
     * 序列化给定 key ，并返回被序列化的值。
     * @param key 键
     * @return byte[]
     */
    private static byte[] dump(String key){
        Jedis jedis = getJedis();
        return jedis.dump(key);
    }

    /**
     * 检查给定 key 是否存在
     * @param key 键
     * @return true 存在 false 不存在
     */
    private static boolean exists(String key){
        Jedis jedis = getJedis();
        return jedis.exists(key);
    }

    /**
     * 为给定 key 设置过期时间，以秒计。
     * @param key 键
     * @param timeout 过期时间
     */
    public static Long expire(String key, int timeout){
        Jedis jedis = getJedis();
        return jedis.expire(key, timeout);
    }

    /**
     * 将当前数据库的 key 移动到给定的数据库 db 当中
     * @param key 键
     * @param db 数据库索引
     * @return long
     */
    public static Long move(String key, int db){
        Jedis jedis = getJedis();
        return jedis.move(key, db);
    }

    /**
     * 移除 key 的过期时间，key 将持久保持
     * @param key 键
     * @return Long
     */
    public static Long persist(String key){
        Jedis jedis = getJedis();
        return jedis.persist(key);
    }

    /**
     * 以毫秒为单位返回 key 的剩余的过期时间
     * @param key 键
     * @return long
     */
    public static long pttl(String key){
        Jedis jedis = getJedis();
        return jedis.pttl(key);
    }

    /**
     * 以秒为单位，返回给定 key 的剩余生存时间(TTL, time to live)。
     * @param key 键
     * @return long
     */
    public static long ttl(String key){
        Jedis jedis = getJedis();
        return jedis.ttl(key);
    }

    /**
     * 从当前数据库中随机返回一个 key
     * @return String
     */
    private static String random(){
        Jedis jedis = getJedis();
        return jedis.randomKey();
    }

    /**
     * 修改 key 的名称
     * @param key 旧key
     * @param newKey 新key
     * @return string
     */
    private static String rename(String key, String newKey){
        Jedis jedis = getJedis();
        return jedis.rename(key, newKey);
    }

    /**
     * 仅当 newkey 不存在时，将 key 改名为 newkey
     * @param key 旧key
     * @param newKey 新key
     * @return long 1 成功 0 失败
     */
    private static Long renameNx(String key, String newKey){
        Jedis jedis = getJedis();
        return jedis.renamenx(key, newKey);
    }

    /**
     * 返回 key 所储存的值的类型。
     * @param key 键
     * @return String
     */
    private static String type(String key){
        Jedis jedis = getJedis();
        return jedis.type(key);
    }

    public static void main(String[] args) {

        Set<String> set = keys();
        set.forEach(System.out::println);

        long d = del("runoobkey");
        System.out.println(d);
    }
}
