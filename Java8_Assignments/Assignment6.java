import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;

class Assignment6{
	
	public static void main (String[] args)throws IOException{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter your joining date(YYYY-MM-dd):");
		String jdate=br.readLine();
		LocalDate date2=LocalDate.now();
		LocalDate date1=LocalDate.parse(jdate);

		System.out.println(date1+"  "+date2);
		System.out.println("Total Days:"+ChronoUnit.DAYS.between(date1,date2));
		System.out.println("Total Months:"+ChronoUnit.MONTHS.between(date1,date2));
		System.out.println("Total Years:"+ChronoUnit.YEARS.between(date1,date2));
		System.out.println("Total Experience:"+Period.between(date1,date2).getYears()+"Year(s) "+Period.between(date1,date2).getMonths()+" Month(s) and "+Period.between(date1,date2).getYears()+" Day(s)");
	}
}