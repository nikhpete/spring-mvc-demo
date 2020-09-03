package com.nick.springdemo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nick.springdemo.mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	Student student;

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student std) {
		
		System.out.println(std.getFirstName()+" "+std.getLastName());
		
		System.out.println(std.getCountry());
		
		System.out.println(std.getFavLang());
		
		return "student-confirm";
	}
}
