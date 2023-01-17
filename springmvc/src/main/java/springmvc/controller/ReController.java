package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
//redirect on another webpage inside or outside
@Controller
public class ReController {
	//redirect prefix
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is first handler");
		return "redirect:/enjoy";
	}
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is second handler[enjoy]");
		return "contact";
	}
	//RedirectView
	@RequestMapping("/three")
	public RedirectView three() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
}
