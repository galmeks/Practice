import java.util.Scanner;

public class baek8958 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int combo=1;
		int sum=0;
		int x = Integer.parseInt(s.nextLine());
		String ar[] = new String[x];
		int [] score = new int[x];
		for(int i=0;i<x;i++) {
			ar[i] = s.nextLine();
			String[] arr = ar[i].split("");
			sum=0;
			combo=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[j].equals("O")) {
					sum = sum+combo;
//					System.out.println(sum);
					combo++;
				}
				else {
					combo = 1;
				}
				score[i] = sum;
			}
			
		}
		for(int i=0;i<x;i++) {
			System.out.println(score[i]);
		}
		s.close();
	}

}
