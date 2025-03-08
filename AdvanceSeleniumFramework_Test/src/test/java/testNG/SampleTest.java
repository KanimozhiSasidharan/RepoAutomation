package testNG;

import org.testng.annotations.Test;

public class SampleTest 
{
	//im pulling the code
	@Test(priority = 2,invocationCount=2)
	public void createProduct()
	{
		System.out.println("Product created");
	}
	
	@Test(dependsOnMethods = "createProduct",priority = 1)
	public void modifyProduct()
	{
		System.out.println("Product modified");
	}
	
	@Test(dependsOnMethods = "createProduct",priority = 0)
	public void deleteProduct()
	{
		System.out.println("Product Deleted");
	}

}
