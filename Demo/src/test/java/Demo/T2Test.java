package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T2Test {

	@Test
	public void m2Test()
	{
		System.out.println("Hi");
		Assert.fail();
	}
}
