package rahulAcademy.Appium;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MisceallanousAppiumActions extends BaseTestServer{

	@Test
	public void Miscellanous() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		
		
		//Actual automation
		//Xpath, id, accesibilityId, classname, androidUIAutomator
		
		//tagName[@attribute='value']
//		driver.findElement(By.xpath(null));
	
		//App package & App activity
		Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
		
		// Script to direct into a specific view of the apk
		((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
		    "intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"
		));
		// Setting wifi name
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation landScape = new DeviceRotation(0,0,90);
		driver.rotate(landScape);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		//---------------------------------------

		// Assertions we can use "GET TEXT")
		String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		//---------------------------------------
		// Sending values in wifi settings
		// Copy paste / copy to Clipboard - paste it clipboard
		driver.setClipboardText("Joanpassword");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

//		driver.findElement(By.id("android:id/edit")).sendKeys("Joanpassword");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		
		// Press keys!
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		//---------------------------------------
		Thread.sleep(3000);

	}
}
