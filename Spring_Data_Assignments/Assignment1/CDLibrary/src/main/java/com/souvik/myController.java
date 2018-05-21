package com.souvik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class myController {

	@Autowired
	CDService cdservice;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(){
		return "hello";
	}
	
	@RequestMapping(value = "/cds", method = RequestMethod.GET)
	public List<CD> getAll() {
		return cdservice.getAllCDs();
	}
	
	@RequestMapping(value = "/cdByTitle/{name}", method = RequestMethod.GET)
	public List<CD> findByTitle(@PathVariable String name) {
		return cdservice.findByTitle(name);
	}
	
	@RequestMapping(value = "/cdByPublisher/{name}", method = RequestMethod.GET)
	public List<CD> findByPublisher(@PathVariable String name) {
		return cdservice.findByPublisher(name);
	}
}
