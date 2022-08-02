package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//todo 02: 类似于 beans.xml 类, 通过 @BeanConfiguration 来表示其功能
@Configuration
public class BeanConfiguration {


    @Bean
    /**
     * todo
     * @Bean 告诉框架这是一个方法，可以使用 getBean（） 调用
     *
     * 使用方式：
     *  AnnotationConfigApplicationContext ioc2 = new AnnotationConfigApplicationContext(BeanConfiguration.class);
     *  DataConfig bean = ioc2.getBean(DataConfig.class);
     *  System.out.println(bean);
     */
    public DataConfig dataConfig() {
        //        下面这个代码与如下xml 功能类似
        /**
         *<?xml version="1.0" encoding="UTF-8"?>
         * <beans xmlns="http://www.springframework.org/schema/beans"
         *        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         *        xsi:schemaLocation="http://www.springframework.org/schema/beans
         *    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
         *     <bean id="config" class="demo.DataConfig">
         *         <property name="username" value="sunwu"> </property> <!-- todo :  01: 设置值, 相当于自动调用set方法-->
         *         <property name="password" value="pass"> </property><!--设置值, 相当于自动调用set方法-->
         *     </bean>
         * </beans>
         */
        DataConfig dataConfig = new DataConfig();
        dataConfig.setPassword("sunwu");
        dataConfig.setUsername("孙武");
        return dataConfig;
    }
}
