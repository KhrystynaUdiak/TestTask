public class FunctionV6 extends Function{
    public double calculateFunction(double x) {
        double a = 2.4;

        if (x > a) {
            return x * Math.sqrt(x - a);
        } else if (x == a) {
            return x * Math.sin(a * x);
        } else {
            return Math.exp(-a * x) * Math.cos(a * x);
        }
    }
}
