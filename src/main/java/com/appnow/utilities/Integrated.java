package com.appnow.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.appnow.services.Job;

import jakarta.annotation.PostConstruct;

@Component
public class Integrated {
	
@Autowired
@Qualifier("build")
	private Job job;

@Autowired
@Qualifier("package")
	private Job job2;


    {
	System.out.println("Integrated instance is created and hashcode is"+this.hashCode());
	
   }


  
	public void activity() {
		job.perform();
		job2.perform();
	}
	
}
