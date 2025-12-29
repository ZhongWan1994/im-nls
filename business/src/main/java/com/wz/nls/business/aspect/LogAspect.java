package com.wz.nls.business.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {
    /**
     * 定义切点
     * **/
    @Pointcut("execution(public * com.wz..*Controller.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("前置通知！");
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("环绕通知开始！");
        Object proceed = joinPoint.proceed();
        log.info("环绕通知结束！");
        return proceed;
    }
    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("后置通知！");
    }
}
