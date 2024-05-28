import org.testng.annotations.Test;

public class OrderOfExecution {
	
	

	@Test(invocationCount=3)
	public void Method1() {
	
	System.out.println("Method1 execution");
	//System.out.println("Method1 testinvocation execution");
	System.out.println("Method1 testinvocation execution new line adding dev branch");
	}
	
	@Test(priority=1)
	public void Method2() {
		
		System.out.println("Method2 execution");	
	}
	
	@Test(priority=-10)
	public void Method3() {
		
		System.out.println("Method3 execution");	
	}

}
