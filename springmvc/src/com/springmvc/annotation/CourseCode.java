/**
 * 
 */
package com.springmvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import com.springmvc.validator.CourseCodeConstraintValidator;

/**
 * @author Thara
 *@creation date & time: 18 Nov 2020 5:51:14 pm
 */
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface CourseCode {

	//define default course code 
	public String[] value() default {"LUV"};

	//define default error message
	public String message() default "must start with LUV";

	//define default group
	public Class<?>[] groups() default {};

	// define default payloads
	public Class<? extends Payload>[] payload() default {};
}
