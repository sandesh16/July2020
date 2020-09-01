package JunitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.sql.Driver;

import org.apache.http.util.Asserts;





public class JunitAnnotation {
	
 int a=10;
int b=5;
Object c;

@BeforeClass
public static void setupclass()
{
	System.out.println("This is @Before  class annotation");
	
	//webdriver intionalization 
}

@Before
public  void Setup()
{
	System.out.println("This is @Before annotation");
	//login code 
}

@Test
public  void Addition()
{
	//New lead creation 
	
	c=a+b;
	assertEquals(14, c);
	System.out.println("This is first @Test annotation" +c);
	
}


@After
public void TearDown()
{
	
	c=null;
	System.out.println("This @After annotation");
	
}

@Test 
public  void Multiplication()
{
	c=a*b;
	assertEquals(50, c);
	System.out.println("This is second test annotation" +c);

}



@AfterClass
public static void TearDownClass()
{
	System.out.println("This is @@AfterClass  annotation");
}

@Ignore
public static void IgnoreMessage()
{
	System.out.println("This is @IgnoreMessage annotation");
}


}
