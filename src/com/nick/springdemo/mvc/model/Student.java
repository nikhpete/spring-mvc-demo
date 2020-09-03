package com.nick.springdemo.mvc.model;

import java.util.LinkedHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Component
public class Student {

	private String firstName;

	private String lastName;

	private String country;

	private String favLang;
	
	private String[] opSys;

	private LinkedHashMap<String, String> countryOptions;

	private LinkedHashMap<String, String> favLangOptions;

	@PostConstruct
	public void startUpStuff() {
		this.countryOptions = new LinkedHashMap<>();
		this.countryOptions.put("BR", "Brazil");
		this.countryOptions.put("FR", "France");
		this.countryOptions.put("DE", "Germany");
		this.countryOptions.put("IN", "India");
		this.countryOptions.put("US", "USA");

		this.favLangOptions  = new LinkedHashMap<>();
		this.favLangOptions.put("Java", "Java");
		this.favLangOptions.put("C#", "C#");
		this.favLangOptions.put("PHP", "PHP");
	}

}
