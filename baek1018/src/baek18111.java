import java.util.Scanner;

public class baek18111 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,m,b;
		int cnt= 0,hei=0;
		int max =0;
		int min = 0;
		String[] rd = null;
		String[] str =  s.nextLine().split(" ");
		n=Integer.parseInt(str[0]);
		m=Integer.parseInt(str[1]);
		b=Integer.parseInt(str[2]);
		int[][] lnd = new int[n][m];
		for(int i=0;i<n;i++) {
			rd =  s.nextLine().split(" ");
			for(int j=0;j<rd.length;j++) {
				lnd[i][j] = Integer.parseInt(rd[j]);
				max=Math.max(max, lnd[i][j]);
				if(i==0&&j==0) {
					min=lnd[i][j];
				}
				else {
				min=Math.min(min, lnd[i][j]);}
				
			}
		}
		int[]result = new int[max+1]; 
		for(int k=min;k<=max;k++) {
			System.out.println(k);
			cnt=0; b=Integer.parseInt(str[2]);
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					boolean t = false;
					while(t == false) {
						if(lnd[i][j]>k) {
							lnd[i][j]=lnd[i][j]-1;
							b++;
							cnt+=2;
						}
						else if(lnd[i][j]<k) {
							lnd[i][j]=lnd[i][j]+1;
							b--;
							cnt++;
						}
						else if(lnd[i][j]==k)
						{
							t=true;
						}	
					}
				}
				for(int x=0;x<n;x++) {
					for(int y=0;y<rd.length;y++) {
						lnd[x][y] = Integer.parseInt(rd[y]);
					}
				}
				
			}
			if(b<0) {
				cnt=256;
			}
			result[k] = cnt;
//			System.out.println(k+" ,"+cnt);
		}
		for(int i=min;i<=max;i++) {
			System.out.println(i+", "+result[i]);
			if(i==min) {
				cnt = result[i];
				hei = i;
			}
			if(result[i]==256) {
				break;
			}
			if(cnt>result[i]) {
			cnt = Math.min(cnt,result[i]);
			hei = i;
			}
		}
		
		System.out.println(cnt+" "+hei);
		s.close();
			
	}

}
