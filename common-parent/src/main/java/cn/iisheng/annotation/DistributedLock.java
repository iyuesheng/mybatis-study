package cn.iisheng.annotation;

import java.lang.annotation.*;

/**
 * @author iisheng
 * @date 2019/10/31 09:04:11
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DistributedLock {
    /**
     * 限制请求时间, 默认限制500毫秒
     */
    int millisecond() default 500;

    /**
     * 业务编号
     */
    String bizNo() default "defaultBiz";
}
