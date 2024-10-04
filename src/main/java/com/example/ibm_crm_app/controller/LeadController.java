package com.example.ibm_crm_app.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ibm_crm_app.entity.Lead;
import com.example.ibm_crm_app.services.LeadService;


@Controller
public class LeadController {
	@Autowired
	private LeadService leadserv;
	@RequestMapping("/view")
	public String view() {
		return "view";
	}
	@RequestMapping ("/savelead")
	public String saveLead(Lead lead) {
		leadserv.saveLeaddata(lead);
		return "view";
	}
	@RequestMapping("/listall")
	public String listAll(Lead lead,Model model) {
		List<Lead> leads = leadserv.listAllLeadsData(lead);
		model.addAttribute("leads", leads);
		return "listall";
	
	}
	@RequestMapping("/deletelead")
	
	public String deletelead(@RequestParam("id")long id,Model model,Lead lead) {
		leadserv.deleteleadbyId(id);
		List<Lead> leads = leadserv.listAllLeadsData(lead);
		model.addAttribute("leads", leads);
		return "listall";
	}
	@RequestMapping("/updatepass")
	public String updateonelead(@RequestParam("id")long id,Model model) {
		    Lead lead = leadserv.updateleadbyId(id);
		model.addAttribute("lead", lead);
		return "updatelead";
		
	}
	

}
