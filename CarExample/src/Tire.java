
public class Tire {
	int maxRotation;//타이어 수명(회전수)
	int accRotation;//현재 회전수
	int min = maxRotation-accRotation;
	String location;//타이어의 위치
	public Tire() {}
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
		int min = maxRotation-accRotation;
		this.accRotation=0;
	}
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(this.location+" Tire 수명: "+ (maxRotation-accRotation)+"회");
			return true;
		}else {
			System.out.println(this.location+" Tire 펑크");
			return false;
		}
	}
	
}
