package comspring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/site")
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		m.addAttribute("name","Sahuu");// it save in HttpServletRequest 
		// and we can access in home.jsp
		m.addAttribute("roll",28378);
		
		List<String> list = new ArrayList<>();
		list.add("suraj");
		list.add("rahul");
		list.add("shivam");
		m.addAttribute("list",list);
		return "home";
	}
	
	
	
	
	
	//@RequestMapping("/login")
	@RequestMapping(path="/login",method=RequestMethod.GET) // it is by default
	public ModelAndView login()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("Class","12th class");
		model.addObject("reg",2020201);
		
		model.setViewName("login");
		
		return model;
	}
	
	@RequestMapping(path="/register" , method=RequestMethod.POST) //it is used when we bring data from frontend to backend
	public String register()
	{
		return "";
	}

}
