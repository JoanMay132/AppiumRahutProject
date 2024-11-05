package rahulAcademy.Appium;

import static org.testng.Assert.assertTrue;

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

public class DragDropTest extends BaseTestServer{

	@Test
	public void DragAndDrop() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		
		
		//Actual automation
		//Xpath, id, accesibilityId, classname, androidUIAutomator
	
		// Dragind and drop objects on the screen  
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement itemToDrop = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

		// Java
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) itemToDrop).getId(),
		    "endX", 621,
		    "endY", 635
		));
		
		//Checking if dropped! text is displayed
		
		//First way of checking text
//		String result = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
//		Assert.assertEquals(result, "Dropped!");
		
		// Second way of doing it
		Assert.assertTrue(driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).isDisplayed());
		Thread.sleep(2000);
	}
}
