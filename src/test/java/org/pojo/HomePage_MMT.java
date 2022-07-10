package org.pojo;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_MMT extends BaseClass
{
public HomePage_MMT() 
{
PageFactory.initElements(driver, this);	
}
@FindBy(id="fromCity")
private WebElement fromCity;

@FindBy(xpath="//p[text()='Mumbai, India']")
private WebElement FromCityMumbai;

@FindBy(id="toCity")
private WebElement toCity;

@FindBy(xpath="//p[text()='New Delhi, India']")
private WebElement ToCityDelhi;

@FindBy(xpath="//input[@placeholder='To']")
private WebElement totextCity;


public WebElement getTotextCity() {
	return totextCity;
}
@FindBy(id="departure")
private WebElement calendar;

@FindBy(xpath="(//p[text()='20'])[1]")
private WebElement date;

@FindBy(xpath="//a[text()='Search']")
private WebElement searchBtn;

public WebElement getFromCity() 
{
	return fromCity;
}

public WebElement getFromCityMumbai() {
	return FromCityMumbai;
}

public WebElement getToCity() {
	return toCity;
}

public WebElement getToCityDelhi() {
	return ToCityDelhi;
}

public WebElement getCalendar() {
	return calendar;
}

public WebElement getDate() {
	return date;
}

public WebElement getSearchBtn() {
	return searchBtn;
}


}
