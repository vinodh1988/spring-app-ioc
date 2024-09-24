package com.appnow.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appnow.services.Job;

import jakarta.annotation.PostConstruct;

@Component
public class Integrated {
	
@Autowired
	private Job job;


    {
	System.out.println("Integrated instance is created and hashcode is"+this.hashCode());
	
   }


  
	public void activity() {
		job.perform();
	}
	
}
