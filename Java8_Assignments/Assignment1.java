import java.util.*;  
class Employee {  
int id;  
String name,address;  
int salary;  
public Employee(int id, String name, String address, int salary) {  
    this.id = id;  
    this.name = name;  
    this.address = address;  
    this.salary = salary;  
}  
}  
public class Assignment1 {  
public static void main(String[] args) {  
 
    List<Employee> list=new ArrayList<Employee>();  

    Employee b1=new Employee(101,"David","California",8000);  
    Employee b2=new Employee(102,"Mike","Delhi",4000);  
    Employee b3=new Employee(103,"Rachel","New York",6000);  

    list.add(b1);  
    list.add(b2);  
    list.add(b3);  

//	list.forEach(emp -> {System.out.println(emp.id+" ");System.out.println(emp.name+" ");}); 
	
	list.forEach(emp -> System.out.println(emp.id+" "+emp.name+" "+emp.address+" "+emp.salary)); 
}  
}  