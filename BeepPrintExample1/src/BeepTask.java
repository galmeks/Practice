import java.awt.Toolkit;
/*
//runnable interface의 구현클래스
public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i =0;i<20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}
*/
//Thread 클래스의 자식클래스
public class BeepTask extends Thread{
	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i =0;i<20;i++) {
			tk.beep();
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}