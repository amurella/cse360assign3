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
	
	/** Test whether the total returns a value */
	@Test
	public void getTotalTest() 
	{
		Calculator calc = new Calculator();
		calc.add(10);
		calc.subtract(4);
		calc.divide(2);
		System.out.print(calc.getTotal());
		assertEquals("3", outContent.toString());
	}
	
	/** Test whether the add method works*/
	@Test
	public void addTest() 
	{
		Calculator calc = new Calculator();
		calc.add(4);
		calc.add(7);
		System.out.print(calc.getTotal());
		assertEquals("11", outContent.toString());
	}
	
	/** Test whether the subtract method works*/
	@Test
	public void subtractTest() 
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(2);
		System.out.print(calc.getTotal());
		assertEquals("3", outContent.toString());
	}
	
	/** Test whether the multiply method works*/
	@Test
	public void multiplyTest() 
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.multiply(2);
		System.out.print(calc.getTotal());
		assertEquals("10", outContent.toString());
	}
	
	/** Test whether the divide method works*/
	@Test
	public void divideTest() 
	{
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(2);
		System.out.print(calc.getTotal());
		assertEquals("5", outContent.toString());
	}
	
	/** Test whether the divide method by 0 works*/
	@Test
	public void divideTest0() 
	{
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(0);
		System.out.print(calc.getTotal());
		assertEquals("0", outContent.toString());
	}
	
	/** Test whether the getHistory method works*/
	@Test
	public void getHistoryTest() 
	{
		Calculator calc = new Calculator();
		calc.add(10);
		System.out.print(calc.getHistory());
		assertEquals("", outContent.toString());
	}

}
