package p1;

public class Employe {
	
	
	private long id;
	private String name;
	private String city;
	private double salary;
	
	Employe(long id,String name,String city,double salary)
	{
		
		this.id=id;
		this.name=name;
		this.city=city;
		this.salary=salary;
	}
	
	
	
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	public double getSalary() {
		return salary;
	}

}
