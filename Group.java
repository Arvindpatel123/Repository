package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Group {

	public static void main(String[] args) {

		
            List<Employe> data=  Arrays.asList(
            		
                		   new Employe(1,"mike","jaipur",4000),
                		   new Employe(2,"adam","chennai",6000),
                		   new Employe(3,"satallin","kolkata",5000),
                		   new Employe(4,"sam","lucknow",7000),
                		   new Employe(5,"mike","bangloar",6000)

                		   );	
            
               List<Employe> val= data.stream().filter(e->e.getSalary()>5000).collect(Collectors.toList());
		for(Employe emp:val)
		{
			   System.out.println(emp.getId());
			  System.out.println(emp.getName());
			  System.out.println(emp.getCity());
			  System.out.println(emp.getSalary());

		}
		
	}

}
