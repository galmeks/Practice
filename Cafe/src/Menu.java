import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Menu(){
		this.arName = new ArrayList<String>();
		this.arPrice = new ArrayList<Integer>();
	
	}
	ArrayList<String> arName;
	ArrayList<Integer> arPrice;
	

	public void delMenu() {
		Scanner s = new Scanner(System.in);
		this.disp();
		System.out.println("삭제할 메뉴의 번호를 입력해 주세요.");
		int m_num =Integer.parseInt(s.nextLine());
		arName.remove(m_num-1);
		arPrice.remove(m_num-1);
		return;
	}
	public String getArName(int i) {
		return arName.get(i);
	}
	public void setArName(String n) {
		this.arName.add(n);
		return;
	}
	public void updateMenu() {
		Scanner s = new Scanner(System.in);
		this.disp();
		System.out.println("수정할 메뉴 번호를 입력하세요.");
		int m_num =Integer.parseInt(s.nextLine());
		System.out.println("새 메뉴명을 입력하세요.");
		String m_newName =s.nextLine();
		this.arName.set(m_num-1, m_newName);
		System.out.println("새 가격을 입력하세요.");
		int m_newPrice =Integer.parseInt(s.nextLine());
		this.arPrice.set(m_num-1, m_newPrice);
		return;
	}
	public int getArPrice(int i) {
		return arPrice.get(i);
	}
	public void setArPrice(int p) {
		this.arPrice.add(p);
		return;
	}
	public void addMenu() {
		Scanner s = new Scanner(System.in);
		System.out.println("새 메뉴명을 입력하세요.");
		String m_name =s.nextLine();
		this.setArName(m_name);
		System.out.println("가격을 입력하세요.");
		String m_price =s.nextLine();
		this.setArPrice(Integer.parseInt(m_price));
	}
	public void updateArPrice(int i,Integer n) {
		this.arPrice.set(i, n);
		return;
	}
	public int nameSize() {
		return arName.size();
	}
	public void disp(){
		for(int i=0;i<nameSize();i++) {
			System.out.println((i+1)+"."+getArName(i)+", "+
					getArPrice(i));
		}
	}
	public void build() {
		try {
			File f= new File("d:\\temp\\menu.txt");
			FileReader fr= new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null) {
				String[] ar=line.split(",");
				setArName(ar[0]);
				setArPrice(Integer.parseInt(ar[1]));
				line=br.readLine();
				}
			br.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
		}
//		Scanner s = new Scanner(System.in);
//		System.out.println("메뉴명을 입력하시오");
//		String str = s.nextLine();
//		while(!str.equals("")) {
//			this.add(str);
//			System.out.println("가격을 입력하시오");
//			int price = Integer.parseInt(s.nextLine());
//			this.add(price);
//			System.out.println("메뉴명을 입력하시오");
//			str = s.nextLine();
//		}
	}
	
}
