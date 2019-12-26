package com.example.jpa.jpaTransaction.commend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.jpaTransaction.entity.JPAEntity;
import com.example.jpa.jpaTransaction.service.JPAService;

@Component
public class CommendLine implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(CommendLine.class);
	
	@Autowired
	private JPAService jpaservice;
	
	@Override
	public void run(String... args) throws Exception {
		JPAEntity entity = new JPAEntity("NAvin", "Jangaon");
		long insert=jpaservice.insert(entity);
		log.info("Created " + entity);
	}

	
}
