
public class Car {
	Tire[] tires;
	Tire frontLeft;
	Tire frontRight;
	Tire rearLeft;
	Tire rearRight;
	
	public Car() {
		this.tires = new Tire[4];
		this.tires[0] = new Tire(6,"앞 왼쪽");
		this.tires[1] = new Tire(2,"앞 오른쪽");
		this.tires[2] = new Tire(3,"뒤 왼쪽");
		this.tires[3] = new Tire(4,"뒤 오른쪽");
		
//	this.frontLeft =new Tire(6,"앞 왼쪽");
//	this.frontRight =new Tire(2,"앞 오른쪽");
//	this.rearLeft =new Tire(3,"뒤 왼쪽");
//	this.rearRight =new Tire(4,"뒤 오른쪽");
	}
	
	int run() {
		System.out.println("차가 달립니다.");
		for(int i=0;i<this.tires.length;i++) {
			if(!this.tires[i].roll()) {
				this.stop();
				return i+1;
			}
		}
		
//		this.frontLeft.roll();
//		this.frontRight.roll();
//		this.rearLeft.roll();
//		this.rearRight.roll();
//		
//		if(frontLeft.maxRotation-frontLeft.accRotation == 0) {
//			this.stop();
//			return 1;
//		}
//		if(frontRight.maxRotation-frontRight.accRotation == 0) {
//			this.stop();
//			return 2;
//		}
//		if(rearLeft.maxRotation-rearLeft.accRotation == 0) {
//			this.stop();
//			return 3;
//		}
//		if(rearRight.maxRotation-rearRight.accRotation == 0) {
//			this.stop();
//			return 4;
//		}
		return 0;
	}
	void stop() {
		System.out.println("차가 멈춥니다.");
	}
}
