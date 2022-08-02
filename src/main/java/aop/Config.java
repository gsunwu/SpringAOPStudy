package aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // 告诉 IoC， 这是一个配置类
@EnableAspectJAutoProxy //开启切面编程， 否则 @Aspect 不起作用
public class Config {
}
