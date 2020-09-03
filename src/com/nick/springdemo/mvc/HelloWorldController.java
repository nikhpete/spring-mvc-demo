package com.nick.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

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

	@RequestMapping("/processFormVerThree")
	public String processFormVerThree(@RequestParam("studentName") String name, Model model) {

		model.addAttribute("message", "Hey my friend! " +name.toLowerCase());
		return "helloworldVerTwo";
	}

}
