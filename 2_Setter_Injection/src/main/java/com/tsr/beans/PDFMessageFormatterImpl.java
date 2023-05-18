package com.tsr.beans;

public class PDFMessageFormatterImpl implements IMessageFormatter{

	@Override
	public String formatMessage(String message) {
		return "<PDF>"+message+"</PDF>";
	}

}
