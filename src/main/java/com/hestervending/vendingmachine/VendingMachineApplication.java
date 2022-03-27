package com.hestervending.vendingmachine;

import org.springframework.boot.SpringApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class VendingMachineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VendingMachineApplication.class, args);
	}

	@Override
	public void run(String... args) throws IOException {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		
		Item item = objectMapper.readValue(new File("input.json"), Item.class);
		
		System.out.println(item);
		
	}

}
