package com.qa.service;

import org.springframework.http.ResponseEntity;

public interface SourceService {
	
	public ResponseEntity<Object> findByNumber(String number);

}
