import java.util.Scanner;

public class baek9012 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int cnt1,cnt2;
		String str[] = null;
		int x=s.nextInt();
		String[] ar = new String [x+1];
		for(int i=1;i<x+1;i++) {
			cnt1=0;cnt2=0;
			ar[i]=s.next();
			str=ar[i].split("");
			for(int j=0;j<str.length;j++) {
				if(str[j].equals("(")){
					cnt1++;
				}else if(str[j].equals(")")){
					cnt2++;
				}
				if(cnt2>cnt1) break;
			}
			if(cnt1==cnt2) {
				sb.append("YES").append("\n");
			}
			else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb);
		s.close();

	}

}
