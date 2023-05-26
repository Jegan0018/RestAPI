package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BlogDTO;
import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.BlogEntity;
import com.example.demo.repo.BlogRepository;
import com.example.demo.service.BlogService;

@Service
public class BlogImplementation implements BlogService{
	
	@Autowired
	private BlogRepository repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public ResponseEntity<String> addBlog(LoginDTO loginDTO) {
		System.out.println("aaaaaaa"+loginDTO.getId());
		BlogEntity blog=new BlogEntity(
        		loginDTO.getId(),
        		loginDTO.getName(),
				loginDTO.getPassword(),
				"",
				""
		);
		repo.save(blog);
		return ResponseEntity.ok("Account created");
	}
	
	
	@Override
	public ResponseEntity<String> addBlog(BlogDTO blogDTO,String authorizationHeader) {
		String token = authorizationHeader.substring(7);
        String name = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
        BlogDTO user = repo.findByName(name);
		BlogEntity blog=new BlogEntity(
				blogDTO.getId(),
				blogDTO.getName(),
				this.passwordEncoder.encode(blogDTO.getPassword()),
				blogDTO.getTitle(),
				blogDTO.getContent()
		);
		repo.save(blog);
		return ResponseEntity.ok("Blog post created");
	}
}
