package com.appnow.utilities;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	{
		System.out.println("Appconfig instantiated and hashcode is "+this.hashCode());
	}
}
