package com.nick.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode coursePrefix) {
		this.coursePrefix = coursePrefix.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		
		boolean result = code.startsWith(coursePrefix);
		
		return result;
	}

}
