package com.nick.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldCOntroller {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVerTwo")
	public String shoutOutName(HttpServletRequest req, Model model) {

		String name = req.getParameter("studentName");

		model.addAttribute("message", "Yo! " +name.toUpperCase());
		return "helloworldVerTwo";
	}

}
