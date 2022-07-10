package org.stepdefinition;

import java.io.File;

import net.masterthought.cucumber.Configuration;

public class generateJVMReport 
{
File f=new File(System.getProperty("user.dir")+"\\Report");
Configuration c=new Configuration(f,"MakeMyTrip Applicatoin");
c.addClassifications("Platform","Windows");


}
