package com.test.myapp01;

import java.util.ArrayList;

public interface iMenu {
	ArrayList<Menu> getList();
	void insert(String name,int val);
	void delete(int seqno);
	Menu viewMenu(int seqno);
	void updateMenu(String name,int price,int seqno);
}
