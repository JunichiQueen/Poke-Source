package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.SourceServiceImpl;

@RestController
@RequestMapping("/source")
public class SourceController {
	
	private SourceServiceImpl sourceService;
	
	@Autowired
	public SourceController (SourceServiceImpl sourceService) {
		this.sourceService=sourceService;
	}
	
	@GetMapping("/{number}")
	public ResponseEntity<Object> findByNumber(@PathVariable ("number") String number){
		return sourceService.findByNumber(number);
	}

}
