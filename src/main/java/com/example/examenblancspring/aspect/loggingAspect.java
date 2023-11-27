package com.example.examenblancspring.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class loggingAspect {

    @After("execution(* com.example.examenblancspring.Services.add*.*(..))")
    public void logmethodeEnTry(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("methode executee");
    }
}
