package com.human.ajax;

import java.util.ArrayList;

public interface iMenu {
	ArrayList<Menu> getList();
	int addMenu(String name,int price);
	int remove(int seqno);
	int modify(String name,int price,int seqno);
}
