package testscripts;

import org.testng.annotations.*;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void meth1()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void meth3()
	{
		System.out.println("@BeforeTest");

	}
	
	@AfterTest
	public void meth4()
	{
		System.out.println("@AfterTest");

	}
	@AfterClass
	public void meth5()
	{
		System.out.println("@AfterClass");

	}
	@BeforeClass
	public void meth6()
	{
		System.out.println("@BeforeClass");

	}
	@AfterSuite
	public void meth()
	{
		System.out.println("@AfterSuite");
	}
	@AfterMethod
	public void meth8()
	{
		System.out.println("@AfterMethod");
	}
	
	@BeforeMethod
	public void meth9()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void meth10()
	{
		System.out.println("@Test1");
	}
	@Test
	public void meth11()
	{
		System.out.println("@Test2");
	}
}
