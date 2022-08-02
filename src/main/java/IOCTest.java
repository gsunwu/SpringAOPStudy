import config.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import config.DataConfig;


public class IOCTest {
    public static void main(String[] args) {
//      todo 00: 常规方法
        DataConfig dataConfig = new DataConfig();
        dataConfig.setPassword("sunwu");
        dataConfig.setUsername("孙武");
        System.out.println(dataConfig);

//        todo 01: 设置值, 相当于自动调用set方法
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Object config = ioc.getBean("config");
        System.out.println(config);


//        todo 02: 指定配置类
        AnnotationConfigApplicationContext ioc2 = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        DataConfig bean = ioc2.getBean(DataConfig.class);
        System.out.println(bean);

//        todo 03: 多个类，通过包
        AnnotationConfigApplicationContext ioc3 = new AnnotationConfigApplicationContext("config");
        DataConfig bean3 = ioc2.getBean(DataConfig.class);
        System.out.println(bean3);

//        todo 04: 不用配置类: 扫包+租界
//        不再依赖 XML 或  配置类
//        在类上加 @Component ， 告诉 spring 这个类需要加载 通过 @Value 设置值
//        关联关系自动注入@Autowired ,通过名字取: @Autowired + autowired
        AnnotationConfigApplicationContext ioc5 = new AnnotationConfigApplicationContext("anno");
        anno.DataConfig bean1 = ioc5.getBean(anno.DataConfig.class);
        System.out.println(bean1);

        /*
        输出
        DataConfig(username=孙武, password=sunwu)
        DataConfig(username=sunwu, password=pass)
        DataConfig(username=孙武, password=sunwu)
        DataConfig(username=孙武, password=sunwu)
        DataConfig(username=111, password=222)
        */
    }
}
