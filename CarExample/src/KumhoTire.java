
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
			System.out.println(this.location+" Kumho Tire ¼ö¸í: "+ (maxRotation-accRotation)+"È¸");
			return true;
		}else {
			System.out.println(this.location+" Kumho Tire ÆãÅ©");
			return false;
		}
	}
}
