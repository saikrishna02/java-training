package com.rest.example.controller;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Path("/")
public class HelloWorldController {

	@Path("/say")
	public ResponseEntity<String> sayhello(){
		String str="hello ";
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
}
