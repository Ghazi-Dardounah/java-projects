package week4Lab3;

public class Department {
	private String depName;
	private Employee employees[];
	private int numOfEmployees;
	
	public Department(String name,int size) {
		depName = name;
		employees = new Employee[size];
		numOfEmployees = 0;
	}
	public Department(Department dep) {
		this.depName = dep.depName;
		this.numOfEmployees = dep.numOfEmployees;
		this.employees = new Employee[dep.employees.length];
		for(int i = 0 ; i<numOfEmployees ; i++) {
			this.employees[i] = dep.employees[i];
		}
	}
	public boolean addEmployee(Employee emp) {
		if(emp != null) {
			employees[numOfEmployees] = emp;
			numOfEmployees++;
			return true;
		}
		return false;
	}
	public String toString() {
		String info = "department name: "+depName+"\n";
		for(int i = 0 ; i<numOfEmployees ; i++){
			info += employees[i].toString();
		}
		return info;
	}

}
