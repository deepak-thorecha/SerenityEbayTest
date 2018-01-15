package com.eBay.DataClasses;

import java.util.List;

import net.java.amateras.xlsbeans.annotation.HorizontalRecords;
import net.java.amateras.xlsbeans.annotation.LabelledCell;
import net.java.amateras.xlsbeans.annotation.LabelledCellType;
import net.java.amateras.xlsbeans.annotation.Sheet;

@Sheet(number=1)
public class AdvancedSearchData {
	
	@LabelledCell(label="Title", type=LabelledCellType.Right)
	public String title;

	
	@HorizontalRecords(tableLabel="Advanced_Search_Data", recordClass=SearchFilter.class)
	public List<SearchFilter> srchData;
	
}
