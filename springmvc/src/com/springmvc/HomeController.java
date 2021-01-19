/**
 * 
 */
package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Thara
 * @creation date & time: 9 Nov 2020 10:01:29 pm step 1: create controller class
 */
@Controller
public class HomeController {

	/**
	 * step2:define controller method step3:add request mapping to controller method
	 * step4:return view name step5:develop view page
	 */
	@RequestMapping("/")
	public String showHomePage() {

		return "home-page";
	}
}
