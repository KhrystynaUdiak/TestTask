import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Function {
    public double calculateFunction( double x) {
        double a = -1.5;
        double b = 2;
         if (x > 0.7 && x <=1.4) {
            return a * Math.pow(x, 2) * Math.log(x);
        } else if( x <= 0.7){
            return 1;
        } else{
            return Math.exp(a * x) * Math.cos(b * x);
        }
    }

    public int countSteps(double step, double start, double end){
        int count = 0;
        while(start <= end){
            count++;
            start += step;
        }
        return count;
    }

    public double[][] arrayFunctionsValue(double step,double start, double end ) {
        double[][] array = new double[countSteps(step, start, end)][2];

        for (int i = 0; i < array.length; i++) {
                array[i][0] = start;
                array[i][1] = calculateFunction(start);
                start += step;

                if (start > end) {
                    break;
            }
        }
        return array;
    }

    public List<Integer> findMaxIndex(double[][] array) {
        double max = array[0][1];
        List<Integer> maxIndices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i][1] > max) {
                max = array[i][1];
                maxIndices.clear();
                maxIndices.add(i);
            } else if (array[i][1] == max) {
                maxIndices.add(i);
            }
        }

        return maxIndices;

    }


    public List<Integer> findMinIndex(double[][] array) {
        double min = array[0][1];
        List<Integer> minIndices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i][1] < min) {
                min = array[i][1];
                minIndices.clear();  // Забираємо попередні мінімальні індекси
                minIndices.add(i);  // Додаємо поточний індекс
            } else if (array[i][1] == min) {
                minIndices.add(i);  // Додаємо поточний індекс, якщо значення рівне поточному мінімуму
            }
        }
        return minIndices;
    }

    public double sum(double[][] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][1];
        }
        return sum;
    }

    public double average(double[][] array){
        return sum(array)/array.length;
    }

    public Map<Integer, Double> findMinValue(double[][] array){
        Map<Integer, Double> values = new HashMap<>();
        double min = array[0][1];

        for (int i = 0; i < array.length; i++) {
            if (array[i][1] < min) {
                min = array[i][1];
                values.clear();
                values.put(i, array[i][1]);
            } else if (array[i][1] == min) {
                values.put(i, array[i][1]);
            }
        }
        return values;
    }

    public Map<Integer, Double> findMaxValue(double[][] array){
        Map<Integer, Double> values = new HashMap<>();
        double max = array[0][1];

        for (int i = 0; i < array.length; i++) {
            if (array[i][1] > max) {
                max = array[i][1];
                values.clear();
                values.put(i, array[i][1]);
            } else if (array[i][1] == max) {
                values.put(i, array[i][1]);
            }
        }
        return values;
    }

}
