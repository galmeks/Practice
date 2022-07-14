package com.test.myapp01;

import java.util.ArrayList;

public interface iAddMember {
	void insert(String uid,String pwd,String uname,String mobile);
	ArrayList<t_Member> listM();
}
