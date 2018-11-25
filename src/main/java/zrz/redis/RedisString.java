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

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println("连接成功");

        jedis.set("name", "zhou rui zhong");

        System.out.println("name 的值是：" + jedis.get("name"));
    }
}
