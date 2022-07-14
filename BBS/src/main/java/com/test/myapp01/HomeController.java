package com.test.myapp01;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private SqlSession sqlSession;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String doList(Model model) {
		iEmployee emp=sqlSession.getMapper(iEmployee.class);
		ArrayList<empDTO> empList=emp.listEmployees();
		//System.out.println("emplist count:"+empList.size());
		model.addAttribute("list",empList);
		return "list";
	}
	@RequestMapping(value = "/menulist", method = RequestMethod.GET)
	public String doMenuList(Model model) {
		iMenu menu=sqlSession.getMapper(iMenu.class);
		ArrayList<Menu> menuList=menu.getList();
		//System.out.println("menu count:"+menuList.size());
		model.addAttribute("ml",menuList);
		return "menulist";
	}
	@RequestMapping(value = "/find/{eid}", method = RequestMethod.GET)
	public String doFind(@PathVariable int eid,Model model) {
//		iEmployee emp=sqlSession.getMapper(iEmployee.class);
//		Member memberList = emp.getMember(eid);
//		ArrayList<empDTO> empList=emp.listEmployees();
//		int n = emp.countMember(eid);
		iEmployee emp=sqlSession.getMapper(iEmployee.class);
		empDAO minfo = new empDAO(emp);
		MemberInfo mi = minfo.getMemberInfo(eid);
		model.addAttribute("mi",mi);
		return "find";
	}
	@RequestMapping("/addnew")
	public String doAddNew(Model model) {
		iMenu m = sqlSession.getMapper(iMenu.class);
		ArrayList<Menu> ml=m.getList();
		model.addAttribute("ml",ml);
		return "addnew";
	}
	@RequestMapping(value = "/addMenu", method = RequestMethod.POST)
	public String doAddMenu(@RequestParam String mname,@RequestParam int price) {
		iMenu m = sqlSession.getMapper(iMenu.class);
		m.insert(mname, price);
		return "redirect:/addnew";
	}
	@RequestMapping("/signup")
	public String doSignUp(Model model) {
		iAddMember iam = sqlSession.getMapper(iAddMember.class);
		ArrayList<t_Member> mlist=iam.listM();
		model.addAttribute("list",mlist);
		return "signup";
	}
	@RequestMapping(value = "/addmember", method = RequestMethod.POST)
	public String doAddMember(@RequestParam String uid,@RequestParam String pwd
			,@RequestParam String uname,@RequestParam String mobile) {
		iAddMember iam = sqlSession.getMapper(iAddMember.class);
		iam.insert(uid,pwd,uname,mobile);
		return "redirect:/signup";
	}
	@RequestMapping(value = "/delete/{seqno}")
	public String doDelete(@PathVariable String seqno) {
		iMenu m = sqlSession.getMapper(iMenu.class);
		m.delete(Integer.parseInt(seqno));
		return "redirect:/addnew";
	}
	@RequestMapping("/view")
	public String doView(@RequestParam int seqno,Model model) {
		iMenu m = sqlSession.getMapper(iMenu.class);
		Menu mdto=m.viewMenu(seqno);
		model.addAttribute("mdto",mdto);
		return "/view";
	}
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String doUpdate(HttpServletRequest req,Model model) {
		iMenu m = sqlSession.getMapper(iMenu.class);
		String name=req.getParameter("name");
		int price=Integer.parseInt(req.getParameter("price"));
		int seqno=Integer.parseInt(req.getParameter("seqno"));
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("seqno:"+seqno);
		m.updateMenu(name, price, seqno);
		return "redirect:/addnew";
	}
	
}
