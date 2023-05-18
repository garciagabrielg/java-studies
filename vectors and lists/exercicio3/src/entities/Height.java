package entities;

public class Height {
	private String name;
	private int age;
	private double height;
	
	public Height(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Height(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double mediumHeight(double height, int individuals) {
		height = this.height;
		return (height/individuals);
	}
	
	public double percentage (double amount, double total) {
		return amount * 100/ total;
	}
	
	public double verifyAge() {
		double age = 0.0;
		if (this.age < 16) {
			return age +=1.0;
		}
		else {
			return 0;
		}
	}

}
