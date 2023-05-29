package com.tsr.bean;

import java.util.Calendar;

public class JobSchedule {

	private String jobName;
	private Calendar calendarDate;
	private int priority;

	public JobSchedule() {
		super();
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Calendar getCalendarDate() {
		return calendarDate;
	}

	public void setCalendarDate(Calendar calendarDate) {
		this.calendarDate = calendarDate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "JobSchedule [jobName=" + jobName + ", calendarDate=" + calendarDate.getTime() + ", priority=" + priority + "]";
	}

}
