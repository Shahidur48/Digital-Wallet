package com.optimagrowth.user.controller;

import com.optimagrowth.user.service.LicenseService;
import com.optimagrowth.user.utils.UserContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="license")
public class LicenseController {
	
	private static final Logger logger = LoggerFactory.getLogger(LicenseController.class);

	@Autowired
	private LicenseService licenseService;

	@RequestMapping(value="/licenseservice",method = RequestMethod.GET)
	public String getinfo()  {
		logger.debug("LicenseServiceController Correlation id: {}", UserContextHolder.getContext().getCorrelationId());
		return licenseService.getinfo();
	}

	@RequestMapping(value="/license_org_service",method = RequestMethod.GET)
	public String getorginfo()  {
		logger.debug("LicenseServiceController Correlation id: {}", UserContextHolder.getContext().getCorrelationId());
		return licenseService.getlicensinfo();
	}

}
