public class FunctionV10 extends Function{
    public double calculateFunction(double x) {
        double t  = 2.2;
        if (x <= 0.9) {
            if( x == 0){
                throw new ArithmeticException();
            }
            double lnValue = Math.log(x);
            double numerator = Math.pow(lnValue, 3) + Math.pow(x, 2);
            double denominator = Math.sqrt(x + t);

            return numerator / denominator;
        } else {
            return Math.cos(x) + t * Math.pow(Math.sin(x), 2);
        }
    }
}
