package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {
	@GetMapping("index")
	
	public ModelAndView  index( UserDetails ud) {
	/*	HttpSession session = request.getSession();
		String s = request.getParameter("name");
		
		*/
		ModelAndView mv = new ModelAndView();
		mv.addObject("details",ud);
		mv.setViewName("index");
		
		
		
	//	session.setAttribute("username", uname);
		return mv;
		//return "index";
	}

}
