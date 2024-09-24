package com.appnow.services;

import org.springframework.stereotype.Service;

@Service
public class Building implements Job {
	
	{
		System.out.println("Building instance is created and hashcode is"+this.hashCode());
		
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println(" Building the application");
	}

}
