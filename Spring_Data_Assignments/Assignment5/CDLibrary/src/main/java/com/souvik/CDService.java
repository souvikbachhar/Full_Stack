package com.souvik;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CDService {
	private EntityManager entityManager;
	
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

	public List<CD> findByPriceRange(float price1, float price2) {
		// TODO Auto-generated method stub
		return cdrepository.findBycdpriceBetween(price1,price2);
	}

	public List<CD> findByPriceRangequeryparams(float price1, float price2) {
		// TODO Auto-generated method stub
		return cdrepository.findBycdpriceBetweenQuery(price1,price2);
	}

/*	public List<CD> fetchBycdpriceRange(float price1, float price2) {
		// TODO Auto-generated method stub
		return cdrepository.fetchBycdpriceRange(price1,price2);
	}
*/
	public List<CD> findByTitleMatch(String title) {
		// TODO Auto-generated method stub
		return cdrepository.findBycdtitleLike(title);
	}

	public List<CD> findByTitleNative(String title) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNativeQuery("myQuery");
		query.setParameter(1, title);
		return query.getResultList();
	}

	
/*	public List<CD> findAllSorted1() {
		// TODO Auto-generated method stub
		return cdrepository.findAllByOrderBycdpriceAsc();
	}
	
	public List<CD> findAllSorted2() {
		// TODO Auto-generated method stub
		return cdrepository.findAllByOrderBycdtitleAsc();
	}*/

	public List<CD> findByCdPrice(float price1) {
		// TODO Auto-generated method stub
		return cdrepository.fetchByCdPrice(price1);
	}
	
	
}
