
public class BeepPrintExample1 {

	public static void main(String[] args) {
		/*
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		*/
		Thread thread = new BeepTask();
		thread.start();
		for(int i =0;i<40;i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			}catch(Exception e){
			}
		}
	}

}
