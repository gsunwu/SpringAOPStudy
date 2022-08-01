package aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
//aop使用必须要一个 配置类, 使用@Configuration标识配置类
public class Config {
}
