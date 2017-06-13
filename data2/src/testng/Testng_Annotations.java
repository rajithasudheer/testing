package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testng_Annotations {
  @Test
  public void f() {
	  System.out.println("i am @test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am  @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am @AfterTest");
  }

}
