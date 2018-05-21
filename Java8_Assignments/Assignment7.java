import java.util.*;  
import java.util.stream.Collectors;  

public class Assignment7 {  
public static void main(String[] args) {  
 
    List<String> alist=new ArrayList<String>();  
	int lcount=0,ecount=0;
    alist.add("first");  
    alist.add("second");  
    alist.add(""); 
	alist.add("fourth");  
    alist.add("");  
    alist.add("sixth"); 	
	System.out.println("List members:"+alist);

	
	for(String obj:alist){
		if(obj.length()>5){
			++lcount;
		}
	}
	
	for(String obj:alist){
		if(obj.isEmpty()){
			++ecount;
		}
	}	
	System.out.println("Length greater than 5:"+lcount);	
	System.out.println("Empty String :"+ecount);	
	
	List<String> nlist=alist.stream()
							.filter(p->p.isEmpty())
							.collect(Collectors.toList());
	System.out.println("List for empty elements after extraction:"+nlist);
	 
	
}  
}  