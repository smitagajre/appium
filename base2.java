package tutorial;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base2 {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
  File f=new File("src");
  File fs=new File(f,"Raaga.apk");
  
  DesiredCapabilities cap = new DesiredCapabilities();
  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoEmulator");
  cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
  AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
  return driver;
	}
}


