package week4Lab3;

public class Employee {
	private String id;
	private String name;
	
	public Employee(String eId,String eName){
		name = eName;
		id = eId;
	}
	public String toString() {
		return "Employee name: "+name+"\nEmployee id: "+id+"\n";
	}

}
