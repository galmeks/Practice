
import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
//		int i=10, j=5, x=0;
//		if(i<j) {
//			x=1;
//		} else {
//			x=j;
//		}
//		//삼항연산자로 바꾸면==> x=(i<j)?i:j;
//		
//		if(i<j) {
//			x=i;
//		} else if(i>j) {
//			x=j;
//		} else { //i==j
//			x=0;
//		}
//		//삼항연산자==> x=(i<j)?i:((i>j)?j:0);
//		System.out.println(x);
//		String str="john";
//		if(str.equals("john")) {
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
//		
//		System.out.println(3+"x"+1+"="+(3*1));
//		System.out.println(3+"x"+2+"="+(3*2));
//		System.out.println(3+"x"+3+"="+(3*3));
//		System.out.println(3+"x"+4+"="+(3*4));
//		System.out.println(3+"x"+5+"="+(3*5));
//		System.out.println(3+"x"+6+"="+(3*6));
//		System.out.println(3+"x"+7+"="+(3*7));
//		System.out.println(3+"x"+8+"="+(3*8));
//		System.out.println(3+"x"+9+"="+(3*9));

		//입력
			//Scanner s=new Scanner(System.in);
			
//			String answer=s.nextLine();
//			System.out.println("answer is "+answer);
//			answer=s.nextLine();
//			System.out.println("answer is "+answer);
			
			//문자열을 숫자로 : Integer.parseInt()
//			int age=Integer.parseInt(s.nextLine());
//			System.out.println("age is "+age);
			
			//구구단 출력
//			int dan=Integer.parseInt(s.nextLine());
//			int a,b,c,d;
//			a=b=c=d=dan; //dan값이 d에 먼저 들어감  dan->d->c->b->a
			
//			System.out.println(dan+"x"+1+"="+(dan*1));
//			System.out.println(dan+"x"+2+"="+(dan*2));
//			System.out.println(dan+"x"+3+"="+(dan*3));
//			System.out.println(dan+"x"+4+"="+(dan*4));
//			System.out.println(dan+"x"+5+"="+(dan*5));
//			System.out.println(dan+"x"+6+"="+(dan*6));
//			System.out.println(dan+"x"+7+"="+(dan*7));
//			System.out.println(dan+"x"+8+"="+(dan*8));
//			System.out.println(dan+"x"+9+"="+(dan*9));

			//if문
//			int x=Integer.parseInt(s.nextLine());
//			if(x>10) {
//				System.out.println("입력한 값이 10보다 큽니다");
//			}else if(x>5) {
//				System.out.println("입력한 값이 5와 10사이의 숫자입니다");
//			} else {
//				System.out.println("입력한 값이 5보다 작습니다");
//			}
//			//switch문
//			int x=Integer.parseInt(s.nextLine());
//			switch(x) {
//			case 10:
//				A;
//				break;
//			case 9:
//				B;
//				break;
//			case 8:
//				C;
//				break;
//			default:
			
//			}
			//while문
//			Scanner s=new Scanner(System.in);
//			int x=Integer.parseInt(s.nextLine());
//			while(x>0) {
//				System.out.println(x);
//				x--;
//			}
//1.값을 입력받는다
//2.1부터 그 값까지 누적합계를 계산
//3.누적합계 출력
//		Scanner s=new Scanner(System.in);
//		int x=Integer.parseInt(s.nextLine());
//		int sum=0;
//		int i=1;
//		while(i<=x) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println(sum);
		
//1.값1을 입력받는다.
//2.값2를 입력받는다.
//3.값1부터 값2까지의 함계를 구한다.
//4.누적합계를 출력한다.
//		Scanner s=new Scanner(System.in);
//		int x=Integer.parseInt(s.nextLine());
//		int y=Integer.parseInt(s.nextLine());
//		int sum=0;
//		//int i=1;
//		if(x>y) {
//			while(y<=x) {
//				sum=sum+y;
//				y++;					
//			}
//		}else if(x<y) {
//			while(x<=y) {
//				sum=sum+x;
//				x++;
//			}
//		}
//		System.out.println(sum);

  //while 한 번 쓰는 방법
//		Scanner s=new Scanner(System.in);
//		int x,y, sum=0;
//		int answer =Integer.parseInt(s.nextLine());
//		int answer1 =Integer.parseInt(s.nextLine());
//		if(answer<answer1) {
//			x=answer;
//			y=answer1;
//		} else {
//			y=answer;
//			x=answer1;
//		}
//		while(x<=y) {
//			sum+=x;
//			System.out.println(x+", "+sum);
//			x++;
//		}
		
		
		//for문
//		Scanner s=new Scanner(System.in);
//		for(int i=0;i<n;i++) {
//			
//		}
		
		//do while문  //조건이 거짓이여도 최소 한번은 실행됨
//		Scanner s=new Scanner(System.in);
//		do {
//			
//		} while();
		
//구구단 2~9단 출력
//		Scanner s=new Scanner(System.in);
//		int i,j=1;
//		for(i=2;i<10;i++) {
//			for(j=1;j<10;j++) {
//				System.out.println(i+"x"+j+"="+(i*j));
//			}
//		}
		
//1000이하의 소수 찾기. for문 중첩 사용
//		Scanner s=new Scanner(System.in);
//		int i,j;
//		for(i=2;i<1000;i++) {
//			for(j=2;j<=i;j++) {
//				if(i==j) {
//					System.out.println(i);
//					}
//				if(i%j==0) {
//					break;
//					}				
//			}		
//		}
		
		//다른 풀이
//		Scanner s=new Scanner(System.in);
//		boolean flag=false;
//		for(int i=2;i<=1000;i++) {
//			flag=false;
//			for(int j=2;j<1;j++) {
//				if(i%j==0) {
//					flag=true;
//					break;
//				}				
//			}
//			if(flag==false) {
//				System.out.println(i);
//			}
//		}
		
//1000이하의 피보나치수열
//		Scanner s=new Scanner(System.in);
//		int x=0; int y=1; int z=1;
//		for(int i=1;z<1000;i++) {
//			System.out.println(z+" ");
//			z=x+y;
//			x=y;
//			y=z;
//			
//			
//		}
		//배열  *배열의 길이가 고정됨.
//		int ar[]={10,15,40,64};  //배열선언 & 초기값 저장  
//        int[] ar={10,15,40,64};
//        int[] ar;  //선언만 할 수도 있음
//        int[] ar=null; //값을 리셋
//        ar=new int[] {10,15,20,35,74,99};
//        //ar.length 자동생성
//        
//        //String[] arName= {"John","James","Jacob","Jason"};
//        float[] arReal= {3.14f, 1.74f, 12.5f, 12};
        
//      String[] arName=new String[5];  //5는 배열의 길이
//		arName[0]="John";
//		arName[1]="James";
//		arName[2]="Jacob";
//		arName[3]="Jason";
//		arName[4]="Johanson";
//		//arName[5]="J"  //Array Index Out of Bound 오류 발생
//		for(int i=0;i<arName.length;i++) {
//			String str=arName[i];
//			System.out.println(str);
//		}

		//ArrayList = Javascript:array() 길이의 제한이 없음
//		ArrayList<String> arName=new ArrayList<String>();
//		arName.add("John");
//		arName.add("James");
//		arName.add("Jacob");
//		arName.add("Jason");
//		arName.add("Johanson");
//		arName.add("Jefferson");
//		for(int i=0;i<arName.size();i++) {
//			String str=arName.get(i);
//			System.out.println(str);
//		}
//		arName.remove("James");  //특정 인덱스 제거
//		arName.remove(1);
//		arName.clear(); //인덱스 전체 제거
		
//		Scanner s=new Scanner(System.in);
//		ArrayList <String> arStudent=new ArrayList<String>();
//		String name=s.nextLine();
//		while(!name.equals("")) {
//			arStudent.add(name);
//			name=s.nextLine();
//		}
//		for(int i=0; i<arStudent.size();i++) {
//			System.out.println(arStudent.get(i));
//		}
		
//메뉴명 입력->arMenu에 추가
//가격 입력->arPrice에 추가
//		Scanner s=new Scanner(System.in);
//		ArrayList <String> arMenu=new ArrayList<String>();
//		ArrayList <Integer> arPrice=new ArrayList<Integer>();
//		String Menu=s.nextLine();
//		while(!Menu.equals("")) {
//			arMenu.add(Menu);
//			int Price=Integer.parseInt(s.nextLine());
//			arPrice.add(Price);
//			Menu=s.nextLine();			
//		}
//		for(int i=0; i<arMenu.size();i++) {
//			System.out.println(arMenu.get(i)+", "+arPrice.get(i));		
//		}

//학생이름 입력
//수학점수, 영어점수 입력
//학생이름이 빈문자열이면 exit
//학생이름, 수학점수, 영어점수
//수학점수 총점 평균 영어점수 총점 평균
//		Scanner s=new Scanner(System.in);
//		ArrayList <String> arName=new ArrayList<String>();
//		ArrayList <Integer> arMath=new ArrayList<Integer>();
//		ArrayList <Integer> arEnglish=new ArrayList<Integer>();
//		int mathtotal=0;
//		int engtotal=0;
//		int count=0;
//		String name=s.nextLine();
//		while(!name.equals("")) {			
//			arName.add(name);			
//			int math=Integer.parseInt(s.nextLine());
//			arMath.add(math);
//			mathtotal=mathtotal+math;
//			int english=Integer.parseInt(s.nextLine());
//			arEnglish.add(english);
//			engtotal=engtotal+english;
//			name=s.nextLine();
//			count++;
//		}
//		for(int i=0; i<arName.size(); i++) {
//			System.out.println(arName.get(i)+", "+arMath.get(i)+", "+arEnglish.get(i));
//		}
//		System.out.println("수학 총점: "+mathtotal+" "+"수학 평균: "+mathtotal/count);
//		System.out.println("영어 총점: "+engtotal+" "+"영어 평균: "+engtotal/count);
//		
		//2차원 배열
//		int ar[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//		System.out.println(ar[1][2]);  //6
//		
//		//advanced for
//		for(String name : arName) {
//			System.out.println(name);
//		}
//		
//		System.out.println(Week.THURSDAY);
//		Week today=null;
//		Calendar cal=Calendar.getInstance();
//		int week=cal.get(Calendar.DAY_OF_WEEK);

		
		//method
//		Scanner s=new Scanner(System.in);
//		int x=Integer.parseInt(s.nextLine());
//		int y=Integer.parseInt(s.nextLine());
//		int z=plus(x,y);  //반환값이 있는 method를 받음
//		System.out.println(z);
//		minus(x,y);
//	}
//		//반환값이 있는 method
//		static int plus(int a, int b) {
//			int c=a+b;
//			return c;
//		
//	}
//		//반환값이 없는  method
//		static void minus(int a, int b) {
//			int c=a-b;
//			System.out.println(c);
//			return;  //생략 가능
//		}
		
		//재귀함수(Recursive function):함수 내부에서 자기자신을 다시 부르는 함수
//		Scanner s=new Scanner(System.in);
//		int x=Integer.parseInt(s.nextLine());
//		int w=factorial(x);
//		System.out.println(w+" is the factorial of "+x);
//		w=accum(x);
//		System.out.println(w+" is the accmulation of "+x);
		
		/*최대공약수, 최소공배수*/
//		Scanner s = new Scanner(System.in);
//		int a,b,tmp,num0=0;
//		a = Integer.parseInt(s.nextLine());
//		b = Integer.parseInt(s.nextLine());
//		if(b<a) {
//			tmp=a;
//			a=b;
//			b=tmp;
//		}
//		for(int i = a;i>1;i--) {
//			if(a%i==0&&b%i==0) {
//				if(num0==0) {
//					num0 = i;
//				}
//				else {
//					num0=num0*i;
//				}
//				a=a/i;
//				b=b/i;
//				System.out.println(a+","+b+","+i);
//			}
//		}
//		System.out.println("최대공약수: "+num0);
//		System.out.println("최소공배수: "+(num0*a*b));
		/* 피라미드*/
		Scanner s=new Scanner(System.in);
		int x=Integer.parseInt(s.nextLine());
		int i,j;
		for(j=0;j<(x*2);j++) {
			if(j<=x) {
				for(i=0;i<j;i++) {
					System.out.print("*");
				}
			}
			else if(j>x) {
				for(i=(x*2)-j;i>0;i--) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
	}
//	static int factorial(int a) {
//		if(a==1) return 1;
//		else {
//			return a*factorial(a-1);
//		}	 
//	}
//	
//	static int accum(int a) {
//		if(a==1) return 1;
//		else {
//			return a+accum(a-1);
//		}
//	}
} 


