package com.example.jpa.jpaTransaction.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.jpa.jpaTransaction.entity.JPAEntity;

@Repository
@Transactional
public class JPAService {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	
	public int insert(JPAEntity entity) {
		entitymanager.persist(entity);
		
		return entity.getId();
		
	}

}