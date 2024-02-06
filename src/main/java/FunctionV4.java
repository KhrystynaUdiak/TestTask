import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionV4 extends Function {
    public double calculateFunction( double x) {
        double a = 1.65;

        if (x < 1.3) {
            if(x == 0){
                throw new ArithmeticException();
            }

            return Math.PI * Math.pow(x, 2) - 7 / Math.pow(x, 2);
        } else if( x == 1.3){
            return a/Math.pow(x, 3) + 7 * Math.sqrt(x);
        } else{
            return Math.log(x + 7 * Math.sqrt(Math.abs(x + a)));
        }
    }
}
