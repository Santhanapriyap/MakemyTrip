package org.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
public static WebDriver driver;

//ToLaunchBrowser
public static void toLaunchBrowser()
{
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
}

//ToLoadURL
public static void toLoadURL(String url)
{
	driver.get(url);
}

//ToMaximize
public static void toMaximizeBrowser()
{
	driver.manage().window().maximize();
}

//FillTextBox
public static void toFillTextBox(WebElement e, String value)
{
	e.sendKeys(value);
}

//ClickButton
public static void toClickButton(WebElement e)
{
	e.click();
}

//ToQuitBrowser
public static void toQuit()
{
	driver.close();
}

}
