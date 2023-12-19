package com.example.demo.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

	@RequestMapping("/")
	String myfun()
	{
		return "home.jsp";
	}
}
