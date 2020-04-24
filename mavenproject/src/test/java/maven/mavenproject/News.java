package maven.mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class News {
  @Test
  public void f() {
	  System.out.println("TESTNG TEST");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before TESTNG TEST");
  }

}
