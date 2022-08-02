package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component // //@Component： 类似于 xml 中的 bean 标签
@Aspect //告诉IoC这是一个切面类
public class LoggerApsect {
    @Before("execution(public int aop.Calc.*(..))") // 那些方法需要执行
    public void before(JoinPoint joinPoint) {
//        joinPoint： 目标方法和切面的一个链接
        String name = joinPoint.getSignature().getName(); //获取方法名
        Object[] args = joinPoint.getArgs(); //获取方法参数
        System.out.println("方法 "+name+" 的参数时"+joinPoint.getArgs().toString());
    }
    @AfterReturning(value = "execution(public int aop.Calc.*(..))",returning = "result")// returning = "result"，执行之后获取结果，保存在 result 中
    public void after(JoinPoint joinPoint, Object result) {
//      result： 报错方法执行的结果，需要用 returning 修饰
        String name = joinPoint.getSignature().getName(); //获取方法名
        Object[] args = joinPoint.getArgs(); //获取方法参数
        System.out.println("方法 "+name+" 的结果是"+result);
    }
}
