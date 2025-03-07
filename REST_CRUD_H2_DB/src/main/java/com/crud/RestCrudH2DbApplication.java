package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.repository.ChangeRequestRepository;

@SpringBootApplication
public class RestCrudH2DbApplication /* implements CommandLineRunner */ {

	//@Autowired
	//private ChangeRequestRepository changeRequestRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestCrudH2DbApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * changeRequestRepository.createTableIfNotExists(); }
	 */

}
