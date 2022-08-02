import aop.ICalc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AOPTest {
    public static void main(String[] args) {
        /*
        * 验证 AOP 是否起作用
        * 输出：
        方法 add 的参数时[Ljava.lang.Object;@9ebe38b
        方法 add 的结果是3
        3
        方法 sub 的参数时[Ljava.lang.Object;@484094a5
        方法 sub 的结果是-1
        -1
        方法 mul 的参数时[Ljava.lang.Object;@38234a38
        方法 mul 的结果是2
        2
        方法 div 的参数时[Ljava.lang.Object;@63fbfaeb
        方法 div 的结果是0
        0

        Process finished with exit code 0

        * */
        AnnotationConfigApplicationContext aop = new AnnotationConfigApplicationContext("aop");
        ICalc bean = aop.getBean(ICalc.class);
        System.out.println(bean.add(1, 2));
        System.out.println(bean.sub(1, 2));
        System.out.println(bean.mul(1, 2));
        System.out.println(bean.div(1, 2));
    }
}
