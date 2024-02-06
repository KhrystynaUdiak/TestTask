import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {
    Function functionV1;
    Function functionV2;
    Function functionV3;
    Function functionV4;
    Function functionV5;
    Function functionV6;
    Function functionV7;
    Function functionV8;
    Function functionV9;
    Function functionV10;
    @BeforeEach
    public void setUp(){
        functionV1 = new Function();
        functionV2 = new FunctionV2();
        functionV3 = new FunctionV3();
        functionV4 = new FunctionV4();
        functionV5 = new FunctionV5();
        functionV6 = new FunctionV6();
        functionV7 = new FunctionV7();
        functionV8 = new FunctionV8();
        functionV9 = new FunctionV9();
        functionV10 = new FunctionV10();
    }

    @ParameterizedTest
    @CsvSource({"175, -2.821341690566853E-115", "350, -8.30257793286088E-229", "750, -0.0"})
    public void testCalculateFunction(double x, double expected){
        double result = functionV1.calculateFunction(x);
        assertEquals( expected, result );
    }
    @ParameterizedTest
    @CsvSource({"180, 2.4376155857167894", "240, 2.542132409429442"})
    public void testCalculateFunctionV2(double x, double expected){
        double result = functionV2.calculateFunction(x);
        assertEquals( expected, result );
    }

    @Test
    public void testCalculateFunctionV2WithZero(){
        assertThrows(ArithmeticException.class, () -> {
            functionV2.calculateFunction(0.0);
        });
    }
    @ParameterizedTest
    @CsvSource({"0, 4.0", "700, -0.29614255495673075", "1000, -0.2972998513501115"})
    public void testCalculateFunctionV3(double x, double expected){
        double result = functionV3.calculateFunction(x);
        assertEquals( expected, result );
    }

    @ParameterizedTest
    @CsvSource({ "120, 5.284251611870238", "260, 5.9221926876422435"})
    public void testCalculateFunctionV4(double x, double expected){
        double result = functionV4.calculateFunction(x);
        assertEquals( expected, result );
    }
    @Test
    public void testCalculateFunctionV4WithZero(){
        assertThrows(ArithmeticException.class, () -> {
            functionV2.calculateFunction(0.0);
        });
    }

    @ParameterizedTest
    @CsvSource({"50, -1.8761142227836523", "1050, 5.907435749594213", "1300, -4.919293790370617"})
    public void testCalculateFunctionV5(double x, double expected){
        double result = functionV5.calculateFunction(x);
        assertEquals( expected, result );
    }

    @ParameterizedTest
    @CsvSource({"0, 1.0", "140, 1642.2423694449003", "400, 7975.963891593291"})
    public void testCalculateFunctionV6(double x, double expected){
        double result = functionV6.calculateFunction(x);
        assertEquals( expected, result );
    }

    @ParameterizedTest
    @CsvSource({"0, 0.0", "200, 305.7037824746562", "900, 1357.2078598714324"})
    public void testCalculateFunctionV7(double x, double expected){
        double result = functionV7.calculateFunction(x);
        assertEquals( expected, result );
    }

    @ParameterizedTest
    @CsvSource({"0, 1.0", "280, -2.1852244924996302", "600, 0.2826320139742148"})
    public void testCalculateFunctionV8(double x, double expected){
        double result = functionV8.calculateFunction(x);
        assertEquals( expected, result );
    }
    @ParameterizedTest
    @CsvSource({"0, 0.0", "140, 4.948759890378168", "300, 5.707110264748875"})
    public void testCalculateFunctionV9(double x, double expected){
        double result = functionV9.calculateFunction(x);
        assertEquals( expected, result );
    }
    @ParameterizedTest
    @CsvSource({ "175, 2.010480826114483", "450, 0.29697566339602044"})
    public void testCalculateFunctionV10(double x, double expected){
        double result = functionV10.calculateFunction(x);
        assertEquals( expected, result );
    }
    @Test
    public void testCalculateFunctionV10WithZero(){
        assertThrows(ArithmeticException.class, () -> {
            functionV2.calculateFunction(0.0);
        });
    }

    @ParameterizedTest
    @CsvSource({"0.004, 0.0, 3.0, 750", "0.005, 0.8, 2.0, 241", "0.002, 0.0, 2.0, 1000", "0.005, 0.7, 2.0, 261",
    "0.002, 0.2, 2.8, 1301", "0.01, 1.0, 5.0, 401", "0.001, 0.1, 1.0, 900", "0.005, 2.0, 5.0, 601", "0.005, 0.5, 2.0, 301",
    "0.004, 0.2, 2.0, 450"})
    public void testCountSteps(double step, double start, double end, int expected){
        double result = functionV1.countSteps(step, start, end);
        assertEquals( expected, result );
    }

    @Test
    public void testArrayFunctionsValue() {
        double step = 0.5;
        double start = 0.0;
        double end = 2.0;

        double[][] expectedArray = {
                {0.0, 1.0},
                {0.5, 1.0},
                {1.0, -0.0},
                {1.5, -0.10434444146375106},
                {2.0, -0.032542999640154786}
        };

        double[][] resultArray = functionV1.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6)); // Допускаємо невелику похибку
    }
    @Test
    public void testArrayFunctionsValueV2() {
        double step = 0.5;
        double start = 0.2;
        double end = 2.0;

        double[][] expectedArray = {
                {0.2, -174.87433629385637 },
                {0.7, -12.74633388545529},
                {1.2, -0.33721768994180934},
                {1.7, 16.496383367283705}
        };

        double[][] resultArray = functionV2.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6)); // Допускаємо невелику похибку
    }
    @Test
    public void testArrayFunctionsValueV3() {
        double step = 0.5;
        double start = 0.0;
        double end = 2.0;

        double[][] expectedArray = {
                {0.0, 4.0 },
                {0.5, 4.525},
                {1.0, 6.4},
                {1.5, 1.2480754415067656},
                {2.0, 0.9391485505499116}
        };

        double[][] resultArray = functionV3.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6));
    }
    @Test
    public void testArrayFunctionsValueV4() {
        double step = 0.5;
        double start = 0.2;
        double end = 2.0;

        double[][] expectedArray = {
                {0.2, -174.87433629385637 },
                {0.7, -12.74633388545529},
                {1.2, -0.33721768994180934},
                {1.7, 2.6749830358780193}
        };

        double[][] resultArray = functionV4.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6));
    }
    @Test
    public void testArrayFunctionsValueV5() {
        double step = 0.5;
        double start = 0.0;
        double end = 2.0;

        double[][] expectedArray = {
                {0.0, 7.934999999999999 },
                {0.5, 16.049999999999997},
                {1.0, 14.799999999999999},
                {1.5, 14.049999999999999},
                {2.0, 13.799999999999999}
        };

        double[][] resultArray = functionV5.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6));
    }
    @Test
    public void testArrayFunctionsValueV6() {
        double step = 0.5;
        double start = 0.0;
        double end = 2.0;

        double[][] expectedArray = {
                {0.0, 1.0 },
                {0.5, 0.10914005828987695},
                {1.0, -0.06689484864237705},
                {1.5, -0.024502778070187872},
                {2.0, 7.200945007530365E-4 }
        };

        double[][] resultArray = functionV6.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6));
    }
    @Test
    public void testArrayFunctionsValueV7() {
        double step = 0.5;
        double start = 0.0;
        double end = 2.0;

        double[][] expectedArray = {
                {0.0, 0.0 },
                {0.5, 0.4623179275482191},
                {1.0, 1.9054651081081644},
                {1.5, 3.0609302162163288 },
                {2.0, 4.09861228866811}
        };

        double[][] resultArray = functionV7.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6));
    }
    @Test
    public void testArrayFunctionsValueV8() {
        double step = 0.5;
        double start = 0.0;
        double end = 2.0;

        double[][] expectedArray = {
                {0.0, 1.0 },
                {0.5, 0.7701511529340699},
                {1.0, 0.2919265817264289},
                {1.5, 0.005003751699777271},
                {2.0, 0.17317818956819406}
        };

        double[][] resultArray = functionV8.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6));
    }
    @Test
    public void testArrayFunctionsValueV9() {
        double step = 0.5;
        double start = 0.0;
        double end = 2.0;

        double[][] expectedArray = {
                {0.0, 0.0 },
                {0.5, -0.04429930897509084},
                {1.0, -0.9786854107167106},
                {1.5, 0.9162907318741551},
                {2.0, 1.0986122886681098}
        };

        double[][] resultArray = functionV9.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6));
    }
    @Test
    public void testArrayFunctionsValueV10() {
        double step = 0.5;
        double start = 0.2;
        double end = 2.0;

        double[][] expectedArray = {
                {0.2, -2.6652009544069237 },
                {0.7, 0.2610927185083044 },
                {1.2, 2.273490841572044 },
                {1.7, 2.0346335175418826}
        };

        double[][] resultArray = functionV10.arrayFunctionsValue(step, start, end);
        assertArrayEquals(expectedArray, resultArray, String.valueOf(1e-6));
    }

    @Test
    public void testFindMaxIndex(){
        double[][] array = functionV1.arrayFunctionsValue(0.5, 0.2, 2.0);
        List<Integer> actual = functionV1.findMaxIndex(array);
        assertEquals(Arrays.asList(0, 1), actual);
    }

    @Test
    public void testFindMinIndex(){
        double[][] array = functionV1.arrayFunctionsValue(0.5, 0.2, 2.0);
        List<Integer> actual = functionV1.findMinIndex(array);
        assertEquals(List.of(2), actual);
    }

    @Test
    public void testSum(){
        double[][] array = functionV1.arrayFunctionsValue(0.5, 0.2, 2.0);
        double actual = functionV1.sum(array);
        assertEquals(1.5306962237615498, actual);
    }

    @Test
    public void testAverage(){
        double[][] array = functionV1.arrayFunctionsValue(0.5, 0.2, 2.0);
        double actual = functionV1.sum(array)/array.length;
        assertEquals(0.38267405594038745, actual);
    }

    @Test
    public void testFindMaxValues(){
        Map<Integer, Double> actual = functionV1.findMaxValue(functionV1.arrayFunctionsValue(0.5, 0.2, 2.0));
        Map<Integer, Double> expected = new HashMap<>();
        expected.put(0, 1.0);
        expected.put(1, 1.0);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinValues(){
        Map<Integer, Double> actual = functionV1.findMinValue(functionV1.arrayFunctionsValue(0.5, 0.2, 2.0));
        Map<Integer, Double> expected = new HashMap<>();
        expected.put(2, -0.39381456267494197 );
        assertEquals(expected, actual);
    }
}