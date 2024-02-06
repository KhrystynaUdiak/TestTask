

public class FunctionV5 extends Function{
    public double calculateFunction( double x) {
        double a = 2.3;

        if (x <= 0.3) {
            return 1.5 * Math.pow(a * Math.cos(x), 2);
        } else if( x > 0.3 && x <= 2.3){
            return Math.pow((x - 2), 2) + 6*a;
        } else{
            return 3*a * Math.tan(x);
        }
    }

}
