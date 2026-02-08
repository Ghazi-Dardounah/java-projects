package ArrayOfObjects;

public class Company {
	private Employee[] staff;
	private int count;
	
	public Company(int size) {
		staff= new Employee[size];
		count = 0 ;
	}
	public void addEmployee(Employee e) {
		if(count < staff.length) {
			staff[count]=e;
			count++;
		}
		System.out.println("Soryy the company is full!");
	}
	public void findEmployee(int id) {
		for(int i = 0 ; i<count ; i++) {
			if(staff[i].getId() == id) {
				System.out.println("The Employee's Name is: "+staff[i].getName());
			}
		System.out.println("Employee not found");	
		}
	}
	

}
