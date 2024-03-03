package testcaseassignment;
/**
 * @author Ansh
 * @version
 * SmartCalculator class provides methods to perform various calculations such as simple interest,
 * compound interest, mean of given numbers, factorial of a given number, and percentage of given
 * total marks & marks obtained.
 */
public class SmartCalculator 
{
	
	    private double principal;
	    private double rate;
	    private double time;
	    private double[] numbers;
	    private double totalMarks;
	    private double marksObtained;
            
	    /**
	     * 
	     * Constructs a SmartCalculator object with default values.
	     */
	    // Non-parameterized constructor
	    public SmartCalculator() {
	        this.principal = 0;
	        this.rate = 0;
	        this.time = 0;
	        this.numbers = null;
	        this.totalMarks = 0;
	        this.marksObtained = 0;
	    }
	    /**
	     * Constructs a SmartCalculator object with specified values.
	     * @param principal the principal amount
	     * @param rate the rate of interest
	     * @param time the time period
	     * @param numbers an array of numbers for mean calculation
	     * @param totalMarks the total marks in an exam
	     * @param marksObtained the marks obtained in an exam
	     */
	    // Parameterized constructor
	    public SmartCalculator(double principal, double rate, double time, double[] numbers, double totalMarks, double marksObtained) {
	        this.principal = principal;
	        this.rate = rate;
	        this.time = time;
	        this.numbers = numbers;
	        this.totalMarks = totalMarks;
	        this.marksObtained = marksObtained;
	    }

	    
	    
	    // Getters and setters
	    /**
	     * Gets the principal amount.
	     * @return the principal amount
	     */
	    public double getPrincipal() {
	        return principal;
	    }
	    /**
	     * Sets the principal amount.
	     * @param principal the principal amount to set
	     */
	    public void setPrincipal(double principal) {
	        this.principal = principal;
	    }
	    /**
	     * Gets the rate of interest.
	     * @return the rate of interest
	     */
	    public double getRate() {
	        return rate;
	    }
	    /**
	     * Sets the rate of interest.
	     * @param rate the rate of interest to set
	     */

	    public void setRate(double rate) {
	        this.rate = rate;
	    }
	    /**
	     * Gets the time period.
	     * @return the time period
	     */

	    public double getTime() {
	        return time;
	    }
	    /**
	     * Sets the time period.
	     * @param time the time period to set
	     */

	    public void setTime(double time) {
	        this.time = time;
	    }
	    /**
	     * Gets the array of numbers for mean calculation.
	     * @return the array of numbers
	     */
	    public double[] getNumbers() {
	        return numbers;
	    }
	    /**
	     * Sets the array of numbers for mean calculation.
	     * @param numbers the array of numbers to set
	     */
	    public void setNumbers(double[] numbers) {
	        this.numbers = numbers;
	    }
	    /**
	     * Gets the total marks in an exam.
	     * @return the total marks
	     */
	    public double getTotalMarks() {
	        return totalMarks;
	    }
	    /**
	     * Sets the total marks in an exam.
	     * @param totalMarks the total marks to set
	     */
	    public void setTotalMarks(double totalMarks) {
	        this.totalMarks = totalMarks;
	    }
	    /**
	     * Gets the marks obtained in an exam.
	     * @return the marks obtained
	     */
	    public double getMarksObtained() {
	        return marksObtained;
	    }
	    /**
	     * Sets the marks obtained in an exam.
	     * @param marksObtained the marks obtained to set
	     */
	    public void setMarksObtained(double marksObtained) {
	        this.marksObtained = marksObtained;
	    }
	    /**
	     * Calculates the simple interest.
	     * @param principal the principal amount
	     * @param rate the rate of interest
	     * @param time the time period
	     * @return the simple interest
	     */
	    // Method to calculate simple interest
	    public double calculateSimpleInterest(double principal, double rate, double time) {
	        return (principal * rate * time) / 100;
	    }
	    /**
	     * Calculates the compound interest.
	     * @return the compound interest
	     */

	    // Method to calculate compound interest
	    public double calculateCompoundInterest() {
	        return principal * (Math.pow(1 + rate / 100, time)) - principal;
	    }
	    /**
	     * Calculates the mean of given numbers.
	     * @param numbers the array of numbers
	     * @return the mean
	     */
	    // Method to calculate mean of given numbers
	    public double calculateMean(double[] numbers) {
	        double sum = 0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        return sum / numbers.length;
	    }
	    /**
	     * Calculates the factorial of a given number.
	     * @param number the number
	     * @return the factorial
	     */
	    // Method to calculate factorial of a given number
	    public double calculateFactorial(int number) {
	        double factorial = 1;
	        for (int i = 1; i <= number; ++i) {
	            factorial *= i;
	        }
	        return factorial;
	    }
	    /**
	     * Calculates the percentage.
	     * @param totalMarks the total marks
	     * @param marksObtained the marks obtained
	     * @return the percentage
	     */
	    // Method to calculate percentage
	    public double calculatePercentage(double totalMarks, double marksObtained) {
	        return (marksObtained / totalMarks) * 100;
	    }

}


