package gmbh.conteco.schlungeinstieg.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Profile("log")
public class LoggingAspect {
    @Before("@annotation(LogMe)))")
    public void logger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
    }
}
