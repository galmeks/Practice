package com.test.myapp01;

import java.util.ArrayList;

public interface iEmployee {
	ArrayList<empDTO> listEmployees();
	void addEmployee(int e_id,String e_name,int m_id);
	void removeEmployee(int e_id);
	Member getMember(int eid);
	int countMember(int mid);
}
