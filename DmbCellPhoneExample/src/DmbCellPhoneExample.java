
public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone("자바폰","검정",10);
		System.out.println("모델="+phone.model);
		System.out.println("색상="+phone.color);
		System.out.println("채널="+phone.channel);
		
		phone.PowerOn();
		phone.bell();
		phone.sendVoice("여보세요");
		phone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		phone.sendVoice("아~예 반갑습니다.");
		phone.hangup();
		phone.turnOnDmb();
		phone.changeChannel(12);
		phone.turnOffDmb();
		
	}

}
