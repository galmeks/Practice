
public class Car {
	Tire[] tires;
	Tire frontLeft;
	Tire frontRight;
	Tire rearLeft;
	Tire rearRight;
	
	public Car() {
		this.tires = new Tire[4];
		this.tires[0] = new Tire(6,"�� ����");
		this.tires[1] = new Tire(2,"�� ������");
		this.tires[2] = new Tire(3,"�� ����");
		this.tires[3] = new Tire(4,"�� ������");
		
//	this.frontLeft =new Tire(6,"�� ����");
//	this.frontRight =new Tire(2,"�� ������");
//	this.rearLeft =new Tire(3,"�� ����");
//	this.rearRight =new Tire(4,"�� ������");
	}
	
	int run() {
		System.out.println("���� �޸��ϴ�.");
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
		System.out.println("���� ����ϴ�.");
	}
}
