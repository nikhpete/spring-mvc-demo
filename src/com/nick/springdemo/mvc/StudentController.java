package com.nick.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nick.springdemo.mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("student", new Student());
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student std) {
		
		System.out.println(std.getFirstName()+" "+std.getLastName());
		
		return "student-confirm";
	}
}
