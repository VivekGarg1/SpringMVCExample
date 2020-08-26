package com.home.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

	/*
	 * @RequestMapping(value = "/user/{userName}/{age}", method = RequestMethod.GET)
	 * public ModelAndView greet(@PathVariable("userName") String userName,
	 * @PathVariable("age") Integer age,
	 * @RequestParam("country") String country) { return new
	 * ModelAndView("welcomePage", "welcomeMessage",
	 * "Hello "+userName+" your age is "+age+"and you are from "+country); }
	 */
	
	@RequestMapping(value = "/user/{userName}/{age}", method = RequestMethod.GET)
	public ModelAndView greet(@PathVariable Map<String,String> pathMaps,
			@RequestParam("country") String country) {
		String userName=pathMaps.get("userName");
		int age=Integer.parseInt(pathMaps.get("age"));
		return new ModelAndView("welcomePage", "welcomeMessage", "Hello "+userName+" your age is "+age+"and you are from "+country);
	} 
}
