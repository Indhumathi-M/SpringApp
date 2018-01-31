package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Security {
	@Component
	public class CustomizationBean implements EmbeddedServletContainerCustomizer {
	    @Override
	    public void customize(ConfigurableEmbeddedServletContainer container) {
	        container.setPort(8087);
	        // Use port of your choice that is available
	    }
	} 
	
	public static void main(String[] args) {
		SpringApplication.run(Security.class, args);
	}

}
