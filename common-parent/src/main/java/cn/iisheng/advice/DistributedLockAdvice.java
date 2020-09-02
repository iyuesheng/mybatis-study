package cn.iisheng.advice;

import cn.iisheng.annotation.DistributedLock;
import cn.iisheng.constant.RedisConstant;
import cn.iisheng.utils.RedisLockUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author iisheng
 * @date 2019/10/31 09:05:45
 */
@Aspect
@Component
public class DistributedLockAdvice {

    @Autowired
    private RedisLockUtil redisLockUtil;

    @Around("@annotation(cn.iisheng.annotation.DistributedLock)")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        DistributedLock lock = method.getAnnotation(DistributedLock.class);

        String token = "";
        String requestId = "";

        String key = RedisConstant.getKey(token, lock.bizNo());

        boolean setNXSuccess = redisLockUtil.setNX(key, requestId, lock.millisecond());
        if (setNXSuccess) {
            Object result = joinPoint.proceed();
            redisLockUtil.unLock(key, requestId);
            return result;
        } else {
            throw new RuntimeException("操作太频繁，换一个姿势请求试一下~");
        }
    }

}
