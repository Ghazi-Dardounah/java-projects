package gpt;

class Car {
	private String model;
	private String brand;
	private int year;
	private double engineSize;
	private double price;
	private static int countCars;

	public Car() {
		model = "";
		brand = "OTHER";
		year = 1990;
		engineSize = 1;
		price = 5000;
		countCars++;
	}

	public Car(String model, String brand, int year, double engineSize, double price) {
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.engineSize = engineSize;
		this.price = price;
		countCars++;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand.equals("TOYOTA") || brand.equals("BMW") || brand.equals("FORD")) {
			this.brand = brand;
		} else {
			this.brand = "OTHER";
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1990) {
			this.year = year;
		} else {
			this.year = 1990;
		}
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		if (engineSize >= 1 && engineSize <= 6.5) {
			this.engineSize = engineSize;
		} else {
			this.engineSize = 1;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 5000) {
			this.price = price;
		} else {
			this.price = 5000;
		}
	}
	public static int getCountCars() {
		return countCars;
	}

	public double calculateTax() {
		double tax = engineSize * 200 + (year - 1990) * 10;
		return tax;
	}

	public boolean equals(Car other) {
		return this.model.equals(other.model) && this.brand.equals(other.brand) && this.year == other.year
				&& this.engineSize == other.engineSize && this.price == other.price;
	}

	public void display() {
		System.out.println(this.getModel() + " " + "(" + this.getBrand() + "), " + this.getYear() + ", "
				+ this.getEngineSize() + " L, " + this.getPrice() + " SAR. Tax = " + this.calculateTax());
	}

}
