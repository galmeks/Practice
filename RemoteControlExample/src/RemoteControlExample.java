
public class RemoteControlExample {

	public static void main(String[] args) {
		
//		RemoteControl audio = new RemoteControl() {
//			private int volume;
//			public void turnOn() {
//				System.out.println("Audio�� �մϴ�.");
//			}
//			public void turnOff() {
//				System.out.println("Audio�� ���ϴ�.");
//			}
//			public void setVolume(int volume) {
//				if(volume>RemoteControl.MAX_VOLUME) {
//					this.volume=RemoteControl.MAX_VOLUME;
//				}
//				else if(volume<RemoteControl.MIN_VOLUME){
//					this.volume=RemoteControl.MIN_VOLUME;
//				}
//				else {
//					this.volume=volume;
//				}
//				System.out.println("���� Audio ����: "+this.volume);
//			}
//
//		};
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		RemoteControl.changeBattery();
		
		
		
//		RemoteControl tv = new RemoteControl() { //�͸���Ŭ���� Anonymous Implemented Class
//			private int volume;
//			public void turnOn() {
//				System.out.println("TV�� �մϴ�.");
//			}
//			public void turnOff() {
//				System.out.println("TV�� ���ϴ�.");
//			}
//			public void setVolume(int volume) {
//				if(volume>RemoteControl.MAX_VOLUME) {
//					this.volume=RemoteControl.MAX_VOLUME;
//				}
//				else if(volume<RemoteControl.MIN_VOLUME){
//					this.volume=RemoteControl.MIN_VOLUME;
//				}
//				else {
//					this.volume=volume;
//				}
//				System.out.println("���� TV ����: "+this.volume);
//			}
//		};
		RemoteControl tv = new Television();
		tv.turnOn();
		tv.setVolume(7);
		tv.setMute(true);
		tv.turnOff();
		RemoteControl.changeBattery();
		
	}

}
