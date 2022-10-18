package com.marketing_app_1search_lead.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.marketing_app_1search_lead.DTO.LeadData;

@Service
public class LeadDataServiceImpl implements LeadDataService {

	@Override
	public LeadData getLeadData(long id) {
		
		RestTemplate rest = new RestTemplate();
		LeadData lead = rest.getForObject("http://localhost:8080/api/viewleads/led/"+id, LeadData.class);
		return lead;
	}

}
