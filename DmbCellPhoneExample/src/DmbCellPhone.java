
public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String _model, String _color, int channel) {
		this.model=_model;
		this.color=_color;
		this.channel = channel;
	}

	void PowerOn() { /*@overriding*/
		System.out.println("������ �մϱ�?");
	}
	void turnOnDmb() {
		System.out.println("ä�� "+this.channel+"�� DMB����� �����մϴ�.");
	}
	void turnOffDmb() {
		System.out.println("ä�� "+this.channel+"�� DMB��� ������ ����ϴ�.");
	}
	void changeChannel(int _channel) {
		this.channel=_channel;
		System.out.println("ä�� "+this.channel+"������ �ٲߴϴ�.");
	}

}
