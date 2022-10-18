package com.marketing_app_1search_lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing_app_1search_lead.DTO.LeadData;
import com.marketing_app_1search_lead.services.LeadDataService;

@Controller
public class SearchLeadController {
	
	@Autowired
	private LeadDataService srv;
	
	@RequestMapping("/viewSearchLead")
	public String viewSearchLead() {
		return "search_lead";
	}
	
	@RequestMapping("/searchId")
	public String searchLeadId(@RequestParam("id") long id, ModelMap map) {
		LeadData data = srv.getLeadData(id);
		map.addAttribute("data", data);
		return"view_search_Id";
	}

}
