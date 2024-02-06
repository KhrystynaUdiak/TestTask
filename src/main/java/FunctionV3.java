

public class FunctionV3 extends Function {
    public double calculateFunction( double x) {
        double a = 2.7;
        double b = -0.3;
        int c = 4;
        if (x < 1.4) {
            return  a*Math.pow(x, 2) + b*x + c;
        } else if( x == 1.4){
            return a/x + Math.sqrt(Math.pow(x, 2) + 1);
        } else{
            return (a + b*x) / Math.sqrt(Math.pow(x, 2) + 1);
        }
    }
}
