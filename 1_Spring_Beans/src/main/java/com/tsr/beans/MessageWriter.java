package com.tsr.beans;

public class MessageWriter {
	
	private IMessageFormatter formatter;
	
	public void writeMessage(String message) {
		String output = formatter.formatMessage(message);
		 System.out.println(output);
	}
	
	public void setMessageFormatter(IMessageFormatter messageFormatter){
		this.formatter = messageFormatter;
	}
}
