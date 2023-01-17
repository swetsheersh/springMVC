package springmvc.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.orm.dao.StudentDao;

import springmvc.controller.dao.UserDao;
import springmvc.controller.dao.UserDaoImpl;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commondata(Model m) {
		m.addAttribute("header1", "Registration");
		m.addAttribute("content", "Fill out the Form");
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	/*
	@RequestMapping(path = "/processform" ,method=RequestMethod.POST)
	public String process(@RequestParam(name="email",required=true)String email ,
			@RequestParam("userName") String userName ,
			@RequestParam("password")String password,
			Model model) {
	
		/*System.out.println("Email id is :"+email);
		System.out.println("User Name :"+userName);
		System.out.println("Password :"+password);*/
		/*
		 * model.addAttribute("email", email); model.addAttribute("userName", userName);
		 * model.addAttribute("password", password);
		 *//*
		User user =new User();
		user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(password);
		System.out.println(user);
		model.addAttribute("user", user);
		
		return "success";
	}*/
	
	@RequestMapping(path = "/processform" ,method=RequestMethod.POST)
	public String process(@ModelAttribute User user , Model model) {
	
		System.out.println(user);
		//model.addAttribute("user", user); //no need to add model annotation will do automatically
		
		//AbstractApplicationContext context=new ClassPathXmlApplicationContext("springmvc/controller/dao/config.xml");
		//UserDao impl=(UserDao)context.getBean("impl");
		//int r=(int)impl.insert(user);
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
    	int createduser=(int)this.userService.createuser(user);
    	model.addAttribute("msg","user created with id :"+createduser);
		return "success";
	}
	
}
