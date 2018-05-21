package com.souvik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value = "/CD/{id}", method = RequestMethod.GET)
	public @ResponseBody CD getAllCDs(@PathVariable Long id) {
		return cdservice.getById(id);
	}

	@RequestMapping(value = "/CD/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteCD(@PathVariable Long id) {
		cdservice.deleteCD(id);
		return HttpStatus.NO_CONTENT;
	}

	@RequestMapping(value = "/CD", method = RequestMethod.POST)
	public HttpStatus insertCD(@RequestBody CD cd) throws InvalidException {
		return cdservice.addCD(cd) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/CD", method = RequestMethod.PUT)
	public HttpStatus updateCD(@RequestBody CD cd) {
		return cdservice.updateCD(cd) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/CDByPriceRange", method = RequestMethod.GET)
	public @ResponseBody List<CD> findByPriceRange(@RequestParam("price1") float price1,@RequestParam("price2") float price2) {
		return cdservice.findByPriceRange(price1,price2);
	}
	
	@RequestMapping(value = "/CDByPriceRange1", method = RequestMethod.GET)
	public @ResponseBody List<CD> findByPriceRangequeryparams(@RequestParam("price1") float price1,@RequestParam("price2") float price2) {
		return cdservice.findByPriceRangequeryparams(price1,price2);
	}
	
	@RequestMapping(value = "/CDByPriceRange2", method = RequestMethod.GET)
	public @ResponseBody List<CD> findByPriceRangequeryNamedparams(@RequestParam("price1") float price1,@RequestParam("price2") float price2) {
		return cdservice.fetchBycdpriceRange(price1,price2);
	}
	
	@RequestMapping(value = "/CDByTitleMatch/{title}", method = RequestMethod.GET)
	public @ResponseBody List<CD> findByTitleMatch(@PathVariable String title) {
		return cdservice.findByTitleMatch(title);
	}
	
	@RequestMapping(value = "/findByTitleNative/{title}", method = RequestMethod.GET)
	public @ResponseBody List<CD> findByTitleNative(@PathVariable String title) {
		return cdservice.findByTitleNative(title);
	}
	
	@RequestMapping(value = "/findAllSorted1", method = RequestMethod.GET)
	public @ResponseBody List<CD> findAllSorted1() {
		return cdservice.findAllSorted1();
	}
	
	@RequestMapping(value = "/findAllSorted2", method = RequestMethod.GET)
	public @ResponseBody List<CD> findAllSorted2() {
		return cdservice.findAllSorted2();
	}
	
}
