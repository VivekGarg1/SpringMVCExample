package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/domains")
public class DomainsController {

//	@RequestMapping(value = "/domain/{domainName}", method = RequestMethod.GET)
	    @RequestMapping(value = "/domain/{domainName:.+}", method = RequestMethod.GET)
	public ModelAndView greet(@PathVariable("domainName") String domain) {
		return new ModelAndView("welcomePage", "welcomeMessage", "Domain name is: "+domain);
	}
}
