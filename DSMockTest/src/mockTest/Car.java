package mockTest;

public class Car {

	private String licenseNo;
	private float horsePower;
	private String color;
	private String model;
	
	
	public Car() {
		super();
		
	}


	public Car(String licenseNo, float horsePower, String color, String model) {
		super();
		this.licenseNo = licenseNo;
		this.horsePower = horsePower;
		this.color = color;
		this.model = model;
	}
	
	
	public Car(Car car) {
		super();
		this.licenseNo=car.licenseNo;
		this.horsePower=car.horsePower;
		this.color=car.color;
		this.model=car.model;
		
	}


	public String getLicenseNo() {
		return licenseNo;
	}


	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}


	public float getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(float horsePower) {
		this.horsePower = horsePower;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	
	public void  display() {
		System.out.println("Car [licenseNo=" + licenseNo + ", horsePower=" + horsePower + ", color=" + color + ", model=" + model
				+ "]"); 
	}
	
	
	
	
	
	
}
