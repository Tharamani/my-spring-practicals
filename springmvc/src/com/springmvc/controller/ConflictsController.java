/**
 * 
 */
package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Thara
 *@creation date & time: 11 Nov 2020 12:44:28 pm
 */
@Controller
public class ConflictsController {

	@RequestMapping("/showForm")  
	public String displayForm() {
		return "helloworld-form";
	}
}
