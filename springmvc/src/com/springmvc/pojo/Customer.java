/**
 * 
 */
package com.springmvc.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springmvc.annotation.CourseCode;

/**
 * @author Thara
 *@creation date & time: 13 Nov 2020 12:59:11 pm
 */
public class Customer {

	private String firstName;
	
	//add field required validation rules for last name string field
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
    
	//add validation rules for freepasses field
	@Min(value=0,message="must be greater than or equal to zero")
	@Max(value=10,message="must be lesser than or equal to 10")
	@NotNull(message="is required")
	private Integer freePasses;
	//private int freePasses; error type conversion string to int, so use wrapper classes Integer instead of int
	//add field required validation rules for freePasses integer field
	
	
	//add validation rules for postalCode field
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 digits/chars")
	private String postalCode;
	
	// add validation rules for coursecode
	//@CourseCode(value = "LUV", message = "must starts with LUV")
	//@CourseCode//reads default value and message from annotation
	//@CourseCode(value = "TOPS", message = "must starts with TOPS")
	//private String courseCode;
	
	// multiple validation string in one annotation
	 @CourseCode(value={"TOPS", "LUV"}, message="must start with TOPS or LUV")
	//@CourseCode//reads default value and message from annotation
	private String courseCode;
	
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the freePasses
	 */
	public Integer getFreePasses() {
		return freePasses;
	}
	/**
	 * @param freePasses the freePasses to set
	 */
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
