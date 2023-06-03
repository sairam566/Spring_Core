package com.tsr.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertor {
	
	private static DateConvertor convertor;
	
	 private DateConvertor() {
		//no-operation
	}
	 
	public static DateConvertor getInstance() {
		if(convertor==null) {
			convertor = new DateConvertor();
		}
		return convertor;
	}
	
	public Date convertStringToDate(String date,String format) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Date converted = dateFormat.parse(date);
		return converted;
	}
	public String convertDateToString(Date date,String format){
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		String converted = dateFormat.format(date);
		return converted;
	}
}
