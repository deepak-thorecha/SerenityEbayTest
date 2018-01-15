package com.eBay.DataClasses;

import net.java.amateras.xlsbeans.annotation.Column;

public class SearchFilter {
	
	@Column(columnName="SEARCHWORD")
	public String srchKeyWord;
	
	@Column(columnName="MINPRICE")
	public String minPrice;
	
	@Column(columnName="MAXPRICE")
	public String maxPrice;
	
	@Column(columnName="BUYFORMAT")
	public String buyFormat;
}
