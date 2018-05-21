import java.util.*;  
import java.io.*;

interface WordCount   {

   int Count(String str);

}

public class Assignment3 implements WordCount{
	public int Count(String str)
	  {
		  return str.length();
	  }
	  
   public static void main(String args[]) throws IOException{
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	  Assignment3 wc=new Assignment3();
	  
	  WordCount wc1=(str)->{
		  return str.length();
	  };
		System.out.println("Enter string :");
		String inp1=br.readLine();
	  System.out.println("With Functional Interface: "+wc.Count(inp1));
	  System.out.println("With Lambda Expression: "+wc1.Count(inp1));
   }
}

