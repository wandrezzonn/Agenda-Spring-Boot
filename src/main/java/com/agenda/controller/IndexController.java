package com.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
	
	@RequestMapping(value = "/")
	public String home() {
		System.out.println("Chegou no metodo home()");
		return "index";
	}

}
