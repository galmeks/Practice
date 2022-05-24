
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		Tire tire1 = new HankookTire();
		Tire tire2 = new KumhoTire();
		System.out.println(tire1 instanceof KumhoTire);
		System.out.println(tire1 instanceof HankookTire);
		System.out.println(tire1 instanceof Tire);
		
//		for(int i=0; i<23; i++) {
//			int nPunkTire = car.run();
//			switch(nPunkTire) {
//			case 1:
//				System.out.println(car.tires[nPunkTire-1].location+"을 HankookTire로 교체");
//				car.tires[nPunkTire-1] = new HankookTire(15,"앞 왼쪽");
//				break;
//			case 2:
//				System.out.println(car.tires[nPunkTire-1].location+"을 KumhoTire로 교체");
//				car.tires[nPunkTire-1] = new KumhoTire(13,"앞 오른쪽");
//				break;
//			case 3:
//				System.out.println(car.tires[nPunkTire-1].location+"을 HankookTire로 교체");
//				car.tires[nPunkTire-1] = new HankookTire(14,"뒤 왼쪽");
//				break;
//			case 4:
//				System.out.println(car.tires[nPunkTire-1].location+"을 KumhoTire로 교체");
//				car.tires[nPunkTire-1] = new KumhoTire(17,"뒤 오른쪽");
//				break;
//			}
//			System.out.println("--------------------------------");
//		}
	}

}
