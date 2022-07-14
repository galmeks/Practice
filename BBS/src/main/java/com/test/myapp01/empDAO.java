package com.test.myapp01;

import java.util.ArrayList;

public class empDAO {
	iEmployee iemp;
	public empDAO(iEmployee ie) {
		this.iemp=ie;
	}
	public MemberInfo getMemberInfo(int eid) {
		Member memberList = iemp.getMember(eid);
		ArrayList<empDTO> empList=iemp.listEmployees();
		int n = iemp.countMember(eid);
		MemberInfo mi = new MemberInfo();
		mi.m=memberList;
		mi.mDTO = empList;
		mi.n = n;
		return mi;
	}
}
