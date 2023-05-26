package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BlogDTO;
import com.example.demo.dto.LoginDTO;
import com.example.demo.service.BlogService;

@RestController
//@RequestMapping("/api/v1/blog")
public class BlogController {
	@Autowired
	BlogService blog;
	
	@PostMapping("/save")
	public ResponseEntity<String> savePost(@RequestBody BlogDTO blogDTO,@RequestHeader("Authorization") String authorizationHeader) {
		ResponseEntity<String> resultMessage=blog.addBlog(blogDTO,authorizationHeader);
		System.out.println(resultMessage);
		return resultMessage;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(LoginDTO loginDTO) {
		LoginResponse loginResponse=blog.loginUser(loginDTO);
		return ResponseEntity.ok(loginResponse);
	}
}
