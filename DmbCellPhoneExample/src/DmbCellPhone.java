
public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String _model, String _color, int channel) {
		this.model=_model;
		this.color=_color;
		this.channel = channel;
	}

	void PowerOn() { /*@overriding*/
		System.out.println("전원을 켭니까?");
	}
	void turnOnDmb() {
		System.out.println("채널 "+this.channel+"번 DMB방송을 수신합니다.");
	}
	void turnOffDmb() {
		System.out.println("채널 "+this.channel+"번 DMB방송 수신을 멈춥니다.");
	}
	void changeChannel(int _channel) {
		this.channel=_channel;
		System.out.println("채널 "+this.channel+"번으로 바꿉니다.");
	}

}
