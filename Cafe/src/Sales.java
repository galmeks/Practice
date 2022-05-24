import java.util.ArrayList;

public class Sales {
	Sales(){
		this.mobile = new ArrayList<String>();
		this.sales = new ArrayList<Integer>();
	}
	ArrayList<String> mobile;
	ArrayList<Integer> sales;
	public String getMobile(int i) {
		return this.mobile.get(i);
	}

	public void setMobile(String str) {
		this.mobile.add(str);
	}

	public int getSales(int i) {
		return this.sales.get(i);
	}

	public void setSales(int sales) {
		this.sales.add(sales);
	}
	int mobileSize() {
		return this.mobile.size();
	}

	void add(String str,int sales) {
		if(!str.equals("")) {
			setMobile(str);
		}
		else {
			setMobile("-");
		}
		setSales(sales);
	}
	
	void display(){
		for(int i=0;i<mobileSize();i++) {
			System.out.println("모바일번호: "+getMobile(i)+
					", 매출: "+getSales(i));
			
		}
		
		
	}
	
}
