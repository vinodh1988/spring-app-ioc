package com.appnow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appnow.utilities.Integrated;

import jakarta.annotation.PostConstruct;

@Component
public class Opening {
   @Autowired
	Integrated integrated;
   

	{
		System.out.println("Opening instance is created and hashcode is"+this.hashCode());
		
	}

   /*
   @PostConstruct
   public void show() {
	   integrated.activity();
   }*/
}
