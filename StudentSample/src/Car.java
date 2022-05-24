
public class Car {
	String color;
	String model;
	String company;
	int max_speed;
	int speed;
	int person;
	int wheelNumber;
	int fuel=0;
	int max_fuel;

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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public int getWheelNumber() {
		return wheelNumber;
	}
	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public int getMax_fuel() {
		return max_fuel;
	}
	public void setMax_fuel(int max_fuel) {
		this.max_fuel = max_fuel;
	}
	public Car() {}
	public Car(String color, String model, String company, int max_speed, int speed, int person, int wheelNumber,
			int fuel, int max_fuel) {
		this.color = color;
		this.model = model;
		this.company = company;
		this.max_speed = max_speed;
		this.speed = speed;
		this.person = person;
		this.wheelNumber = wheelNumber;
		this.fuel = fuel;
		this.max_fuel = max_fuel;
	}
	void run(int speed) {
		this.speed=speed;
	}
	void run(int speed,String a) {
		this.speed=speed;
		this.model = a;
	}
	void stop() {
		this.speed = 0;
	}
	void turn_left() {
		
	}
	void turn_right() {
		
	}
	void refueling(int x) {
		this.fuel=this.fuel+x;
	}
	
}
