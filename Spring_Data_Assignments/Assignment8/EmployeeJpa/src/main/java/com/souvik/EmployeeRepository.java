package com.souvik;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository<E> extends CrudRepository<Employee, Long>,QueryDslPredicateExecutor<Employee> {



}
