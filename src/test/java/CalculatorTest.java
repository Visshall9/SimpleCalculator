import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void test_add() {
        int a = 40;
        int aa = 50;
        int expectedResult = 90;
        int result = calculator.add(a,aa);
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void test_subt() {
        int a = 30;
        int aa = 5;
        int expectedResult = 25;
        int result = calculator.subt(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_mul() {
        int a = 10;
        int aa = 20;
        int expectedResult = 200;
        int result = calculator.mul(a,aa);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_div() {
        int a = 10;
        int b =2;
        int expectedResult = 5;
        int result = calculator.div(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}