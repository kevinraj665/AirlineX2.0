package com.example.ibm_crm_app.services;

import java.util.List;


import com.example.ibm_crm_app.entity.Lead;

public interface LeadService {
	public void saveLeaddata(Lead lead);

	public List<Lead> listAllLeadsData(Lead lead);

	public void deleteleadbyId(long id);

	public Lead updateleadbyId(long id);



}
