package com.tsr.beans;

import java.util.Arrays;
import java.util.Calendar;

public class Meeting {
	private String subject;
	private String[] participants;
	private Calendar calendar;
	
	public Meeting(String subject, String[] participants, Calendar calendar) {
		super();
		this.subject = subject;
		this.participants = participants;
		this.calendar = calendar;
	}

	@Override
	public String toString() {
		return "Meeting [subject=" + subject + ", participants=" + Arrays.toString(participants) + ", calendar="
				+ calendar.getTime() + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String[] getParticipants() {
		return participants;
	}

	public void setParticipants(String[] participants) {
		this.participants = participants;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
}
