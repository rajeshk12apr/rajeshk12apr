package com.TracxCRM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TracxCRM.entity.Lead;
import com.TracxCRM.service.LeadService;

@Controller
public class LeadController2 {
	@Autowired
	private LeadService leadService;

	@GetMapping("/home")
	public String viewLeadpage() {
		return "home";

	}
	@GetMapping("/Lead")
	public String viewLead() {
		return "Lead";
	}

	@RequestMapping("/leadRegister")
	public String savedLeadDB(@ModelAttribute("lead") Lead lead) {
		//System.out.println(lead);
		leadService.saveLeadData(lead);
		return "Lead";

	}

}
