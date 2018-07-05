package com.quartz.fjsm;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class myJobs {
	public myJobs() {
		
	}
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.err.println("Hello World! My Job is Running!");
	}
}
