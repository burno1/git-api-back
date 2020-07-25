package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Repository {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Integer id;
    @Column(name="repo_name", unique=true)
	private String repoName;
    private String description;
    private Integer stargazers_count;
	private String repoUser;
	private String language;
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStargazers_count() {
		return stargazers_count;
	}

	public void setStargazers_count(Integer stargazers_count) {
		this.stargazers_count = stargazers_count;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRepoName() {
		return repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	public String getRepoUser() {
		return repoUser;
	}

	public void setRepoUser(String repoUser) {
		this.repoUser = repoUser;
	}

}
