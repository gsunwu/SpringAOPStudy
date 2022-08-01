package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //必须声明时一个方法
public class LoggerApsect {
    @Before("execution(public int aop.Calc.*(..))")
    public void before(JoinPoint joinPoint) {
//        joinPoint： 目标方法和切面的一个链接
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法 "+name+" 的参数时"+joinPoint.getArgs().toString());
    }
    @AfterReturning(value = "execution(public int aop.Calc.*(..))",returning = "result")//执行之后获取结果
    public void after(JoinPoint joinPoint, Object result) {
//        joinPoint： 目标方法和切面的一个链接
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法 "+name+" 的结果是"+result);
    }
}
