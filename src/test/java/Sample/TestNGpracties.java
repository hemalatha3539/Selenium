package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGpracties {
	//i don't give any priority it will take 0
		//we can ignore test cases in three ways
		//by using
		//1.invocation count
		//2.by using enabled
		//3.by using ignore annotation
	
	
	@Test(invocationCount=5,dependsOnMethods="ModifyUser")
	public void createUser(){
		System.out.println("create user");
	}
	
	@Test(enabled=true)
	public void ModifyUser() {
		System.out.println("modify user");
	}
 
	@Test
	public void deleteUser() {
		System.out.println("delete user");
		
	}
	
	

}
