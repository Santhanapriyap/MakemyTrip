package org.stepdefinition;

import org.baseClass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass
{
@Before
public void browserLaunch()
{
	toLaunchBrowser();
	toMaximizeBrowser();
}

@After

public void ScreenShot(Scenario s)
{
	TakesScreenshot tk=(TakesScreenshot)driver;
	byte[] SS = tk.getScreenshotAs(OutputType.BYTES);
	s.embed(SS, "image/png");
}
public void toQuitBrowser()
{
	toQuit();
}

}
