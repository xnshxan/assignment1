package testcaseassignment;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmartCalculatorTest {

    @Test
    public void testCalculateSimpleInterest() {
        SmartCalculator calculator = new SmartCalculator();
        double principal = 1000;
        double rate = 5;
        double time = 2;
        double expectedSimpleInterest = 100;
        double calculatedSimpleInterest = calculator.calculateSimpleInterest(principal, rate, time);
        assertEquals(expectedSimpleInterest, calculatedSimpleInterest, 0.001);
    }

    @Test
    public void testCalculateCompoundInterest() {
        SmartCalculator calculator = new SmartCalculator();
        calculator.setPrincipal(1000);
        calculator.setRate(5);
        calculator.setTime(2);
        double expectedCompoundInterest = 102.50;
        double calculatedCompoundInterest = calculator.calculateCompoundInterest();
        assertEquals(expectedCompoundInterest, calculatedCompoundInterest, 0.001);
    }

    @Test
    public void testCalculateMean() {
        SmartCalculator calculator = new SmartCalculator();
        double[] numbers = {10, 20, 30, 40, 50};
        double expectedMean = 30;
        double calculatedMean = calculator.calculateMean(numbers);
        assertEquals(expectedMean, calculatedMean, 0.001);
    }

    @Test
    public void testCalculateFactorial() {
        SmartCalculator calculator = new SmartCalculator();
        int number = 5;
        double expectedFactorial = 120;
        double calculatedFactorial = calculator.calculateFactorial(number);
        assertEquals(expectedFactorial, calculatedFactorial, 0.001);
    }

    @Test
    public void testCalculatePercentage() {
        SmartCalculator calculator = new SmartCalculator();
        calculator.setTotalMarks(500);
        calculator.setMarksObtained(400);
        double expectedPercentage = 80;
        double calculatedPercentage = calculator.calculatePercentage(calculator.getTotalMarks(), calculator.getMarksObtained());
        assertEquals(expectedPercentage, calculatedPercentage, 0.001);
    }
}
