package com.eBay.DataClasses;

import java.util.List;

import net.java.amateras.xlsbeans.annotation.HorizontalRecords;
import net.java.amateras.xlsbeans.annotation.LabelledCell;
import net.java.amateras.xlsbeans.annotation.LabelledCellType;
import net.java.amateras.xlsbeans.annotation.Sheet;

@Sheet(number=0)
public class RegistrationUserData {
	
	@LabelledCell(label="Title", type=LabelledCellType.Right)
	public String title;

	
	@HorizontalRecords(tableLabel="User_Registration_Data", recordClass=User.class)
	public List<User> users;
	
}
