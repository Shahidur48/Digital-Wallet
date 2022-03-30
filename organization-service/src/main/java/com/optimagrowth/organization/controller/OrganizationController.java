package com.optimagrowth.organization.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.optimagrowth.organization.service.OrganizationService;


@RestController
@RequestMapping(value="org")
public class OrganizationController {

    @Autowired
    private OrganizationService org;

    @RequestMapping(value="/orgservice",method = RequestMethod.GET)
    public String getorginfo(@RequestHeader("custom-header") String ch) {
        String ret_msg="[Header Received from Licensing Service]: (" + ch + ")";
        return ret_msg;


    }


}
