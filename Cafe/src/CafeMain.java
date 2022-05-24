import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		Order odr = new Order();
		Sales sls = new Sales();
		
		try {
			menu.build();
			System.out.println("작업을 선택하시오 [o:주문받기,s:매출보기,m:메뉴관리,x:프로그램 종료]");
			String str=s.nextLine();
			while(!str.equals("x")) {
				if(str.equals("s")) {
					sls.display();
				}
				else if(str.equals("o")) {
					menu.disp();
		//			menu.build2();
		//			menu.display();
					
					System.out.println("메뉴번호를 선택하시오");
					str=s.nextLine();
					while(!str.equals("")) {
						int ndx=Integer.parseInt(str)-1;
		//				odr.addName(menu.arName.get(ndx));
						System.out.println("수량을 입력하시오.");
						str=s.nextLine();
		//				odr.addQty(Integer.parseInt(str));
						int net = menu.getArPrice(ndx);
						odr.addOrder(menu.getArName(ndx),Integer.parseInt(str) , net*Integer.parseInt(str));
		//				odr.addTotal(net*Integer.parseInt(str));
						menu.disp();
						System.out.println("메뉴번호를 선택하시오");
						str=s.nextLine();
					}
					int x=odr.display();
					System.out.println("모바일번호를 입력하시오");
					String mobile =s.nextLine();
					sls.add(mobile, x);
				}
				else if(str.equals("m")) {
					menu.disp();
					System.out.println("작업을 선택하시오 [c:신규메뉴추가,u:기존메뉴수정,d:기존메뉴삭제,x:메뉴관리 종료]");
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
						System.out.println("작업을 선택하시오 [c:신규메뉴추가,u:기존메뉴수정,d:기존메뉴삭제,x:메뉴관리 종료]");
						str=s.nextLine();
					}
				}
				System.out.println("작업을 선택하시오 [o:주문받기,s:매출보기,m:메뉴관리,x:프로그램 종료]");
				str=s.nextLine();
			}
	
		s.close();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("메뉴의 범위를 초과했습니다.");
		} catch(NumberFormatException e) {
			System.out.println("올바른 값을 입력해주세요.");
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}
