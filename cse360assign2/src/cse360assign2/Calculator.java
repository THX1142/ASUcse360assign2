
package cse360assign2;

/**
 * A basic calculator program that adds (+), subtracts (-),
 * multiplies (*), and divides (/).
 * 
 * @author Russell Puhlmann
 *
 */
public class Calculator {

	private int total;
	
	/**
	 * Constructor which initializes the calculator object.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gets the current total value.
	 * 
	 * @return The total is the result of the calculator.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add the value to the total.
	 * 
	 * @param value The integer to be added to total.
	 */
	public void add (int value) {
		total += value;
	}
	
	/**
	 * Subtract the value from the total.
	 * 
	 * @param value The integer to be subtracted from the total.
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * Multiply the value to total, or add total to it's self value times.
	 * 
	 * @param value The number of time you are multiplying total
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * Divide the total by the value.
	 * 
	 * @param value The denominator, can't be zero ( 0 ).
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total /= value;
	}
	
	/**
	 * Gets the history of what the calculator has done.
	 * 
	 * @return A list of the history.
	 */
	public String getHistory () {
		return "";
	}
}
