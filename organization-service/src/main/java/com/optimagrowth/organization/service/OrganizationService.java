package com.optimagrowth.organization.service;

import java.net.http.HttpHeaders;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;



@Service
public class OrganizationService {
	
	private static final Logger logger = LoggerFactory.getLogger(OrganizationService.class);


	public String getinfo(){
    	return "Info in Org Service: ";
    }


}