import java.util.List;

public class Main {
    public static void main(String[] args) {
        Function function = new Function();
        Function functionV2 = new FunctionV2();
        Function functionV3 = new FunctionV3();
        Function functionV4 = new FunctionV4();
        Function functionV5 = new FunctionV5();
        Function functionV6 = new FunctionV6();
        Function functionV7 = new FunctionV7();
        Function functionV8 = new FunctionV8();
        Function functionV9 = new FunctionV9();
        Function functionV10 = new FunctionV10();
        System.out.println(functionV2.calculateFunction(0.5));
        System.out.println(function.countSteps(0.2, 1.0, 2.0));

        double[][] arr =  functionV10.arrayFunctionsValue(0.5, 0.2, 2.0);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        List<Integer> maxIndex = function.findMaxIndex(arr);
       List<Integer> minIndex = function.findMinIndex(arr);

        System.out.println("Index of max element: " + maxIndex);
        System.out.println("Index of min element: " + minIndex);
        System.out.println("sum : " + function.sum(arr));
        System.out.println("Average : " + function.average(arr));

        System.out.println(function.findMaxValue(arr));
        System.out.println(function.findMinValue(arr));
    }
}
