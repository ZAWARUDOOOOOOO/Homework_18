package spring.calculator;

public class Calculator {

    private SumProcessor sum;
    private SubtractProcessor sub;
    private MultiplyProcessor mul;
    private DivideProcessor div;

    public Calculator(SumProcessor sum, SubtractProcessor sub, MultiplyProcessor mul, DivideProcessor div) {
        this.sum = sum;
        this.sub = sub;
        this.mul = mul;
        this.div = div;
    }

    public double sum(double arg1, double arg2) {
        return sum.process(arg1, arg2);
    }

    public double subtract(double arg1, double arg2) {
        return sub.process(arg1, arg2);
    }

    public double multiply(double arg1, double arg2) {
        return mul.process(arg1, arg2);
    }

    public double divide(double arg1, double arg2) {
        return div.process(arg1, arg2);
    }
}
