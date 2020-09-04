package com.nick.springdemo.mvc.validation;

import java.util.Objects;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode code) {
		this.coursePrefix = code.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		
		if(Objects.isNull(code)) {
			return true;
		}
		boolean result = false;
		
		for(String prefix: coursePrefix) {
			result = code.startsWith(prefix);
			if(result) break;
		}
		
		return result;
	}

}
