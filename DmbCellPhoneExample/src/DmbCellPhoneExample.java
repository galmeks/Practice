
public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone("�ڹ���","����",10);
		System.out.println("��="+phone.model);
		System.out.println("����="+phone.color);
		System.out.println("ä��="+phone.channel);
		
		phone.PowerOn();
		phone.bell();
		phone.sendVoice("��������");
		phone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		phone.sendVoice("��~�� �ݰ����ϴ�.");
		phone.hangup();
		phone.turnOnDmb();
		phone.changeChannel(12);
		phone.turnOffDmb();
		
	}

}
