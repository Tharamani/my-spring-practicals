/**
 * 
 */
package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.pojo.Customer;

/**
 * @author Thara
 * @creation date & time: 13 Nov 2020 1:28:51 pm
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model pModel) {

		Customer customer = new Customer();
		pModel.addAttribute("customer", customer);
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {

		System.out.println("Last name: |" + customer.getLastName() + "|");
		System.out.println("Free Passes: |" + customer.getFreePasses() + "|");
		System.out.println("Postal Code: |" + customer.getPostalCode() + "|");
		System.out.println("Binding result: " + bindingResult);
		System.out.println("\n\n\n\n");
		
		if (bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}

	// add an initbinder...to convert trim input string
	// remove leading and trailing whitespace
	// resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, editor);
	}
}
