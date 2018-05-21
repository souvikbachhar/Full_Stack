package com.souvik;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CDRepository<C> extends CrudRepository<CD, Long>{

	List<CD> findBycdtitle(String name);

	List<CD> findBycdpublisher(String name);

}
