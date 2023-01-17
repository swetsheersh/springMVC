package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(path = "/home", method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name","Swet Sheersh");
		model.addAttribute("id",60309);
		
		List<String>friends=new ArrayList<String>();
		friends.add("Saurav");
		friends.add("Sagar");
		friends.add("gaurav");
		
		model.addAttribute("l1", friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		//creating ModelAndView object
		ModelAndView modelAndView=new ModelAndView();
		//Setting the Data 
		modelAndView.addObject("name","Sahil");
		modelAndView.addObject("rollno",1256848);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		//list
		List<Integer>list=new LinkedList<Integer>();
		list.add(12);
		list.add(56);
		list.add(98);
		modelAndView.addObject("marks",list);
		//Setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}
