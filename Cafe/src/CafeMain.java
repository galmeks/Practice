import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		Order odr = new Order();
		Sales sls = new Sales();
		
		try {
			menu.build();
			System.out.println("�۾��� �����Ͻÿ� [o:�ֹ��ޱ�,s:���⺸��,m:�޴�����,x:���α׷� ����]");
			String str=s.nextLine();
			while(!str.equals("x")) {
				if(str.equals("s")) {
					sls.display();
				}
				else if(str.equals("o")) {
					menu.disp();
		//			menu.build2();
		//			menu.display();
					
					System.out.println("�޴���ȣ�� �����Ͻÿ�");
					str=s.nextLine();
					while(!str.equals("")) {
						int ndx=Integer.parseInt(str)-1;
		//				odr.addName(menu.arName.get(ndx));
						System.out.println("������ �Է��Ͻÿ�.");
						str=s.nextLine();
		//				odr.addQty(Integer.parseInt(str));
						int net = menu.getArPrice(ndx);
						odr.addOrder(menu.getArName(ndx),Integer.parseInt(str) , net*Integer.parseInt(str));
		//				odr.addTotal(net*Integer.parseInt(str));
						menu.disp();
						System.out.println("�޴���ȣ�� �����Ͻÿ�");
						str=s.nextLine();
					}
					int x=odr.display();
					System.out.println("����Ϲ�ȣ�� �Է��Ͻÿ�");
					String mobile =s.nextLine();
					sls.add(mobile, x);
				}
				else if(str.equals("m")) {
					menu.disp();
					System.out.println("�۾��� �����Ͻÿ� [c:�űԸ޴��߰�,u:�����޴�����,d:�����޴�����,x:�޴����� ����]");
					str=s.nextLine();
					while(!str.equals("x")) {
						if(str.equals("c")) {
							menu.addMenu();
						}
						else if(str.equals("u")) {
							menu.updateMenu();
						}
						else if(str.equals("d")) {
							menu.delMenu();
						}
						menu.disp();
						System.out.println("�۾��� �����Ͻÿ� [c:�űԸ޴��߰�,u:�����޴�����,d:�����޴�����,x:�޴����� ����]");
						str=s.nextLine();
					}
				}
				System.out.println("�۾��� �����Ͻÿ� [o:�ֹ��ޱ�,s:���⺸��,m:�޴�����,x:���α׷� ����]");
				str=s.nextLine();
			}
	
		s.close();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("�޴��� ������ �ʰ��߽��ϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("�ùٸ� ���� �Է����ּ���.");
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}
