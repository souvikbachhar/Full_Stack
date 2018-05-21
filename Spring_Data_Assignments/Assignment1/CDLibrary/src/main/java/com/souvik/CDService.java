package com.souvik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CDService {
	
	@Autowired
	CDRepository cdrepository;

	public List<CD> getAllCDs() {
		// TODO Auto-generated method stub
		return (List<CD>) cdrepository.findAll();
	}

	public List<CD> findByTitle(String name) {
		// TODO Auto-generated method stub
		return cdrepository.findBycdtitle(name);
	}

	public List<CD> findByPublisher(String name) {
		// TODO Auto-generated method stub
		return cdrepository.findBycdpublisher(name);
	}
	
	
}
