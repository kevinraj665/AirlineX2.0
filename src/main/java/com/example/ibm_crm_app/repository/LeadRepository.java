package com.example.ibm_crm_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ibm_crm_app.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
