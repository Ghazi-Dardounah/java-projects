//Ghazi bassam deeb
//446109621
//47389
package finalExamss;

class Laptop {
	private String name;
	private String cpu;
	private int ram;
	private int storage;
	private double screen;
	private double weight;

	public Laptop() {
		name = "";
		cpu = "OTHER";
		ram = 2;
		storage = 128;
		screen = 10;
		weight = 0.5;
	}

	public Laptop(String name, String cpu, int ram, int storage, double screen, double weight) {
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
		this.screen = screen;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		if (cpu.toUpperCase().equals("other")) {
			this.cpu = "OTHER";
		} else if (cpu.equals("amd")) {
			this.cpu = "AMD";
		} else if (cpu.equals("intel")) {
			this.cpu = "INTEL";
		} else {
			this.cpu = "OTHER";
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		if (ram >= 2) {
			this.ram = ram;
		} else {
			this.ram = 2;
		}
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		if (storage >= 128) {
			this.storage = storage;
		} else {
			this.storage = 128;
		}
	}

	public double getScreen() {
		return screen;
	}

	public void setScreen(double screen) {
		if (screen >= 10 && screen <= 17.5) {
			this.screen = screen;
		} else {
			this.screen = 10;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight >= 0.5) {
			this.weight = weight;
		} else {
			this.weight = 0.5;
		}
	}

	public double calculatePrice() {
		double cpuPrice = 0;
		if (cpu.equals("AMD")) {
			cpuPrice = 180;
		} else if (cpu.equals("INTEL")) {
			cpuPrice = 200;
		} else if (cpu.equals("OTHER")) {
			cpuPrice = 100;
		}
		double laptopPrice = 300 * (0.25 * this.ram) + cpuPrice + (0.5 * this.storage) + (50 * (this.screen - 10))
				- (10 * (this.weight - 0.5));
		return laptopPrice;
	}

	public void display() {
		System.out.println(this.getName() + ", " + this.getCpu() + ", " + this.getRam() + " GB RAM," + this.getStorage()
				+ " GB, " + this.getScreen() + " inch screen, " + this.getWeight() + " KG. " + "Price is "
				+ this.calculatePrice());
	}

	public boolean equals(Laptop other) {
		return this.name.equals(other.name) && this.cpu.equals(other.cpu) && this.ram == other.ram
				&& this.storage == other.storage && this.screen == other.screen && this.weight == other.weight;
	}

}
