package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.BlogDTO;
import com.example.demo.dto.LoginDTO;

public interface BlogService {

	ResponseEntity<String> addBlog(LoginDTO loginDTO);

	LoginResponse loginUser(LoginDTO loginDTO);

}
