package com.tsr.test;

import com.tsr.beans.JobScheduler;
import com.tsr.beans.TodoManager;

public class Main {
	
	public static void main(String[] args) {
		JobScheduler scheduler = new JobScheduler();
		scheduler.execute();
		
		TodoManager manager = new TodoManager();
		manager.manage();
	}
}
