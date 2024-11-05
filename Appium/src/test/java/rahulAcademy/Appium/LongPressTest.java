package rahulAcademy.Appium;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPressTest extends BaseTestServer{

	@Test
	public void LongPressGesture() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		
		
		//Actual automation
		//Xpath, id, accesibilityId, classname, androidUIAutomator
	
		// LongPress Gesture
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		// Code to apply longpress gesture
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		LongPressGesture(ele); 
		// ----------------------------------------
		// Checking if title match with the real text
		String menuTitle = driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(menuTitle, "Sample menu");
		//Another type of assertion to check if text is displayed!
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		Thread.sleep(2000);
	}
}
