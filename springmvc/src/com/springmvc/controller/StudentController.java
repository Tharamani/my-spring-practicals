/**
 * 
 */
package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.pojo.Student;

/**
 * @author Thara
 * @creation date & time: 11 Nov 2020 4:04:41 pm
 */
@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model pModel) {
		
		System.out.println("pModel :" + pModel.getAttribute("student"));
		System.out.println("pModel getFirstName:" + pModel.getAttribute("firstName"));
		System.out.println("pModel getLastName:" + pModel.getAttribute("lastName"));
		
		// create a student object
		Student rStudent = new Student();

		// add student object to the model
		pModel.addAttribute("student", rStudent);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student pStudent) {
		//log input data
		System.out.println("pStudent getFirstName:" + pStudent.getFirstName());
		System.out.println("pStudent getLastName:" + pStudent.getLastName());
		System.out.println("pStudent getCountry:" + pStudent.getCountry());
		System.out.println("pStudent getFavoriteLanguage:" + pStudent.getFavoriteLanguage());
		System.out.println("pStudent getOperatingSystems:" + pStudent.getOperatingSystems().length);
		return "student-confirmation";

	}
}
