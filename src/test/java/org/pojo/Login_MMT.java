package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_MMT extends BaseClass
{
public Login_MMT() 
{
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//p[text()='Login or Create Account']")
private WebElement loginBtn;

@FindBy(id="username")
private WebElement userName;

@FindBy(xpath="//span[text()='Continue']")
private WebElement continueBtn;

public WebElement getLoginBtn() 
{
	return loginBtn;
}

public WebElement getUserName() 
{
	return userName;
}

public WebElement getContinueBtn() 
{
	return continueBtn;
}


}
