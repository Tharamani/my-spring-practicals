/**
 * 
 */
package com.springmvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.springmvc.annotation.CourseCode;

/**
 * @author Thara
 * @creation date & time: 18 Nov 2020 5:53:07 pm
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	// private String coursePrefix;

	// multiple validation string in one annotation
	private String[] coursePrefixes;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
//		coursePrefix = constraintAnnotation.value();
		coursePrefixes = constraintAnnotation.value();
	}

	/*
	 * @Override public boolean isValid(String formData, ConstraintValidatorContext
	 * helperContext) {
	 * 
	 * boolean result;
	 * 
	 * if(formData!=null) { result = formData.startsWith(coursePrefix); }else {
	 * 
	 * result = true; } return result; }
	 */

	// multiple validation string in one annotation
	@Override
	public boolean isValid(String formData, ConstraintValidatorContext helperContext) {

		boolean result = false;
		System.out.println("CourseCodeConstraintValidator: inside isValid , formData " + formData);
		// loop thru course prefixes

		// check to see if code matches any of the course prefixes
		if (formData != null) {
		
			for (String coursePrefix : coursePrefixes) {
				
				result = formData.startsWith(coursePrefix);

				// if we found a match then break out of the loop

				if (result) {
					System.out.println("CourseCodeConstraintValidator: inside isValid , coursePrefix " + coursePrefix);
					break;
				}

			}

		} else {
			System.out.println("CourseCodeConstraintValidator: inside isValid , else result " + result);
			result = true;
		}
		return result;
	}

}
