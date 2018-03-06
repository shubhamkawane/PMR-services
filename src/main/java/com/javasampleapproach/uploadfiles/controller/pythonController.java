package com.javasampleapproach.uploadfiles.controller;


import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@CrossOrigin(origins = "*")
public class pythonController {


	
	@PostMapping("/python")
	public void handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println("inside");
		Process runtime = Runtime.getRuntime().exec("cmd /c start notepad++.exe");
	}
	
}
