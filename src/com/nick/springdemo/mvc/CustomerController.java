package com.nick.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nick.springdemo.mvc.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder wdb) {
		wdb.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	@RequestMapping("/showForm")
	public String showFrom(Model model) {
		model.addAttribute("customer", new Customer());
		return "cutoomer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer cst, BindingResult bndRst) {
		
		if(bndRst.hasErrors()) {
			return "cutoomer-form";
		}
		return "cutomer-confirm";
	}
}
