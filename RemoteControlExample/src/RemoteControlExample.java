
public class RemoteControlExample {

	public static void main(String[] args) {
		
//		RemoteControl audio = new RemoteControl() {
//			private int volume;
//			public void turnOn() {
//				System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
//			}
//			public void turnOff() {
//				System.out.println("Audio¸¦ ²ü´Ï´Ù.");
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
//				System.out.println("ÇöÀç Audio º¼·ý: "+this.volume);
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
		
		
		
//		RemoteControl tv = new RemoteControl() { //ÀÍ¸í±¸ÇöÅ¬·¡½º Anonymous Implemented Class
//			private int volume;
//			public void turnOn() {
//				System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
//			}
//			public void turnOff() {
//				System.out.println("TV¸¦ ²ü´Ï´Ù.");
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
//				System.out.println("ÇöÀç TV º¼·ý: "+this.volume);
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
