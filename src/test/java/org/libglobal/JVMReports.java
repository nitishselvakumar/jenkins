package org.libglobal;

import java.io.File;
import java.util.ArrayList;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void genarateCucumberReports(String json) {
		
		File f=new File("C:\\Users\\k_sur\\eclipse-workspace\\Cucumber\\Report");
		Configuration con=new Configuration(f,"facebook login results");
		con.addClassifications("Browser", "GoogleChrome");
		con.addClassifications("os", "windows");
		con.addClassifications("sprint", "1");
		
		List<String> jsonfiles = new ArrayList();
		jsonfiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonfiles, con);
		r.generateReports();

	}

}
