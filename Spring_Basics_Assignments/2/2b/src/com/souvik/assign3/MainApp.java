package com.souvik.assign3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.souvik.assignments.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("Bean.xml");
		Country c1=(Country) context.getBean("country1");
		Country c2=(Country) context.getBean("country2");
		
		Player p1=(Player) context.getBean("player");
		p1.setPlayerID("1");
		p1.setPlayerName("p1");
		p1.setC(c1);
		System.out.println("ID:"+p1.getPlayerID()+" Name: "+p1.getPlayerName()+" CountryID: "+p1.getC().getCountryID()+" CountryName: "+p1.getC().getCountryName());
		
		
		Player p2=(Player) context.getBean("player");
		p2.setPlayerID("2");
		p2.setPlayerName("p2");
		p2.setC(c1);
		System.out.println("ID:"+p2.getPlayerID()+" Name: "+p2.getPlayerName()+" CountryID: "+p2.getC().getCountryID()+" CountryName: "+p2.getC().getCountryName());
		
		Player p3=(Player) context.getBean("player");
		p3.setPlayerID("3");
		p3.setPlayerName("p3");
		p3.setC(c2);
		System.out.println("ID:"+p3.getPlayerID()+" Name: "+p3.getPlayerName()+" CountryID: "+p3.getC().getCountryID()+" CountryName: "+p3.getC().getCountryName());
		
		Player p4=(Player) context.getBean("player");
		p4.setPlayerID("4");
		p4.setPlayerName("p4");
		p4.setC(c2);
		System.out.println("ID:"+p4.getPlayerID()+" Name: "+p4.getPlayerName()+" CountryID: "+p4.getC().getCountryID()+" CountryName: "+p4.getC().getCountryName());
	
		Player p5=(Player) context.getBean("player");
		p5.setPlayerID("5");
		p5.setPlayerName("p5");
		p5.setC(c2);
		System.out.println("ID:"+p5.getPlayerID()+" Name: "+p5.getPlayerName()+" CountryID: "+p5.getC().getCountryID()+" CountryName: "+p5.getC().getCountryName());
	
		System.out.println("CountryA");
		if((p1.getC().getCountryName()).equals(c1.getCountryName()))
		{
			System.out.println(p1.getPlayerName());
		}
		if((p2.getC().getCountryName()).equals(c1.getCountryName()))
		{
			System.out.println(p2.getPlayerName());
		}
		if((p3.getC().getCountryName()).equals(c1.getCountryName()))
		{
			System.out.println(p3.getPlayerName());
		}
		if((p4.getC().getCountryName()).equals(c1.getCountryName()))
		{
			System.out.println(p4.getPlayerName());
		}
		if((p5.getC().getCountryName()).equals(c1.getCountryName()))
		{
			System.out.println(p5.getPlayerName());
		}
		
		System.out.println("CountryB");
		if((p1.getC().getCountryName()).equals(c2.getCountryName()))
		{
			System.out.println(p1.getPlayerName());
		}
		if((p2.getC().getCountryName()).equals(c2.getCountryName()))
		{
			System.out.println(p2.getPlayerName());
		}
		if((p3.getC().getCountryName()).equals(c2.getCountryName()))
		{
			System.out.println(p3.getPlayerName());
		}
		if((p4.getC().getCountryName()).equals(c2.getCountryName()))
		{
			System.out.println(p4.getPlayerName());
		}
		if((p5.getC().getCountryName()).equals(c2.getCountryName()))
		{
			System.out.println(p5.getPlayerName());
		}
	}

}
