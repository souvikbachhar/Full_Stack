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

	public CD getById(Long id) {
		return (CD) cdrepository.findOne(id);
	}

	public void deleteCD(Long id) {
		// TODO Auto-generated method stub
		cdrepository.delete(id);
	}

	public boolean addCD(CD cd) {
		// TODO Auto-generated method stub
		return cdrepository.save(cd)!= null;
	}

	public boolean updateCD(CD cd) {
		// TODO Auto-generated method stub
		return cdrepository.save(cd)!= null;
	}
	
	
}
