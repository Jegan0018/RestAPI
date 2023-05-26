package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.BlogEntity;
import com.example.demo.repo.BlogRepository;
import com.example.demo.service.BlogService;

@RestController
public class RegistrationController {
	
	@Autowired
	BlogService blog;
	
    @Autowired
    private BlogRepository repo;
    
    @Autowired
	private PasswordEncoder passwordEncoder;

    @PostMapping("/registerBlog")
    public ResponseEntity<String> register(@RequestBody LoginDTO loginDTO) {

        if (repo.findByName(loginDTO.getName()) != null) {
        	System.out.println(repo.findByName(loginDTO.getName()));
            return ResponseEntity.badRequest().body("Username already exists");
        }
        
        ResponseEntity<String> resultMessage=blog.addBlog(loginDTO);

        return resultMessage;
    }
}
