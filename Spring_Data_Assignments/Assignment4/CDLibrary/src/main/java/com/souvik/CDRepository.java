package com.souvik;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CDRepository<C> extends CrudRepository<CD, Long>{

	List<CD> findBycdtitle(String name);

	List<CD> findBycdpublisher(String name);

	List<CD> findBycdpriceBetween(float price1, float price2);

	@Query("select c from CD c where cdprice between ?1 and ?2")
	List<CD> findBycdpriceBetweenQuery(float price1, float price2);
	
	List<CD> fetchBycdpriceRange(@Param("price1") float price1,@Param("price2") float price2);
	
	List<CD> findBycdtitleLike(String title);
	
	
	
	List<CD> findAllByOrderBycdpriceAsc();
	List<CD> findAllByOrderBycdtitleAsc();
	
}
