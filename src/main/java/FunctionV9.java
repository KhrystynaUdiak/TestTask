public class FunctionV9 extends Function{
    public double calculateFunction(double x) {
        double a  = 20.3;
        if (x > 1.2) {
            return Math.log(x + 1);
        } else {
            return Math.sin(Math.sqrt(a * x));
        }
    }
}
