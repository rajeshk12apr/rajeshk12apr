package com.TracxCRM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TracxCRM.entity.Lead;
import com.TracxCRM.reposatory.LeadReposatory;

@Service
public class LeadServiceImp implements LeadService {
	
	@Autowired
	private LeadReposatory leadRepo;

	@Override
	public void saveLeadData(Lead lead) {
		leadRepo.save(lead);

	}

}
