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

public class ScrollTest extends BaseTestServer{

	@Test
	public void ScrollScreenTest() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		
		
		//Actual automation
		//Xpath, id, accesibilityId, classname, androidUIAutomator
	
		// Scroll screen  
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		// androidUIAutomator (One way of scrolling)
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		// Second way of scrolling
		// Java
		scrollToEndAction();
		
		Thread.sleep(2000);
	}
}
