package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Repository;
import com.example.demo.services.RepoService;

@RestController
@RequestMapping(value = "/repository")
public class RepoResource {
	
	@Autowired
	private RepoService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> insert (@RequestBody List<Repository> repos){
		System.out.println(repos);
		
		
		List<Repository> entities = new ArrayList<Repository>();
		for (Repository r : repos) {
			if(service.getByName(r.getRepoName()) != null) {
				Repository repoBanco = service.getByName(r.getRepoName());
				r.setId(repoBanco.getId());
			};
	        entities.add(service.insert(r));
	    }
		
		return new ResponseEntity<>(repos, HttpStatus.OK);
	}

}
	