package com.souvik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CDService {
	
	@Autowired
	CDRepository cdrepository;

	@Transactional(readOnly = true,timeout=30)
	public List<CD> getAllCDs() {
		// TODO Auto-generated method stub
		return (List<CD>) cdrepository.findAll();
	}

	@Transactional(readOnly = true)
	public List<CD> findByTitle(String name) {
		// TODO Auto-generated method stub
		return cdrepository.findBycdtitle(name);
	}

	@Transactional(readOnly = true)
	public List<CD> findByPublisher(String name) {
		// TODO Auto-generated method stub
		return cdrepository.findBycdpublisher(name);
	}

	@Transactional(readOnly = true)
	public CD getById(Long id) {
		return (CD) cdrepository.findOne(id);
	}

	@Transactional
	public void deleteCD(Long id) {
		// TODO Auto-generated method stub
		cdrepository.delete(id);
	}
	
	
	@Transactional(rollbackFor=InvalidException.class)
	@Modifying
	public boolean addCD(CD cd) throws InvalidException{
		// TODO Auto-generated method stub
		if(cd==null){throw new InvalidException("Enter details");};
		return cdrepository.save(cd)!= null;
	}
	
	@Transactional
	@Modifying
	public boolean updateCD(CD cd) {
		// TODO Auto-generated method stub
		return cdrepository.save(cd)!= null;
	}
	
	
}
