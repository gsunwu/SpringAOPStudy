package aop;

import org.springframework.stereotype.Component;

@Component
public class Calc implements ICalc {
    @Override
    public int add(int a, int b) {
//        输出参数信息
        int res = a + b;
//        输出结果
        return res;
    }

    @Override
    public int sub(int a, int b) {
        int res = a - b;
        return res;
    }

    @Override
    public int mul(int a, int b) {
        int res = a * b;
        return res;
    }

    @Override
    public int div(int a, int b) {
        int res = a / b;
        return res;
    }
}
