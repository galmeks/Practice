
public class Tire {
	int maxRotation;//Ÿ�̾� ����(ȸ����)
	int accRotation;//���� ȸ����
	int min = maxRotation-accRotation;
	String location;//Ÿ�̾��� ��ġ
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
			System.out.println(this.location+" Tire ����: "+ (maxRotation-accRotation)+"ȸ");
			return true;
		}else {
			System.out.println(this.location+" Tire ��ũ");
			return false;
		}
	}
	
}
