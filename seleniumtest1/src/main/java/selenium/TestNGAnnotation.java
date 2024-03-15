package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAnnotation {
	SoftAssert softAssertion = new SoftAssert();
@Test
public void softAssert() {
	
	System.out.println("soft assert method started");
	softAssertion.assertEquals("test", "test1");
	System.out.println("soft assert method executed");
	softAssertion.assertAll();
}

@Test
public void hardAssert() {
	System.out.println("hard assert method started");
	softAssertion.assertEquals("test", "test1");
	System.out.println("hard assert method executed");
	//softAssertion.assertAll();
}


}
