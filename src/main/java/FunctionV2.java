

public class FunctionV2 extends Function{
        public double calculateFunction( double x) {
            double a = 1.5;
            if (x < 1.7) {
                if(x == 0){
                    throw new ArithmeticException();
                }
                return Math.PI * Math.pow(x, 2) - 7 / Math.pow(x, 2);
            } else if( x == 1.7){
                return a * Math.pow(x, 3) + 7 * Math.sqrt(x);
            } else{
                return Math.log10(x + 7 * Math.sqrt(x));
            }
        }

    }


