package com.souvik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.Movie;
import com.souvik.myResult;

import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
public class myController {
	

	
	@GetMapping("/convert")
	public @ResponseBody List<Movie> convert(){		

		List <Movie> mlist= new ArrayList<Movie>();
		Movie m1=new Movie("1","ABC","AA",35f);
		Movie m2=new Movie("2","DEF","AA",35f);
		Movie m3=new Movie("3","GHI","AA",35f);
		Movie m4=new Movie("4","JKL","AA",35f);
		Movie m5=new Movie("5","MNO","AA",35f);
		Movie m6=new Movie("6","PQR","AA",35f);
		Movie m7=new Movie("7","RST","AA",35f);
		Movie m8=new Movie("8","TUV","AA",35f);
		Movie m9=new Movie("9","VWX","AA",35f);
		Movie m10=new Movie("10","XYZ","AA",35f);
		
		mlist.add(m1);
		mlist.add(m2);
		mlist.add(m3);
		mlist.add(m4);
		mlist.add(m5);
		mlist.add(m6);
		mlist.add(m7);
		mlist.add(m8);
		mlist.add(m9);
		mlist.add(m10);
		return mlist;
		
		}
	
	@GetMapping("/convertxml")
	public @ResponseBody StringWriter convertxml() throws FileNotFoundException, JAXBException{		

		List <Movie> mlist= new ArrayList<Movie>();
		Movie m1=new Movie("1","ABC","AA",35f);
		Movie m2=new Movie("2","DEF","AA",35f);
		Movie m3=new Movie("3","GHI","AA",35f);
		Movie m4=new Movie("4","JKL","AA",35f);
		Movie m5=new Movie("5","MNO","AA",35f);
		Movie m6=new Movie("6","PQR","AA",35f);
		Movie m7=new Movie("7","RST","AA",35f);
		Movie m8=new Movie("8","TUV","AA",35f);
		Movie m9=new Movie("9","VWX","AA",35f);
		Movie m10=new Movie("10","XYZ","AA",35f);
		
		mlist.add(m1);
		mlist.add(m2);
		mlist.add(m3);
		mlist.add(m4);
		mlist.add(m5);
		mlist.add(m6);
		mlist.add(m7);
		mlist.add(m8);
		mlist.add(m9);
		mlist.add(m10);
		System.err.println("XXXXX");
		JAXBContext contextObj = JAXBContext.newInstance(Movie.class);  
		  
	    Marshaller marshallerObj = contextObj.createMarshaller();  
	    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
	    StringWriter sw = new StringWriter();
	   // marshallerObj.marshal(m1, new FileOutputStream("employee.xml"));  
	    marshallerObj.marshal(m1, sw);
	    marshallerObj.marshal(m2, sw);
	    marshallerObj.marshal(m3, sw);
	    marshallerObj.marshal(m4, sw);
	    marshallerObj.marshal(m5, sw);
	    marshallerObj.marshal(m6, sw);
	    marshallerObj.marshal(m7, sw);
	    marshallerObj.marshal(m8, sw);
	    marshallerObj.marshal(m9, sw);
	    marshallerObj.marshal(m10, sw);
	    
	    System.out.println(sw);
	    
	    return sw;
		
		}
	@GetMapping("/find")
	public @ResponseBody StringWriter find(@RequestParam("id") String id) throws FileNotFoundException, JAXBException{		

		List <Movie> mlist= new ArrayList<Movie>();
		Movie m1=new Movie("1","ABC","AA",35f);
		Movie m2=new Movie("2","DEF","AA",35f);
		Movie m3=new Movie("3","GHI","AA",35f);
		Movie m4=new Movie("4","JKL","AA",35f);
		Movie m5=new Movie("5","MNO","AA",35f);
		Movie m6=new Movie("6","PQR","AA",35f);
		Movie m7=new Movie("7","RST","AA",35f);
		Movie m8=new Movie("8","TUV","AA",35f);
		Movie m9=new Movie("9","VWX","AA",35f);
		Movie m10=new Movie("10","XYZ","AA",35f);
		
		mlist.add(m1);
		mlist.add(m2);
		mlist.add(m3);
		mlist.add(m4);
		mlist.add(m5);
		mlist.add(m6);
		mlist.add(m7);
		mlist.add(m8);
		mlist.add(m9);
		mlist.add(m10);
		System.err.println("XXXXX");
		JAXBContext contextObj = JAXBContext.newInstance(Movie.class);  
		  
	    Marshaller marshallerObj = contextObj.createMarshaller();  
	    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
	    StringWriter sw = new StringWriter();
	    Iterator itr = mlist.iterator();
	    for(Movie e:mlist){
	    	if(e.getMovieId().equals(id))
	    	{
	    		 marshallerObj.marshal(e, sw);
	    	}
	    }
	   

	    
	    
	    return sw;
		
		}

}
