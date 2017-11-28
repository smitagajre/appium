package tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class raaga extends base2{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("android:id/button2").click();
		driver.findElementById("com.raaga.android:id/skip_text").click();
		driver.findElementByXPath("//android.widget.TextView[@text='or Skip to Raaga']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='World Music']").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"));");				
		driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();
		
		driver.findElementById("com.raaga.android:id/toolbar_logo").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Settings']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Push Notification']").click();
		
		Point pt = driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
		TouchAction t = new TouchAction(driver);
		//toggle ON
		t.tap(pt.x+20,pt.y+30).perform();
		//toggle OFF
		t.tap(pt.x+100,pt.y+30).perform();
	}

}
