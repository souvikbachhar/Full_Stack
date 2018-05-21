import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.TemporalAdjusters;

class Assignment5{
	
	public static void main (String[] args)throws IOException{
		
		LocalDate date1=LocalDate.now();
		System.out.println("Current Date: "+date1);
		LocalDate NextMonth=LocalDate.now().plusMonths(1);
		LocalDate firstInYear = LocalDate.of(NextMonth.getYear(),NextMonth.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
        DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
		
	}
}