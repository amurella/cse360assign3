package cse360assign3;

/** Calculator Class that does different calculator operations
 * @author Akhila Murella
 * @version February 19th, 2016
 * 
 */

public class Calculator 
{
	private int total;
	private String num = "";
	private String operator = "";
	private String totString = "0";
	
	/** Initializes the total value to 0 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/** Returns the correct total value */
	public int getTotal () 
	{
		return total;
	}
	
	/**Adds the parameter value to the total value
	 * 
	 * @param value the value that you want added to the total
	 */
	public void add (int value) 
	{
		num = String.valueOf(value);
		operator = " + ";
		totString += operator + num;
		total = total + value;
	}
	
	/**Subtracts the parameter value from the total value
	 * 
	 * @param value the value that you want subtracted from the total
	 */
	public void subtract (int value) 
	{
		num = String.valueOf(value);
		operator = " - ";
		totString += operator + num;
		total = total - value;
	}
	
	/**Multiplies the parameter value by the total value
	 * 
	 * @param value the value that you want multiplied with the total
	 */
	public void multiply (int value) 
	{
		num = String.valueOf(value);
		operator = " * ";
		totString += operator + num;
		total = total * value;
	}
	
	/**Divides the parameter by the total value
	 * 
	 * @param value the value that you want to divide the total value by
	 */
	public void divide (int value) 
	{
		num = String.valueOf(value);
		operator = " / ";
		totString += operator + num;
		
		if(value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/** Returns the entire history of calculations as a String */
	public String getHistory () 
	{
		return totString;
	}

}
