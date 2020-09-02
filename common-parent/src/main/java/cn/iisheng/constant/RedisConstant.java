package cn.iisheng.constant;

/**
 * @author iisheng
 * @date 2019/10/31 09:08:03
 */
public class RedisConstant {

    public static String getKey(String token, String bizNo) {
        return token + ":" + bizNo;
    }

}
