package Test;

import org.testng.annotations.Test;


public class myPage1 {
	@Test
	public void Test1() 
	{
		System.out.println("test1");
	}
	@Test(dependsOnMethods= {"Test3"})
	public void Test2() 
	{
		System.out.println("test2");
	}
	@Test
	public void Test3() 
	{
		System.out.println("test3");
	}
	@Test
	public void Test4() 
	{
		System.out.println("test4");
	}


}
