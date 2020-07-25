package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository		
public interface RepoRepository extends CrudRepository<com.example.demo.domain.Repository, Integer>{
	com.example.demo.domain.Repository findRepositoryByRepoName(String repoName);
}
