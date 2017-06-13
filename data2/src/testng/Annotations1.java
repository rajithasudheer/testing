package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotations1 {
  @Test(priority = 1)
  public void f() {
	  System.out.println("i am @Test f");
  }
	  @Test(priority=3)
	  public void d() {
		  System.out.println("i am @Test d");
		  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am @BeforeMethod ");
  }
	  @Test(priority=2)
	  public void b() {
		  System.out.println("i am @Test b");
	  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am @ AfterMethod");
  }

}
