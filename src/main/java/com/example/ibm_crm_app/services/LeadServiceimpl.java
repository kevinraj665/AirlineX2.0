package com.example.ibm_crm_app.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ibm_crm_app.entity.Lead;
import com.example.ibm_crm_app.repository.LeadRepository;
@Service
public class LeadServiceimpl implements LeadService {
	@Autowired
	private LeadRepository LeadRepo;

	@Override
	public void saveLeaddata(Lead lead) {
		// TODO Auto-generated method stub
		LeadRepo.save(lead);
	}

	@Override
	public List<Lead> listAllLeadsData(Lead lead) {
		List<Lead> leads = LeadRepo.findAll();
		
		return leads;
	
		
	}

	@Override
	public void deleteleadbyId(long id) {
		LeadRepo.deleteById(id);
		
	}

	@Override
	public Lead updateleadbyId(long id) {
		Optional<Lead> findById = LeadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
 
}

