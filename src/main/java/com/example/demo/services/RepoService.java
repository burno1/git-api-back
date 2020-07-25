package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.RepoRepository;
import com.example.demo.domain.Repository;

@Service	
public class RepoService {
	@Autowired
	private RepoRepository repo;
	
	public Repository insert(Repository obj) {
		System.out.println(obj.getId() + "ID OBJ");
		return repo.save(obj);
	}
	
	public Repository getByName(String name) {
		return repo.findRepositoryByRepoName(name);
	}

}
