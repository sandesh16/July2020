package JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SanityPack {
	
	@BeforeClass
	public static void setupclass()
	{
		System.out.println("This is @Before  class annotation");
	}

	@Before
	public  void Setup()
	{
		System.out.println("This is @Before annotation");
	}
	
	@Test
	public  void test1()
	{
		
		System.out.println("This is sanity test case 1");
		
	}

	@Test 
	public  void test2()
	{
		
		System.out.println("This is sanity test case 2");

	}

}
