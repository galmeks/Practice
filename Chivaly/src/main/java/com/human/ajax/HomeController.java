package com.human.ajax;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@RequestMapping("/list")
	public String domenu() {
		return "menu";
	}
	@ResponseBody
	@RequestMapping(value="/menulist",produces="application/text;charset=utf-8")
	public String doList() {
		iMenu menu = sqlSession.getMapper(iMenu.class);
		ArrayList<Menu> arMenu = menu.getList();
		JSONArray ja=new JSONArray();
		for(int i=0;i<arMenu.size();i++) {
			Menu mdto = arMenu.get(i);
			JSONObject jo = new JSONObject();
			jo.put("seqno",mdto.getSeqno());
			jo.put("name",mdto.getName());
			jo.put("price",mdto.getPrice());
			ja.add(jo);
		}
		System.out.println(ja.toJSONString());
		return ja.toJSONString();
	}
	@ResponseBody
	@RequestMapping(value="/addnew",produces="application/text;charset=utf-8")
	public String doAdd(HttpServletRequest req) {
		System.out.println("addIn");
		iMenu menu = sqlSession.getMapper(iMenu.class);
		String name=req.getParameter("name");
		int price=Integer.parseInt(req.getParameter("price"));
		int reccount=menu.addMenu(name,price);
		return Integer.toString(reccount);
	}
	@ResponseBody
	@RequestMapping(value="/delete",produces="application/text;charset=utf-8")
	public String doDel(@RequestParam("seqno") int seqno) {
		iMenu menu = sqlSession.getMapper(iMenu.class);
		int reccount=menu.remove(seqno);
		return Integer.toString(reccount);
	}
	@ResponseBody
	@RequestMapping(value="/update",produces="application/text;charset=utf-8")
	public String doMod(@RequestParam("seqno") int seqno,@RequestParam("name") String name,@RequestParam("price") int price) {
		iMenu menu = sqlSession.getMapper(iMenu.class);
		int reccount=menu.modify(name,price,seqno);
		return Integer.toString(reccount);
	}
	
}
