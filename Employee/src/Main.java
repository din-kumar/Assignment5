import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();					// creating ArrayList of type Employee
		// Adding elements to ArrayList
		emp.add(new Employee(206,"Mehra",29,60000));							
		emp.add(new Employee(109,"Ram",41,68000));
		emp.add(new Employee(526,"Shyam",21,55000));
		emp.add(new Employee(289,"Mahesh",32,80000));
		emp.add(new Employee(105,"Rita",53,100000));
		emp.add(new Employee(412,"Raman",38,58000));
		emp.add(new Employee(498,"Rohan",23,33000));
		
		
		// Using the Override method compareTo of Comparable class
		Collections.sort(emp);
		
		// Print using for each loop
		for(Employee e: emp) {													
			System.out.println(e.id+"\t"+ e.name+"\t"+e.age+"\t"+e.salary);
		}
	}

}