package com.springmvc.controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.dao.EmpDao;
import com.springmvc.dao.UserDao;
import com.springmvc.entity.Emp;
import com.springmvc.entity.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	private EmpDao empDao;
	
	@Autowired
	private UserDao userDao;

	@RequestMapping("/home")
	public String home(Model m) {
		List<Emp> list = empDao.getAll();

		m.addAttribute("empList", list);
		return "home";
	}

	@RequestMapping("/addEmp")
	public String addEmp() {
		return "addEmp";
	}

	@RequestMapping(path = "/createEmp", method = RequestMethod.POST)
	public String createEmp(@ModelAttribute Emp emp, HttpSession session) {

		int i = empDao.saveEmp(emp);
		System.out.println(emp);
		session.setAttribute("msg", "Registration Successfully");
		return "redirect:/addEmp";
	}

	@RequestMapping(path = "/editemp/{id}")
	public String editEmp(@PathVariable("id") int id, Model m) {
		Emp emp = empDao.getEmpById(id);
		m.addAttribute("emp", emp);
		return "edit_emp";
	}

	@RequestMapping(path = "/updateEmp", method = RequestMethod.POST)
	public String updateEmp(@ModelAttribute Emp emp, HttpSession session) {
		empDao.update(emp);

		session.setAttribute("msg", "Update Successfully");

		return "redirect:/home";
	}

	@RequestMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable("id") int id, HttpSession session) {
		empDao.deleteEmp(id);
		session.setAttribute("msg", "Deleted Successfully");

		return "redirect:/home";
	}

	@RequestMapping("/register")
	public String registerPage() {

		return "register";
	}

	@RequestMapping("/login")
	public String loginPage() {

		return "login";
	}

	
	@RequestMapping(path="/createUser",method = RequestMethod.POST)
	public String register(@ModelAttribute User user,HttpSession session)
	{
		userDao.saveUser(user);
		System.out.println(user);
		session.setAttribute("msg", "User Registration Successfully");
		return "redirect:/register";
	}
	
	@RequestMapping(path="/userlogin",method = RequestMethod.POST)
	public String login(@RequestParam("email") String em,@RequestParam("password") String pwd,HttpSession session)
	{
		User user=userDao.login(em, pwd);
		if(user!=null)
		{
			session.setAttribute("loginuser", user);
			return "profile";
		}
		else
		{
			session.setAttribute("msg", "invalid email and password");
			return "redirect:/login";
		}
	
	}
	
	@RequestMapping("/myProfile")
	public String myProfile()
	{
		
		
		return "profile";
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,HttpSession session)
	{
		session=request.getSession();
		session.removeAttribute("loginuser");
		session.setAttribute("msg", "LogOut Successfully");
		
		return "login";
	}
	
}
