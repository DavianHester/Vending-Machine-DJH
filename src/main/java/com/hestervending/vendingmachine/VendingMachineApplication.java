package com.hestervending.vendingmachine;

import org.springframework.boot.SpringApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class VendingMachineApplication  {

	public static void main(String[] args) {
		SpringApplication.run(VendingMachineApplication.class, args);
	}

	
	//public class LoggingController {

	  //  Logger logger = LoggerFactory.getLogger(LoggingController.class);

	 /*   
	    public String index() {
	        logger.trace("A TRACE Message");
	        logger.debug("A DEBUG Message");
	        logger.info("An INFO Message");
	        logger.warn("A WARN Message");
	        logger.error("An ERROR Message");

	        return "See the Logs tohi for the output!!!";
	    }
}*/

}
