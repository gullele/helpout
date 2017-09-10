package com.solutionladder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * A home Controller, when the API is hit without specific endpoint
 * 
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(value={"", "/", "/home"}, method=RequestMethod.GET)
	public @ResponseBody String home() {
		return "It feels good to helpout!";
	}
}
