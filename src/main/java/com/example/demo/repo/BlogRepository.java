package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.BlogDTO;
import com.example.demo.entity.BlogEntity;

@EnableJpaRepositories
@Repository
public interface BlogRepository extends JpaRepository<BlogEntity,Integer>{

	BlogDTO findByName(String name);
	
	
}
