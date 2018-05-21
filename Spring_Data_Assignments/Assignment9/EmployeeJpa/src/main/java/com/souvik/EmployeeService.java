package com.souvik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.dsl.BooleanExpression;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository emprepo;
	

	public List<Employee> findEmployeeByNameQueryDsl(EmployeeRepository repository,String name)
    {
        BooleanExpression nameExpr = QEmployee.employee.empname.contains(name);
        Iterable<Employee> pList = repository.findAll(nameExpr);
        for(Employee p : pList)
        System.out.println("Employee " + p);
        return (List<Employee>) pList;
    }

	public List<Employee> employeeallusingquerydsl(EmployeeRepository emprepo2) {
		// TODO Auto-generated method stub
		List<Employee> pList = (List<Employee>) emprepo2.findAll();
		return pList;
	}

	public List<Employee> employeebyidusingquerydsl(EmployeeRepository emprepo2, String name) {
		// TODO Auto-generated method stub
		BooleanExpression nameExpr = QEmployee.employee.empid.eq(name);// This will give an type error
        Iterable<Employee> pList = emprepo2.findAll(nameExpr);
		return (List<Employee>) pList;
	}
}
