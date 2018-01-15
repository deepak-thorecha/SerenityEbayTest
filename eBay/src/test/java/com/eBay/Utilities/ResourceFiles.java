package com.eBay.Utilities;

import java.io.File;

public class ResourceFiles {
	
	private static final char sep;
	private static final String rootPath;
	private static final String rsrcFolder;
	
	static {
		sep = File.separatorChar;
		rootPath = System.getProperty("user.dir");
		rsrcFolder = "src" +sep+ "test" +sep+ "resources";
	}
	
	public static final String TESTDATA_XLS = rootPath  +sep+  rsrcFolder  +sep+ "TestDataFiles" +sep+ "MyTestData.xls";
	
}
