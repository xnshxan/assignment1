package testcaseassignment;

public class Clientprog {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
		        // Example usage
		        SmartCalculator calculator = new SmartCalculator();
		        calculator.setPrincipal(1000);
		        calculator.setRate(5);
		        calculator.setTime(2);

		        double simpleInterest = calculator.calculateSimpleInterest(calculator.getPrincipal(), calculator.getRate(), calculator.getTime());
		        System.out.println("Simple Interest: " + simpleInterest);

		        double[] numbers = {10, 20, 30, 40, 50};
		        double mean = calculator.calculateMean(numbers);
		        System.out.println("Mean: " + mean);
		    }
		
	

}
