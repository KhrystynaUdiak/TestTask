public class FunctionV8 extends Function{
    public double calculateFunction(double x) {

        if (x > 3.4) {
            return Math.sin(x) * Math.log(x);
        } else {
            return Math.pow(Math.cos(x), 2);
        }
    }
}
