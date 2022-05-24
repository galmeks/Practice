import java.util.Scanner;

public class baek1018 {

	public static void main(String[] args) {
		int x,y;
		int result = 64;
		int bwchck = 0;
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String a[]= str.split(" ");
		x= Integer.parseInt(a[0]);
		y= Integer.parseInt(a[1]);
		String[][] box1=new String[x][y];
		String[][] box2=new String[x][y];
		String[][] box3=new String[x][y];
		int count1 = 64;
		int count2 = 64;
		for(int i=0; i<x;i++) {
			for(int j =0;j<y;j++) {
				if(bwchck%2 == 0) {
					box1[i][j] = "B";
					bwchck++;
				}
				else {
					box1[i][j] = "W";
					bwchck++;
				}
			}
			if(y%2 == 0) {
			bwchck--;}
		}
		bwchck = 0;
		for(int i=0; i<x;i++) {
			for(int j =0;j<y;j++) {
				if(bwchck%2 == 0) {
					box2[i][j] = "W";
					bwchck++;
				}
				else {
					box2[i][j] = "B";
					bwchck++;
				}
			}
			if(y%2 == 0) {
			bwchck--;}
		}
//		for(int i=0; i<x;i++) {
//			for(int j =0;j<y;j++) {
//				System.out.print(box2[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i=0; i<x;i++) {
//			for(int j =0;j<y;j++) {
//				System.out.print(box1[i][j]);
//			}
//			System.out.println();
//		}
		for(int i =0;i<x;i++) {
			str = s.nextLine();
			String[] aa=str.split("");
			for(int j= 0;j<aa.length;j++) {
				box3[i][j]=aa[j];
			}
			
		}
		for(int i1=0;i1<=x-8;i1++) {
			for(int j1=0;j1<=y-8;j1++) {
				for(int i=i1; i<(i1+8);i++) {
					for(int j =j1;j<(j1+8);j++) {
						if(box1[i][j].equals(box3[i][j]) ) {
							count1--;
						}
					}
				}
//				System.out.println(count1);
				result = Math.min(result,count1);
				count1=64;
			}
		}
		for(int i1=0;i1<=x-8;i1++) {
			for(int j1=0;j1<=y-8;j1++) {
				for(int i=i1; i<(i1+8);i++) {
					for(int j =j1;j<(j1+8);j++) {
						if(box2[i][j].equals(box3[i][j]) ) {
							count2--;
						}
					}
				}
//				System.out.println(count2);
				result = Math.min(result,count2);
				count2=64;
			}
		}
		System.out.println(result);
		s.close();
	}
}