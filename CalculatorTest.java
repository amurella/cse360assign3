package cse360assign3;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;	
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/** JUnit testing to test whether Calculator works correctly
 * @author Akhila Murella
 * @version February 19th, 2016
 * 
 */
public class CalculatorTest 
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	/** Sets up the streams */
	@Before
	public void setUpStreams() 
	{
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
		
	/** Cleans up the Streams */
	@After
	public void cleanUpStreams() 
	{
	    System.setOut(null);
	    System.setErr(null);
	}

	/** Tests the constructor */
	@Test
	public void testCalculator() 
	{
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	/** Test whether the total returns a value*/
	@Test
	public void getTotalTest() 
	{
		fail("Not yet implemented");
	}
	
	/** Test whether the add method works*/
	@Test
	public void addTest() 
	{
		fail("Not yet implemented");
	}
	
	/** Test whether the subtract method works*/
	@Test
	public void subtractTest() 
	{
		fail("Not yet implemented");
	}
	
	/** Test whether the multiply method works*/
	@Test
	public void multiplyTest() 
	{
		fail("Not yet implemented");
	}
	
	/** Test whether the divide method works*/
	@Test
	public void divideTest() 
	{
		fail("Not yet implemented");
	}
	
	/** Test whether the getHistory method works*/
	@Test
	public void getHistoryTest() 
	{
		fail("Not yet implemented");
	}

}
