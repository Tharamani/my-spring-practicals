/**
 * 
 */
package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Thara
 * @creation date & time: 10 Nov 2020 2:07:36 pm
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	/**
	 * need a controller method to show the initial HTML form
	 */
	@RequestMapping("/showForm")  
	public String showForm() {
		return "helloworld-form";
	}

	/**
	 * need a controller method to process the HTML form
	 */
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	/**
	 * new controller method to read form data and add data to the model
	 */
	@RequestMapping("/processFormDataVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read request parameter from the HTML form
		String name = request.getParameter("studentName");

		// convert the data to all upperCase
		name = name.toUpperCase();

		// create message
		String result = "Yo! " + name;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
	
	/**
	 * new controller method to read form data using @RequestParam annotation
	 */
	@RequestMapping("/processFormDataVersionThree")
	public String processFormDataVersionThree(@RequestParam("studentName")String name, Model model) {
		
		// read request parameter from the HTML form
		//String name = request.getParameter("studentName");

		// convert the data to all upperCase
		name = name.toUpperCase();

		// create message
		String result = "Yo! " + name;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
