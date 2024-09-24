package com.appnow.services;

import org.springframework.stereotype.Service;

@Service("package")
public class Packaging implements Job {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Application is being packaged");
	}
   
}
