package com.db.fileUpload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;



/*
 *This is the main class used to run the main application to run click on run as -> spring boot application  
 */
@SpringBootApplication
@CrossOrigin("*")
public class SpringBootUploadFilesDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadFilesDatabaseApplication.class, args);
	}

}
