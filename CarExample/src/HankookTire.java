
public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	public HankookTire() {
		
	}
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(this.location+" Hankook Tire ����: "+ (maxRotation-accRotation)+"ȸ");
			return true;
		}else {
			System.out.println(this.location+" Hankook Tire ��ũ");
			return false;
		}
	}
}
