package kata.fizz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class KataFizzTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public KataFizzTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( KataFizzTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDivisibleby3()
    {
        assertEquals("Fizz", KataFizzBuzz.getFizzOrBuzz(3) );
        assertEquals("Fizz", KataFizzBuzz.getFizzOrBuzz(63));
        assertEquals("Fizz", KataFizzBuzz.getFizzOrBuzz(99));
    }
    public void testDivisibleby5()
    {
       
        assertEquals("Buzz", KataFizzBuzz.getFizzOrBuzz(5) );
        assertEquals("Buzz", KataFizzBuzz.getFizzOrBuzz(95));
        assertEquals("Buzz", KataFizzBuzz.getFizzOrBuzz(100));
    }
    public void testDivisibleby3and5()
    {
        assertEquals("FizzBuzz", KataFizzBuzz.getFizzOrBuzz(15) );
        assertEquals("FizzBuzz", KataFizzBuzz.getFizzOrBuzz(75) );

    }
    public void testnotDivisibleby3or5()
    {
        assertEquals("1", KataFizzBuzz.getFizzOrBuzz(1) );
        assertEquals("38", KataFizzBuzz.getFizzOrBuzz(38));
        
    }
}
