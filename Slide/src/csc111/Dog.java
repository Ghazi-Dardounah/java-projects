package csc111;

class Dog {
	String name;
	int age;
	String color;
	int yearOfGet;
	
	public void ageCondition() {
		if(age <0) {
			System.out.println("Error");
			System.exit(0);
		}
		
    }
	public void output1() {
        System.out.println("Dog ID = " +(int) Math.random()*10 +
        		(int) Math.random()*10 +(int)  
        		+((int) Math.random()*9+1) +
        		+(int) Math.random()*10
        		+(int) Math.random()*10
        		+(int) Math.random()*10
        		+(int) Math.random()*10
        		+(int) Math.random()*10
        		+(int) Math.random()*10
        		+(int) Math.random()*10 );
		System.out.println("the dog name is: " + name);
		System.out.println("the dog color is: "+ color);
		System.out.println("the dog age is: "+ age);
		System.out.println("Expierd date: " + (yearOfGet + 10));

	}


}
