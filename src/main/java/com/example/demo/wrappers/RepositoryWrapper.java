package com.example.demo.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.Repository;

public class RepositoryWrapper {
	List<Repository> repositories = new ArrayList<>();

	public RepositoryWrapper(RepositoryWrapper obj) {
		// TODO Auto-generated constructor stub
	}

	public List<Repository> getRepositories() {
		return repositories;
	}

	public void setRepositories(List<Repository> repositories) {
		this.repositories = repositories;
	}	
	
	
	
}
