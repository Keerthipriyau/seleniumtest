package maven.mavenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestGroups {
 
@Test(groups= {"Sanity"})
public void testCase1() {
   System.out.println("in test case 1");
}


@Test(groups= {"Regression"})
public void testCase2() {
   System.out.println("in test case 2");
}


@Test(groups= {"Sanity"})
public void testCase3() {
   System.out.println("in test case 3");
}


@BeforeMethod(groups= {"Regression"})
public void beforeMethod() {
   System.out.println("in beforeMethod");
}

@AfterMethod(groups= {"Regression"})
public void afterMethod() {
   System.out.println("in afterMethod");
}

@Test(groups= {"Integration"})
public void beforeClass() {
   System.out.println("in beforeClass");
}

@AfterClass(groups= {"Regression"})
public void afterClass() {
   System.out.println("in afterClass");
}

@Test(groups= {"Integration"})
public void beforeTest() {
   System.out.println("in beforeTest");
}

@AfterTest(groups= {"Regression"})
public void afterTest() {
   System.out.println("in afterTest");
}

@BeforeSuite(groups= {"Integration"})
public void beforeSuite() {
   System.out.println("in beforeSuite");
}

@AfterSuite(groups= {"Regression"})
public void afterSuite() {
   System.out.println("in afterSuite");

}

}