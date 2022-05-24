import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int n=Integer.parseInt(str.split(" ")[0]);
		int m=Integer.parseInt(str.split(" ")[1]);
		int[] prime = new int[m+1];
		int i,j;
		
		for(i=0;i<=m;i++) prime[i] = 0;
		prime[1] = 1;
		
		for(i=2;i<=m;i++) {
			for(j=2;i*j<=m;j++) {
				prime[i*j] = 1;
			}
		}
		for(i=n;i<=m;i++) {
			if(prime[i] != 1) System.out.println(i);
		}
		
//		if(n<m) {
//			int tmp = n;
//			n=m;
//			m=tmp;
//		}
//		
//		for(int i=m;i<=n;i++) {
//			for(int j=2;j<i;j++) {
//				if(i%j==0) {
//					break;
//				}
//				if(j==i-1) {
//					sb.append(i).append('\n');
//				}
//			}
//		}
//		System.out.println(sb);
		br.close();

	}

}
