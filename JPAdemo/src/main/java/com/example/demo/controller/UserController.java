package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;

@Controller
public class UserController {

	@Autowired
	UserDAO userdao;
	@GetMapping("index")
	public String user() {
		return "index.jsp";
	}
	
	@GetMapping("addUser")
	public String adduser(User user) {
		userdao.save(user);
		return "index.jsp";
	}
	
	@GetMapping("getUser")
	public ModelAndView getuser(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("ShowUser.jsp");
		User user = userdao.findById(id).orElse(new User());
		mv.addObject(user);
		return mv;
	}
	@GetMapping("deleteUser")
	public ModelAndView deleteuser(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("DeleteUser.jsp");
		User user = userdao.findById(id).orElse(new User());
		userdao.deleteById(id);
		mv.addObject(user);
		return mv;
	}
	@GetMapping("updateUser")
	public ModelAndView updateUser(User user) {
		ModelAndView mv = new ModelAndView("updateUser.jsp");
		 user = userdao.findById(user.getID()).orElse(new User());
		userdao.deleteById(user.getID());
		mv.addObject(user);
		return mv;}
}
