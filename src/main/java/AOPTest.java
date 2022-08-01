import aop.ICalc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
//        目标：输出calc的参数和结果（开始和结束时）
//        实现：（拆开再合成）
//        1. 创建切面类(注入实体类和切面类(aop:aspectj-autoproxy></aop:aspectj-autoproxy>）
//        代理的类需是接口
//

        AnnotationConfigApplicationContext aop = new AnnotationConfigApplicationContext("aop");
        ICalc bean = aop.getBean(ICalc.class);
        int add = bean.add(1, 2);


    }
}
