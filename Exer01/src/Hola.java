
import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
//		int i=10, j=5, x=0;
//		if(i<j) {
//			x=1;
//		} else {
//			x=j;
//		}
//		//���׿����ڷ� �ٲٸ�==> x=(i<j)?i:j;
//		
//		if(i<j) {
//			x=i;
//		} else if(i>j) {
//			x=j;
//		} else { //i==j
//			x=0;
//		}
//		//���׿�����==> x=(i<j)?i:((i>j)?j:0);
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

		//�Է�
			//Scanner s=new Scanner(System.in);
			
//			String answer=s.nextLine();
//			System.out.println("answer is "+answer);
//			answer=s.nextLine();
//			System.out.println("answer is "+answer);
			
			//���ڿ��� ���ڷ� : Integer.parseInt()
//			int age=Integer.parseInt(s.nextLine());
//			System.out.println("age is "+age);
			
			//������ ���
//			int dan=Integer.parseInt(s.nextLine());
//			int a,b,c,d;
//			a=b=c=d=dan; //dan���� d�� ���� ��  dan->d->c->b->a
			
//			System.out.println(dan+"x"+1+"="+(dan*1));
//			System.out.println(dan+"x"+2+"="+(dan*2));
//			System.out.println(dan+"x"+3+"="+(dan*3));
//			System.out.println(dan+"x"+4+"="+(dan*4));
//			System.out.println(dan+"x"+5+"="+(dan*5));
//			System.out.println(dan+"x"+6+"="+(dan*6));
//			System.out.println(dan+"x"+7+"="+(dan*7));
//			System.out.println(dan+"x"+8+"="+(dan*8));
//			System.out.println(dan+"x"+9+"="+(dan*9));

			//if��
//			int x=Integer.parseInt(s.nextLine());
//			if(x>10) {
//				System.out.println("�Է��� ���� 10���� Ů�ϴ�");
//			}else if(x>5) {
//				System.out.println("�Է��� ���� 5�� 10������ �����Դϴ�");
//			} else {
//				System.out.println("�Է��� ���� 5���� �۽��ϴ�");
//			}
//			//switch��
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
			//while��
//			Scanner s=new Scanner(System.in);
//			int x=Integer.parseInt(s.nextLine());
//			while(x>0) {
//				System.out.println(x);
//				x--;
//			}
//1.���� �Է¹޴´�
//2.1���� �� ������ �����հ踦 ���
//3.�����հ� ���
//		Scanner s=new Scanner(System.in);
//		int x=Integer.parseInt(s.nextLine());
//		int sum=0;
//		int i=1;
//		while(i<=x) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println(sum);
		
//1.��1�� �Է¹޴´�.
//2.��2�� �Է¹޴´�.
//3.��1���� ��2������ �԰踦 ���Ѵ�.
//4.�����հ踦 ����Ѵ�.
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

  //while �� �� ���� ���
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
		
		
		//for��
//		Scanner s=new Scanner(System.in);
//		for(int i=0;i<n;i++) {
//			
//		}
		
		//do while��  //������ �����̿��� �ּ� �ѹ��� �����
//		Scanner s=new Scanner(System.in);
//		do {
//			
//		} while();
		
//������ 2~9�� ���
//		Scanner s=new Scanner(System.in);
//		int i,j=1;
//		for(i=2;i<10;i++) {
//			for(j=1;j<10;j++) {
//				System.out.println(i+"x"+j+"="+(i*j));
//			}
//		}
		
//1000������ �Ҽ� ã��. for�� ��ø ���
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
		
		//�ٸ� Ǯ��
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
		
//1000������ �Ǻ���ġ����
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
		//�迭  *�迭�� ���̰� ������.
//		int ar[]={10,15,40,64};  //�迭���� & �ʱⰪ ����  
//        int[] ar={10,15,40,64};
//        int[] ar;  //���� �� ���� ����
//        int[] ar=null; //���� ����
//        ar=new int[] {10,15,20,35,74,99};
//        //ar.length �ڵ�����
//        
//        //String[] arName= {"John","James","Jacob","Jason"};
//        float[] arReal= {3.14f, 1.74f, 12.5f, 12};
        
//      String[] arName=new String[5];  //5�� �迭�� ����
//		arName[0]="John";
//		arName[1]="James";
//		arName[2]="Jacob";
//		arName[3]="Jason";
//		arName[4]="Johanson";
//		//arName[5]="J"  //Array Index Out of Bound ���� �߻�
//		for(int i=0;i<arName.length;i++) {
//			String str=arName[i];
//			System.out.println(str);
//		}

		//ArrayList = Javascript:array() ������ ������ ����
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
//		arName.remove("James");  //Ư�� �ε��� ����
//		arName.remove(1);
//		arName.clear(); //�ε��� ��ü ����
		
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
		
//�޴��� �Է�->arMenu�� �߰�
//���� �Է�->arPrice�� �߰�
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

//�л��̸� �Է�
//��������, �������� �Է�
//�л��̸��� ���ڿ��̸� exit
//�л��̸�, ��������, ��������
//�������� ���� ��� �������� ���� ���
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
//		System.out.println("���� ����: "+mathtotal+" "+"���� ���: "+mathtotal/count);
//		System.out.println("���� ����: "+engtotal+" "+"���� ���: "+engtotal/count);
//		
		//2���� �迭
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
//		int z=plus(x,y);  //��ȯ���� �ִ� method�� ����
//		System.out.println(z);
//		minus(x,y);
//	}
//		//��ȯ���� �ִ� method
//		static int plus(int a, int b) {
//			int c=a+b;
//			return c;
//		
//	}
//		//��ȯ���� ����  method
//		static void minus(int a, int b) {
//			int c=a-b;
//			System.out.println(c);
//			return;  //���� ����
//		}
		
		//����Լ�(Recursive function):�Լ� ���ο��� �ڱ��ڽ��� �ٽ� �θ��� �Լ�
//		Scanner s=new Scanner(System.in);
//		int x=Integer.parseInt(s.nextLine());
//		int w=factorial(x);
//		System.out.println(w+" is the factorial of "+x);
//		w=accum(x);
//		System.out.println(w+" is the accmulation of "+x);
		
		/*�ִ�����, �ּҰ����*/
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
//		System.out.println("�ִ�����: "+num0);
//		System.out.println("�ּҰ����: "+(num0*a*b));
		/* �Ƕ�̵�*/
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


