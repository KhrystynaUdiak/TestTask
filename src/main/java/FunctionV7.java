public class FunctionV7 extends Function{
    public double calculateFunction(double x) {
    double b = 1.5;

        if (b*x <= 0.45) {
        return b*x - Math.tan(b*x);
    } else {
        return b*x + Math.log(b*x);
    }
}
}
