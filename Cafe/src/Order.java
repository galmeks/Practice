import java.util.ArrayList;

public class Order {
	Order(){
		this.arMenu = new ArrayList<String>();
		this.arQty = new ArrayList<Integer>();
		this.arTotal = new ArrayList<Integer>();
	}
	private ArrayList<String> arMenu;
	private ArrayList<Integer> arQty;
	private ArrayList<Integer> arTotal;
	
	public String getArMenu(int i) {
		return this.arMenu.get(i);
	}
	public void setArMenu(String str) {
		this.arMenu.add(str);
	}
	public int getArQty(int i) {
		return this.arQty.get(i);
	}
	public void setArQty(int qty) {
		this.arQty.add(qty);
	}
	public int getArTotal(int i) {
		return this.arTotal.get(i);
	}
	public void setArTotal(int total) {
		this.arTotal.add(total);
	}
	
	int display(){
		int nTotal = 0;
		for(int i =0;i<this.arMenu.size();i++) {
			System.out.println(getArMenu(i)+", x"
					+getArQty(i)+", "
					+getArTotal(i));
			nTotal = nTotal +getArTotal(i);
		}
		this.arMenu = new ArrayList<String>();
		this.arQty = new ArrayList<Integer>();
		this.arTotal = new ArrayList<Integer>();
		return nTotal;
	}
	void addOrder(String name, int qty, int total) {
		setArMenu(name);
		setArQty(qty);
		setArTotal(total);
	}
}
