package com.modds.acpect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Aspect
@Profile("bench")
@Component
public class MethodTimeAspect {
    private static final Logger logger = LoggerFactory.getLogger(MethodTimeAspect.class);


    @Pointcut("execution(public * * (..) )")
    private void executeAll() {
    }

    @Before("executeAll()")
    public void before() {
        logger.info("Before Advice");
    }
}
