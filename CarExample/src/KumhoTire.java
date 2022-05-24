
public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}

	public KumhoTire() {
		
	}
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(this.location+" Kumho Tire ����: "+ (maxRotation-accRotation)+"ȸ");
			return true;
		}else {
			System.out.println(this.location+" Kumho Tire ��ũ");
			return false;
		}
	}
}
