package com.eBay.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Assert;

import net.java.amateras.xlsbeans.XLSBeans;
import net.java.amateras.xlsbeans.XLSBeansException;

public class ExcelToClassObject{
	
	public static Object createMappingPOJO(Class<?> cls, String filePath){
		Object obj = null;
		try {
			obj = new XLSBeans().load(new FileInputStream(filePath), cls);
		} catch (FileNotFoundException | XLSBeansException e) {
			e.printStackTrace();
			Assert.fail(e.getLocalizedMessage());
		}
		return obj;
	} 
	
	
}
