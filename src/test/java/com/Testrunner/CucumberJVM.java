package com.Testrunner;

import java.io.File;
import java.util.LinkedList;
import java.util.List;



import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class CucumberJVM {
	
	public static void generatingReport(String json){ 
		
		File file = new File("C:\\Users\\Admin\\Desktop\\DataTable\\target");
	
		//to where you want to locate the file
		Configuration c = new Configuration(file,"Santhiya_JVM_Report_Adactin");
		
		c.addClassifications("Tool", "eclipse");
		c.addClassifications("os", "Window10");
		
		List<String> li = new LinkedList<String>();
		li.add(json);
		ReportBuilder r = new ReportBuilder(li,c);
		r.generateReports();
		
	}
		
	}
  

