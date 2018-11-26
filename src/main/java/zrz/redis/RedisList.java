package zrz.redis;

import redis.clients.jedis.Jedis;

/**
 * @author 周瑞忠
 * @version 1.0
 * @project_name zrz-j2se
 * @package zrz.redis
 * @class_name RedisList
 * @description 列表
 * @createdate 2018/11/25 22:22
 */
public class RedisList {

    public static Jedis getJedis(){
        return new Jedis("127.0.0.1", 6379);
    }


}
